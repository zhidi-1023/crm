package com.zhidisoft.crm.service;

import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.StandardPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.zhidisoft.crm.entity.TbSystemUser;
import com.zhidisoft.crm.entity.TbSystemUserExample;
import com.zhidisoft.crm.entity.TbSystemUserExample.Criteria;
import com.zhidisoft.crm.mapper.TbSystemUserMapper;
import com.zhidisoft.crm.vo.PageVO;
import com.zhidisoft.crm.vo.UserRoleVO;

@Service
@Transactional
public class TbSystemUserService {

	@Autowired
	TbSystemUserMapper userMapper;

	@Autowired
	StandardPasswordEncoder pEncoder;

	// 查询用户的总条数
	public Long totalCount(String searchText) {
		TbSystemUserExample example = new TbSystemUserExample();
		Criteria cri = example.createCriteria();
		if (StringUtils.isNotBlank(searchText)) {
			cri.andUsernameLike("%" + searchText + "%");
		}
		return userMapper.countByExample(example);
	}

	// 查询展示的用户信息
	public PageVO<TbSystemUser> selectByPage(Integer pageNum, Integer pageSize, String searchText) {
		PageVO<TbSystemUser> page = new PageVO<>();
		page.setList(userMapper.selectByPage((pageNum - 1) * pageSize, pageNum * pageSize, searchText));
		page.setPageNum(pageNum);
		page.setPageSize(pageSize);
		page.setTotalCount(totalCount(searchText));
		return page;
	}

	// 添加用户信息
	public void save(TbSystemUser user) {
		String password = user.getPassword();
		user.setPassword(pEncoder.encode(password));
		userMapper.insertSelective(user);
	}

	// 修改用户信息
	public void update(TbSystemUser user) {
		userMapper.updateByPrimaryKeySelective(user);
	}

	// 删除单个用户
	public void deleteById(String id) {
		userMapper.deleteByPrimaryKey(id);
	}

	// 批量删除用户信息
	public void deleteByIds(String[] ids) {
		for (String id : ids) {
			userMapper.deleteByPrimaryKey(id);
		}
	}

	// 根据用户ID查询用户信息
	public TbSystemUser selectById(String userId) {
		return userMapper.selectByPrimaryKey(userId);
	}

	// 多表查询(用户表,角色表)
	public UserRoleVO selectRoleByUserId(String userId) {
		return userMapper.selectRoleByUserId(userId);
	}

	// 根据用户名查询用户信息
	public TbSystemUser selectUserByUsername(String username) {
		TbSystemUserExample example = new TbSystemUserExample();
		example.createCriteria().andUsernameEqualTo(username);
		List<TbSystemUser> users = userMapper.selectByExample(example);
		return users != null && users.size() > 0 ? users.get(0) : null;
	}

}
