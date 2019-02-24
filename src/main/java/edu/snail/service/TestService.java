package edu.snail.service;

import java.util.List;


import edu.snail.model.SysUser;

public interface TestService {
	public List<SysUser> findAllUser() throws Exception;
}
