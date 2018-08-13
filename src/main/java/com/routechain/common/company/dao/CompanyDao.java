package com.routechain.common.company.dao;

import java.util.List;

import com.routechain.common.company.vo.CompanyVo;


public interface CompanyDao {
	public boolean insertCompany(CompanyVo CompanyVo);
	public boolean updateCompany(CompanyVo CompanyVo);
	public boolean deleteCompany(CompanyVo CompanyVo);
	
	public CompanyVo showCompany(CompanyVo CompanyVo);
	public List<CompanyVo> listCompany(CompanyVo CompanyVo);
}
