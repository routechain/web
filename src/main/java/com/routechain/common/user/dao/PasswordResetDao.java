package com.routechain.common.user.dao;

import java.util.List;

import com.routechain.common.user.vo.PasswordResetVo;


public interface PasswordResetDao {
	public boolean insertPasswordReset(PasswordResetVo PasswordResetVo);
	public boolean updatePasswordReset(PasswordResetVo PasswordResetVo);
	public boolean deletePasswordReset(PasswordResetVo PasswordResetVo);
	
	public PasswordResetVo showPasswordReset(PasswordResetVo PasswordResetVo);
	public List<PasswordResetVo> listPasswordReset(PasswordResetVo PasswordResetVo);
}
