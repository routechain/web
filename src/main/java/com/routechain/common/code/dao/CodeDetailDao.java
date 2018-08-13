package com.routechain.common.code.dao;

import java.util.List;

import com.routechain.common.code.vo.CodeDetailVo;

public interface CodeDetailDao {
	public boolean insertCodeDetailDetail(CodeDetailVo CodeDetailVo);
	public boolean updateCodeDetail(CodeDetailVo CodeDetailVo);
	public boolean deleteCodeDetail(CodeDetailVo CodeDetailVo);
	
	public CodeDetailVo showCodeDetail(CodeDetailVo CodeDetailVo);
	public List<CodeDetailVo> listCodeDetail(CodeDetailVo CodeDetailVo);

}
