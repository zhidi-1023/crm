package com.zhidisoft.crm.service;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zhidisoft.crm.entity.TbCrmProduct;
import com.zhidisoft.crm.entity.TbCrmProductCategory;
import com.zhidisoft.crm.entity.TbCrmProductCategoryExample;
import com.zhidisoft.crm.entity.TbCrmProductCategoryExample.Criteria;
import com.zhidisoft.crm.mapper.TbCrmProductCategoryMapper;
import com.zhidisoft.crm.util.DateUtil;

@Service
@Transactional
public class TbCrmProductCategoryService {
	
	
	TbCrmProductCategoryExample   example = new TbCrmProductCategoryExample();
	@Autowired
	TbCrmProductCategoryMapper   categoryMapper;
	
	/**
	 * 根据产品工具用户名查询
	 * 
	 * @param name
	 * @return
	 */

	public TbCrmProductCategory findByCategoryName(String name) {
		example.createCriteria().andCategoryidEqualTo(name);
		List<TbCrmProductCategory> cateLista = categoryMapper.selectByExample(example);
		return cateLista != null && cateLista.size() > 0 ? cateLista.get(0) : null;

	}

	/**
	 * 分页查询
	 * 
	 * @param pageNum
	 *            从1开始
	 * @param pageSize
	 * @return TODO jdk8日期处理
	 */
	public List<TbCrmProductCategory> page(Integer pageNum, Integer pageSize, String searchText, String where1) {

		Date now = null, first = null;
		if ("week".equals(where1)) {
			now = new Date();
			first = DateUtil.firstDayOfWeek();

		}
		return categoryMapper.findPage((pageNum - 1) * pageSize, pageNum * pageSize, searchText, where1, first, now);
	}

	/**
	 * 总条数
	 * 
	 * @return
	 */
	public Long count(String searchText) {
		TbCrmProductCategoryExample   example = new TbCrmProductCategoryExample();
		Criteria c = example.createCriteria();
		if (StringUtils.isNotBlank(searchText)) {
			c.andCategoryidLike("%" + searchText + "%");
		}
		return categoryMapper.countByExample(example);
	}

	/**
	 * 添加用户
	 * 
	 * @param systemuser
	 */
	public void save(TbCrmProductCategory category) {
		categoryMapper.insertSelective(category);

	}

	/**
	 * 根据id删除数据
	 * 
	 * @param id
	 */
	public void deleteById(String id) {
		categoryMapper.deleteByPrimaryKey(id);
	}

	/**
	 * 根据id批量删除
	 * 
	 * @param ids
	 */
	public void deleteByIds(String[] ids) {
		for (String id : ids) {
			categoryMapper.deleteByPrimaryKey(id);
		}
	}

	public TbCrmProductCategory findById(String categoryid) {
		return categoryMapper.selectByPrimaryKey(categoryid);

	}

	/**
	 * 修改用户
	 * 
	 * @param systemuser
	 */
	public void update(TbCrmProductCategory category) {
		categoryMapper.updateByPrimaryKeySelective(category);

	}
	
}
