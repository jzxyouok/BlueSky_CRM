package com.bluesky.bluesky_crm2.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bluesky.bluesky_crm2.model.Users;
import com.bluesky.bluesky_crm2.service.UserService;
import com.bluesky.bluesky_crm2.mapper.UserMapper;

/**
 * 用户服务接口实现类
 * 
 * @author 刘光岳
 * @date 2016年7月2日
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {

	/**
	 * 声明用户数据层
	 */
	@Autowired
	private UserMapper userMapper;

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	@Override
	public Users loging(String name, String pwd) {
		System.out.println("到达 userMapper");
		return userMapper.loging(name, pwd);
	}

	@Override
	public void addUser(Users users) {
		userMapper.addUser(users);
	}

	@Override
	public void editUser(Users users) {
		userMapper.editUser(users);
	}

	@Override
	public void modifyPwd(Users users) {
		userMapper.modifyPwd(users);
	}

}
