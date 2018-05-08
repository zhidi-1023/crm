package com.zhidisoft.crm.service;

import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.zhidisoft.crm.entity.TbSystemRole;
import com.zhidisoft.crm.entity.TbSystemRoleExample;
import com.zhidisoft.crm.entity.TbSystemRoleExample.Criteria;
import com.zhidisoft.crm.mapper.TbSystemRoleMapper;
import com.zhidisoft.crm.vo.PageVO;

@Service
@Transactional
public class TbSystemRoleService {

	@Autowired
	TbSystemRoleMapper roleMapper;

	// 查询角色总条数
	public Long count(String searchText) {
		TbSystemRoleExample example = new TbSystemRoleExample();
		Criteria cri = example.createCriteria();
		if (StringUtils.isNotBlank(searchText)) {
			cri.andRolenameLike("%" + searchText + "%");
		}
		return roleMapper.countByExample(example);
	}

	// 查询角色信息
	public PageVO<TbSystemRole> findRolesByPage(Integer pageNum, Integer pageSize, String searchText) {
		PageVO<TbSystemRole> pageVO = new PageVO<>();
		pageVO.setList(roleMapper.selectByPage((pageNum - 1) * pageSize, pageNum * pageSize, searchText));
		pageVO.setPageNum(pageNum);
		pageVO.setPageSize(pageSize);
		pageVO.setTotalCount(count(searchText));
		return pageVO;
	}

	// 添加角色信息
	public void save(TbSystemRole role) {
		roleMapper.insertSelective(role);
	}

	// 删除单条角色信息
	public void delete(String id) {
		roleMapper.deleteByPrimaryKey(id);
	}

	// 批量删角色信息
	public void deleteByIds(String[] ids) {
		for (String id : ids) {
			roleMapper.deleteByPrimaryKey(id);
		}
	}

	// 修改角色信息
	public void update(TbSystemRole role) {
		roleMapper.updateByPrimaryKeySelective(role);
	}

	// 查询角色信息
	public TbSystemRole selectById(String id) {
		return roleMapper.selectByPrimaryKey(id);
	}

	// 查询所有角色信息
	public List<TbSystemRole> selectAll() {
		return roleMapper.selectByExample(new TbSystemRoleExample());
	}

}
