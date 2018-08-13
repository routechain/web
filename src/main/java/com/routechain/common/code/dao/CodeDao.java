package com.routechain.common.code.dao;

import java.util.List;

import com.routechain.common.code.vo.CodeVo;

public interface CodeDao {
	public boolean insertCode(CodeVo codeVo);
	public boolean updateCode(CodeVo codeVo);
	public boolean deleteCode(CodeVo codeVo);
	
	public CodeVo showCode(CodeVo codeVo);
	public List<CodeVo> listCode(CodeVo codeVo);
}
