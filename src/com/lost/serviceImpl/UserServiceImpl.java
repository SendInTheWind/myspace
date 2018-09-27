package com.lost.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lost.dao.UserDao;
import com.lost.javabean.pojo.User;
import com.lost.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;
	@Override
	public int addUser(User user) {
		//判断数据库中是否有该User
		int i=userDao.queryUserByUserPhone(user.getUserPhone());
		if(i==0){
			return userDao.addUser(user);
		}
		return 0;
	}

	@Override
	public int deleteUser(int userId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteVastUser(int[] userIds) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateUser(User user) {
		return userDao.updateUser(user);
	}

	@Override
	public List<User> queryAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User queryUserById(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User queryUserLost(int userId) {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * 验证用户输入账号和密码是否正确
	 * @作者 GF
	 * @参数 user
	 * @返回值 User
	 * */
	@Override
	public User queryUser(User user) {
		return userDao.queryUser(user);
	}


}

















