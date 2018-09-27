package com.lost.dao;

import java.util.List;

import com.lost.javabean.pojo.User;
/**
 * @作者：GF
 * */
public interface UserDao {
	/**
	 * 增加用户
	 * @返回值： int
	 * @参数： User类型
	 * */
	public int addUser(User user);
	/**
	 * 根据用户ID删除用户
	 * @返回值 int
	 * @参数 userId
	 * */
	public int deleteUser(int userId);
	/**
	 * 批量删除用户
	 * @返回值 int
	 * @参数 int类型的 User的id数组
	 * */
	public int deleteVastUser(int[] userIds);
	/**
	 * 修改用户新消息
	 * @返回值 int
	 * @参数 User类型 ，无User中参数userLostList的值
	 * */
	public int updateUser(User user);
	/**
	 * 获取所有的用户
	 * @返回值:List<User>
	 * @参数：null
	 * */
	public List<User> queryAllUser();
	/**
	 * 根据ID获取用户，不获取User中参数userLostList的值
	 * @返回值 User
	 * @参数 userId
	 * */
	public User queryUserById(int userId);
	/**
	 * 根据ID获取用户，获取User中参数userLostList的值
	 * @返回值 User
	 * @参数 userId
	 * */
	public User queryUserLost(int userId);
	/**
	 * 查询数据库中是否有user
	 * @返回值 int
	 * @参数 user
	 * */
	public User queryUser(User user);
	/**
	 * 判断数据库中是否有相同userPhone的账号
	 * */
	public int queryUserByUserPhone(String userPhone);
}














