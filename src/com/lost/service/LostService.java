package com.lost.service;

import java.util.List;
import java.util.Map;

import com.lost.javabean.pojo.Lost;

public interface LostService {
	/**
	 * 增加lost,在中间表中添加对应的数据
	 * @作者 Gf
	 * @参数 Map类型，有键userId和 Lost物品对象
	 * @返回值 int
	 * */
	public int addLost(int userId,Lost lost);
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
	 * @作者 GF
	 * @参数 lostId
	 * @返回值 int
	 * */
	public int queryLostType(int lostId);
	/**
	 * 根据指定的字段信息查询执行的信息
	 * @作者 GF
	 * @参数 lost
	 * @返回值 List<Lost>
	 * */
	public List<Lost> queryLost(Lost lost);
}








