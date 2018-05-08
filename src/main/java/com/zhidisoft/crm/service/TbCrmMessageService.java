package com.zhidisoft.crm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zhidisoft.crm.entity.TbCrmMessage;
import com.zhidisoft.crm.entity.TbCrmMessageExample;
import com.zhidisoft.crm.mapper.TbCrmMessageMapper;
import com.zhidisoft.crm.vo.MessListVO;
import com.zhidisoft.crm.vo.PageVO;

@Service
@Transactional
public class TbCrmMessageService {
	
		@Autowired
		TbCrmMessageMapper messageMapper;

		/**
		 * 分页查询
		 * @param pageNum
		 * @param pageSize
		 * @param searchText
		 * @return
		 */
		public PageVO<MessListVO> findPage(Integer pageNum, Integer pageSize, String searchText) {
			PageVO<MessListVO> page = new PageVO<MessListVO>();
			page.setList(messageMapper.findPage((pageNum - 1) * pageSize, pageNum * pageSize, searchText));
			page.setPageNum(pageNum);
			page.setPageSize(pageSize);
			page.setTotalCount(count(searchText));
			return page;
		}

		/**
		 * 总条数
		 * 
		 * @param searchText
		 * @return
		 */
		public Long count(String searchText) {
			return messageMapper.findcont(searchText);
		}

		/**
		 * 保存一条数据
		 * 
		 * @param function
		 */
		public void save(TbCrmMessage message) {
			messageMapper.insertSelective(message);
		}
		
		/**
		 * 根据id查询一条数据
		 * @param id
		 * @return
		 */
		public TbCrmMessage findMessById(String id) {
			return messageMapper.selectByPrimaryKey(id);
		}
		/**
		 * 修改一条数据
		 * @param role
		 */
		public void update(TbCrmMessage message){
			messageMapper.updateByPrimaryKeySelective(message);
		}
		/**
		 * 根据id删除一条数据
		 * @param id
		 */
		public void deleteById(String id){
			messageMapper.deleteByPrimaryKey(id);
		}
		/**
		 * 批量删除
		 * @param ids
		 */
		public void deleteByIds(String[] ids){
			for(String id:ids){
				messageMapper.deleteByPrimaryKey(id);
			}
		}

		public List<TbCrmMessage> findAll() {
			return messageMapper.selectByExample(new TbCrmMessageExample());
		}
		
		public MessListVO finduser(String messageid){
			return messageMapper.finduser(messageid);
			
		}

	}


