package com.lost.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.lost.javabean.pojo.Lost;
import com.lost.javabean.pojo.Type;

public interface LostDao {
	/**
	 * 增加lost,在中间表中添加对应的数据
	 * @作者 Gf
	 * @参数 Map类型，有键userId和 Lost物品对象
	 * @返回值 int
	 * */
	public int addLost(Lost lost);
	/**
	 * 批量删除lost
	 * @作者GF
	 * @参数 Map类型，有键userId和int数组中年存储的值为lostId
	 * */
	public int deleteLost(Map<String,Object> map);
	/**
	 * 修改丢失物品
	 * @作者 GF
	 * @参数 Lost
	 * @返回值 int
	 * */
	public int updateLost(Lost lost);
	/**
	 * 查询所有的丢失物品
	 * @param lostJudge 
	 * @作者 GF
	 * @参数 null
	 * @返回值 List<Lost>
	 * */
	public List<Lost> queryAllLost(int lostJudge);
	
	/**
	 * 根据lostId查询lost 无lostTypeList的值
	 * @作者 GF
	 * @参数 lostId
	 * @返回值 int
	 * */
	public Lost queryLostById(int lostId);
	/**
	 * 根据lostId查询lost 有lostTypeList的值
	 * @参数 lostId
	 * @返回值 int
	 * */
	public int queryLostType(int lostId);
	/**
	 * 根据指定的字段信息查询lost的信息
	 * @参数 lost
	 * @返回值 List<Lost>
	 * */
	public Lost queryLost(Lost lost);
	/**
	 * 添加中间表信息
	 * @参数 lId uId
	 * @返回值 int
	 * */
	public int addUserLost(@Param("uId")int uId, @Param("lId")int lId);
	/**
	 * 调价LostType表信息
	 * */
	public int addLostType(@Param("lId")int lostId, @Param("lostTypeList")List<Type> lostTypeList);
	/**
	 * 删除userLost关联表
	 * */
	public int deleteUserLost(int lostId);
	/**
	 * 根据lostId删除LostType关联表
	 * */
	public int deleteLostType(int lostId);
	/**
	 * 删除lost
	 * @参数 lostId
	 * */
	public int deleteLostById(int lostId);
	

}








