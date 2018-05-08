package com.zhidisoft.crm.service;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zhidisoft.crm.entity.TbCrmCustomer;
import com.zhidisoft.crm.entity.TbCrmCustomerExample;
import com.zhidisoft.crm.entity.TbCrmCustomerExample.Criteria;
import com.zhidisoft.crm.mapper.TbCrmCustomerMapper;
import com.zhidisoft.crm.vo.CustomerUserNameVO;


@Service
@Transactional
public class TbCrmCustomerService {
	@Autowired
	TbCrmCustomerMapper  customerMapper;
	/**
	 * 鏌ヨ鎵?鏈?
	 * @return
	 */
	public List<TbCrmCustomer> findAll(){
		
		return customerMapper.selectByExample(new TbCrmCustomerExample());
	}
	
	/**
	 * 
	 * @param pageNum
	 *            浠?1寮?濮?
	 * @param pageSize
	 * @return
	 */
	public List<TbCrmCustomer> page(Integer pageNum, Integer pageSize, String searchText) {
		return customerMapper.findPage((pageNum - 1) * pageSize, pageNum * pageSize, searchText);
	}


	/**
	 * 鎬绘潯鏁?
	 * 
	 * @return
	 */
	public Long count(String searchText) {
		TbCrmCustomerExample example = new TbCrmCustomerExample();
		Criteria  c = example.createCriteria();
		if (StringUtils.isNotBlank(searchText)) {
			c.andNameLike("%" + searchText + "%");
		}
		return customerMapper.countByExample(example);
	}
	/**
	 * 閫氳繃ID鏌ヨ涓?鏉℃暟鎹?
	 * @param customerid
	 * @return
	 */
	public CustomerUserNameVO ByIdUsername(String customerid){
		return customerMapper.ByIdUsername(customerid);
	}
	/**
	 * 閫氳繃ID淇敼
	 * @param record
	 * @return
	 */
	public int  ByIdAllUpdate(TbCrmCustomer record){
		
		return customerMapper.updateByPrimaryKey(record);
	}
	/**
	 * 閫氳繃ID鍔ㄦ?佷慨鏀?
	 * @param record
	 * @return
	 */
	public int  ByIdUpdate(TbCrmCustomer record){
		
		return customerMapper.updateByPrimaryKeySelective(record);
	}
	/**
	 * 寰?customer瀛樹竴鏉℃暟鎹?
	 * @param record
	 * @return
	 */
	public int CustomerSave(TbCrmCustomer record){
		return customerMapper.insert(record);
	}



	//客户功能区域
	/**
	 * 自己封装的page
	 * 
	 * @param pageNum
	 * @param pageSize
	 * @param searchText
	 * @return
	 */
	public PageVO<TbCrmCustomer> findPage(Integer pageNum, Integer pageSize, String searchText) {
		PageVO<TbCrmCustomer> page = new PageVO<>();
		page.setList(customerMapper.findPage((pageNum - 1) * pageSize, pageNum * pageSize, searchText));
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
		TbCrmCustomerExample example = new TbCrmCustomerExample();
		Criteria c = example.createCriteria();
		if (StringUtils.isNotBlank(searchText)) {
			c.andNameLike("%" + searchText + "%");
		}
		return customerMapper.countByExample(example);
	}

	/**
	 * 添加数据
	 * @param crmCustomer
	 */
	public void save(TbCrmCustomer crmCustomer) {
		customerMapper.insertSelective(crmCustomer);
	}

	/**
	 * 批量删除
	 * @param ids
	 */
	public void deleteByIds(String[] ids) {
		for(String id : ids){
			customerMapper.deleteByPrimaryKey(id);
		}
		
	}

	/**
	 * 根据ID查询一条数据
	 * @param customerId
	 * @return
	 */
	public TbCrmCustomer findById(String customerId) {
		return customerMapper.selectByPrimaryKey(customerId);
	}

	/**
	 * 修改数据
	 * @param customer
	 */
	public void update(TbCrmCustomer customer) {
		customerMapper.updateByPrimaryKeySelective(customer);
	}
}
