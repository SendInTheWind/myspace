package com.lost.service;

import java.util.List;
import java.util.Map;

import com.lost.javabean.pojo.User;

public interface UserService {
	/**
	 * 增加用户
	 * @作者：GF
	 * @返回值： int
	 * @参数： User类型
	 * */
	public int addUser(User user);
	/**
	 * 根据用户ID删除用户
	 * @作者： GF
	 * @返回值 int
	 * @参数 userId
	 * */
	public int deleteUser(int userId);
	/**
	 * 批量删除用户
	 * @作者： GF
	 * @返回值 int
	 * @参数 int类型的 User的id数组
	 * */
	public int deleteVastUser(int[] userIds);
	/**
	 * 修改用户新消息
	 * @作者： GF
	 * @返回值 int
	 * @参数 User类型 ，无User中参数userLostList的值
	 * */
	public int updateUser(User user);
	/**
	 * 获取所有的用户
	 * @作者： GF
	 * @返回值:List<User>
	 * @参数：null
	 * */
	public List<User> queryAllUser();
	/**
	 * 根据ID获取用户，不获取User中参数userLostList的值
	 * @作者： GF
	 * @返回值 User
	 * @参数 userId
	 * */
	public User queryUserById(int userId);
	/**
	 * 根据ID获取用户，获取User中参数userLostList的值
	 * @作者： GF
	 * @返回值 User
	 * @参数 userId
	 * */
	public User queryUserLost(int userId);
	/**
	 * 验证用户输入账号和密码是否正确
	 * @作者 GF
	 * @参数 user
	 * @返回值 User
	 * */
	public User queryUser(User user);
	
}










