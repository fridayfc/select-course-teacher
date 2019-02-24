package edu.snail.mapper;

import java.util.List;

import edu.snail.model.SysUser;

public interface SysUserMapper {
	public List<SysUser> selectAllUser() throws Exception;
}
