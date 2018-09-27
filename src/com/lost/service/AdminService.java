package com.lost.service;

import java.util.List;
import java.util.Map;

import com.lost.javabean.pojo.Lost;
import com.lost.javabean.pojo.User;

public interface AdminService {
	/**
	 * 增加用户
	 * @作者 Gf 
	 * @参数 User
	 * @返回值
	 * */
	public int addUser(User user);
	/**
	 * 批量增加用户
	 * @作者 Gf 
	 * @参数 User
	 * @返回值
	 * */
	public int addVastUser(List<User> user);
	/**
	 * 删除用户
	 * @作者GF
	 * @参数  userId
	 * @返回值 int
	 * */
	public int deleteUser(int userId);
	/**
	 * 批量删除用户
	 * @作者GF
	 * @参数 int[] userIds 
	 * @返回值 int
	 * */
	public int deleteVastUser(int[] userIds);
	/**
	 * 修改用户信息
	 * @作者 GF
	 * @参数 userId
	 * @返回值 int
	 * */
	public int updateUser();
	/**
	 * 批量修改用户信息
	 * @作者 GF
	 * @参数 Map<String,Object> map
	 * @返回值 int
	 * */
	public int updateVastUser(Map<String,Object> map);
	/**
	 * 查询所有的用户信息
	 * @作者 GF
	 * @参数 null
	 * @返回值 List<User>
	 * */
	public List<User> queryAllUser();
	/**
	 * 根据字段查询用户
	 * @作者 GF
	 * @参数 user
	 * @返回值 List<User>
	 * */
	public List<User> queryUser(User user);
	
	/**
	 * 增加丢失物品信息
	 * @作者 GF
	 * @参数 Lost
	 * @返回值 int
	 * */
	public int addLost(Lost lost);
	/**
	 * 根据id删除丢失物品，删除对应的中间表
	 * @作者 GF
	 * @参数 lostId
	 * @返回值 int 
	 * */
	public int deleteLostById(int lostId);
	/**
	 * 根据id批量删除丢失物品,删除对应的中间表
	 * @作者 GF
	 * @参数 lostId
	 * @返回值 int 
	 * */
	public int deleteVastLostById(int[] lostIds);
	/**
	 * 根据id批量修改lost信息
	 * @作者 GF
	 * @参数 lostId
	 * @返回值 int 
	 * */
	public int updateLostById(Lost lost);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
