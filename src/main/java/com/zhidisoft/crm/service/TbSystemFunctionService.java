package com.zhidisoft.crm.service;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.zhidisoft.crm.entity.TbSystemFunction;
import com.zhidisoft.crm.entity.TbSystemFunctionExample;
import com.zhidisoft.crm.entity.TbSystemFunctionExample.Criteria;
import com.zhidisoft.crm.mapper.TbSystemFunctionMapper;
import com.zhidisoft.crm.vo.PageVO;

@Service
@Transactional
public class TbSystemFunctionService {

	@Autowired
	TbSystemFunctionMapper functionMapper;

	public Long count(String searchText) {

		TbSystemFunctionExample example = new TbSystemFunctionExample();
		Criteria cri = example.createCriteria();
		if (StringUtils.isNotBlank(searchText)) {
			cri.andFunccodeLike("%" + searchText + "%");
		}
		return functionMapper.countByExample(example);
	}

	public PageVO<TbSystemFunction> findFunctionsByPage(Integer pageNum, Integer pageSize, String searchText) {
		PageVO<TbSystemFunction> pageVO = new PageVO<>();
		pageVO.setList(functionMapper.selectByPage((pageNum - 1) * pageSize, pageNum * pageSize, searchText));
		pageVO.setPageNum(pageNum);
		pageVO.setPageSize(pageSize);
		pageVO.setTotalCount(count(searchText));
		return pageVO;
	}

	public void save(TbSystemFunction function) {
		functionMapper.insert(function);
	}

	public void delete(String id) {
		functionMapper.deleteByPrimaryKey(id);
	}

	public void deleteByIds(String[] ids) {
		for (String id : ids) {
			functionMapper.deleteByPrimaryKey(id);
		}
	}

	public void update(TbSystemFunction function) {
		functionMapper.updateByPrimaryKeySelective(function);
	}

	public TbSystemFunction selectById(String id) {
		return functionMapper.selectByPrimaryKey(id);
	}

	public List<TbSystemFunction> selectAll() {
		return functionMapper.selectByExample(new TbSystemFunctionExample());
	}

	public List<TbSystemFunction> selectFuncsByUsername(String username) {
		return functionMapper.selectFuncsByUsername(username);
	}

}
