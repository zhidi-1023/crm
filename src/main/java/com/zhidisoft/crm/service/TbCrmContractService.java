package com.zhidisoft.crm.service;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zhidisoft.crm.entity.TbCrmContract;
import com.zhidisoft.crm.entity.TbCrmContractExample;
import com.zhidisoft.crm.entity.TbCrmContractExample.Criteria;
import com.zhidisoft.crm.entity.TbSystemUserExample;
import com.zhidisoft.crm.mapper.TbCrmContractMapper;
import com.zhidisoft.crm.vo.ContractVO;

@Service
@Transactional
public class TbCrmContractService {
	@Autowired
	TbCrmContractMapper contractMapper;
	/**
	 * 查询数据总数量
	 */
	public Long count() {
		return contractMapper.countByExample(new TbCrmContractExample());
	}
	/**
	 * 查询所有数据
	 * @return
	 */
	public List<TbCrmContract> findAll() {
		return contractMapper.selectByExample(new TbCrmContractExample());
	}
	/**
	 * 根据ID查询数据
	 */
	public TbCrmContract findContractById(String contractid) {
		return contractMapper.selectByPrimaryKey(contractid);
	}
	/**
	 * 插入数据
	 */
	public int insert(TbCrmContract contract) {
		return contractMapper.insertSelective(contract);
	}
	/**
	 * 删除数据
	 */
	public int delete(String contractid) {
		return contractMapper.deleteByPrimaryKey(contractid);
	}
	/**
	 * 修改数据
	 */
	public void update(TbCrmContract contract) {
		contractMapper.updateByPrimaryKeySelective(contract);
	}
	/**
	 * 分页查询
	 */
	public List<ContractVO> listPage(Integer pageNum,Integer pageSize,String searchText){
		return contractMapper.findPage((pageNum-1)*pageSize,pageNum*pageSize,searchText);
	}
	/**
	 * 条件查询出数据的总数量 
	 */
	public Long count(String searchText){
		TbCrmContractExample example = new TbCrmContractExample();
		Criteria criteria= example.createCriteria();
		if (StringUtils.isNotBlank(searchText)) {
			criteria.andContractidLike("%" + searchText + "%");
		}
		return contractMapper.countByExample(example);
	}
	public void deleteByIds(String[] idArr) {
		for (String id : idArr) {
			contractMapper.deleteByPrimaryKey(id);
		}
		
	}
	 
	
}
