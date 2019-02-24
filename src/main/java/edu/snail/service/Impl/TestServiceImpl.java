package edu.snail.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.snail.mapper.SysUserMapper;
import edu.snail.model.SysUser;
import edu.snail.service.TestService;
@Service
public class TestServiceImpl implements TestService{
	@Autowired
	private SysUserMapper sysUserMapper;
	
	public List<SysUser> findAllUser() throws Exception {
		return sysUserMapper.selectAllUser();
	}
}
