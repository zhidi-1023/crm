package com.zhidisoft.crm.service;

import java.util.Date;
import java.util.List;


import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zhidisoft.crm.entity.TbCrmTask;
import com.zhidisoft.crm.entity.TbCrmTaskExample;
import com.zhidisoft.crm.entity.TbCrmTaskExample.Criteria;
import com.zhidisoft.crm.mapper.TbCrmTaskMapper;
import com.zhidisoft.crm.util.DateUtil;
import com.zhidisoft.crm.vo.PageVO;
import com.zhidisoft.crm.vo.TaskStatusVO;
import com.zhidisoft.crm.vo.TbCrmTaskVO;

@Service
@Transactional
public class TbCrmTaskService {
	@Autowired
	TbCrmTaskMapper crmTaskMapper;
	 /**
	    * 根据id查询一条数据
	    * @param 
	    * @return
	    */
		public TbCrmTask findtaskById(String taskId){
			TbCrmTaskExample example=new TbCrmTaskExample();
			example.createCriteria().andAboutUserEqualTo(taskId);
			List<TbCrmTask> tasklist=crmTaskMapper.selectByExample(example);
			return tasklist !=null && tasklist.size()>0 ?tasklist.get(0) :null;
			
		}

		
		public Long count(String searchText) {
			TbCrmTaskExample example = new TbCrmTaskExample();
			Criteria c = example.createCriteria();
			if (StringUtils.isNotBlank(searchText)) {
				c.andAboutUserLike("%" + searchText + "%");
			}
			return crmTaskMapper.countByExample(example);
		}
		/**
		 * 自己封装的Page
		 * 
		 * @param pageNum
		 * @param pageSize
		 * @param searchText
		 * @param where1 
		 * @param username 
		 * @return
		 */
		public PageVO<TbCrmTaskVO> findPage(Integer pageNum, Integer pageSize, String searchText ,String status,String date1, String where1, String username) {
			PageVO<TbCrmTaskVO> page = new PageVO<>();
			Date now = null, first = null;
			if ("week".equals(date1)) {
				now = new Date();
				first = DateUtil.firstDayOfWeek();

			}
			
			page.setList(crmTaskMapper.findPage((pageNum - 1) * pageSize, pageNum * pageSize, searchText,status,date1,now,first,where1,username));
			page.setPageNum(pageNum);
			page.setPageSize(pageSize);
			page.setTotalCount(count(searchText));
			
			return page;
		}
		/**
		 * 自己封装的Page
		 * 
		 * @param pageNum
		 * @param pageSize
		 * @param searchText
		 * @return
		 */
		public PageVO<TaskStatusVO> listPage(Integer pageNum, Integer pageSize, String searchText) {
			PageVO<TaskStatusVO> page = new PageVO<>();
								
			page.setList(crmTaskMapper.listPage((pageNum - 1) * pageSize, pageNum * pageSize, searchText));
			page.setPageNum(pageNum);
			page.setPageSize(pageSize);
			page.setTotalCount(count(searchText));
			
			return page;
		}
		/**
		 * 添加
		 * @param tbcrmtask
		 */
		public void save(TbCrmTask tbcrmtask) {
			crmTaskMapper.insertSelective(tbcrmtask);
		}

		public void update(TbCrmTask tbcrmtask) {
			crmTaskMapper.updateByPrimaryKeySelective(tbcrmtask);
		}

		public void deleteById(String id) {
			crmTaskMapper.deleteByPrimaryKey(id);
		}

		public void deleteByIds(String[] ids) {
			for (String id : ids) {
				crmTaskMapper.deleteByPrimaryKey(id);
			}
		}
			
		public TbCrmTask findById(String Id) {
			return crmTaskMapper.selectByPrimaryKey(Id);
		}

		public List<TbCrmTask> findAll() {
			
			return crmTaskMapper.selectByExample(new TbCrmTaskExample());
		}

}
