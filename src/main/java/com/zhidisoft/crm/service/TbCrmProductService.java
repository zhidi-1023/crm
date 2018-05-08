package com.zhidisoft.crm.service;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zhidisoft.crm.entity.TbCrmProduct;
import com.zhidisoft.crm.entity.TbCrmProductExample;
import com.zhidisoft.crm.entity.TbCrmProductExample.Criteria;
import com.zhidisoft.crm.mapper.TbCrmProductMapper;
import com.zhidisoft.crm.util.DateUtil;
import com.zhidisoft.crm.vo.PCImagesVO;
import com.zhidisoft.crm.vo.ProductVO;

@Service
@Transactional
public class TbCrmProductService {

	TbCrmProductExample example = new TbCrmProductExample();
	@Autowired
	TbCrmProductMapper productMapper;

	/**
	 * 根据产品用户名查询
	 * 
	 * @param name
	 * @return
	 */

	public TbCrmProduct findByProductName(String name) {
		example.createCriteria().andProductidEqualTo(name);
		List<TbCrmProduct> proList = productMapper.selectByExample(example);
		return proList != null && proList.size() > 0 ? proList.get(0) : null;

	}

	/**
	 * 分页查询
	 * 
	 * @param pageNum
	 *            从1开始
	 * @param pageSize
	 * @return TODO jdk8日期处理
	 */
	public List<ProductVO> page(Integer pageNum, Integer pageSize, String searchText, String where1) {

		Date now = null, first = null;
		if ("week".equals(where1)) {
			now = new Date();
			first = DateUtil.firstDayOfWeek();

		}
		return productMapper.findPage((pageNum - 1) * pageSize, pageNum * pageSize, searchText, where1, first, now);
	}

	/**
	 * 总条数
	 * 
	 * @return
	 */
	public Long count(String searchText) {
		TbCrmProductExample example = new TbCrmProductExample();
		Criteria c = example.createCriteria();
		if (StringUtils.isNotBlank(searchText)) {
			c.andProductidLike("%" + searchText + "%");
		}
		return productMapper.countByExample(example);
	}

	/**
	 * 添加用户
	 * 
	 * @param systemuser
	 */
	public void save(TbCrmProduct product) {
		productMapper.insertSelective(product);

	}

	/**
	 * 根据id删除数据
	 * 
	 * @param id
	 */
	public void deleteById(String id) {
		productMapper.deleteByPrimaryKey(id);
	}

	/**
	 * 根据id批量删除
	 * 
	 * @param ids
	 */
	public void deleteByIds(String[] ids) {
		for (String id : ids) {
			productMapper.deleteByPrimaryKey(id);
		}
	}

	public PCImagesVO findVOById(String productId) {
		return productMapper.findVO(productId);

	}

	/**
	 * 修改用户
	 * 
	 * @param systemuser
	 */
	public void update(TbCrmProduct product) {
		productMapper.updateByPrimaryKeySelective(product);

	}

	public TbCrmProduct findById(String productId) {
		return productMapper.selectByPrimaryKey(productId);
	}
}
