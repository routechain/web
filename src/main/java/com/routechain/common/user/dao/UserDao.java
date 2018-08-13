package com.routechain.common.user.dao;

import java.util.List;

import com.routechain.common.user.vo.UserVo;


public interface UserDao {
	public boolean insertUser(UserVo UserVo);
	public boolean updateUser(UserVo UserVo);
	public boolean deleteUser(UserVo UserVo);
	
	public UserVo showUser(UserVo UserVo);
	public List<UserVo> listUser(UserVo UserVo);
}
