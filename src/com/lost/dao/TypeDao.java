package com.lost.dao;

import java.util.List;

import com.lost.javabean.pojo.Type;

public interface TypeDao {/**
	 * 增加类型
	 * @参数： type
	 * @返回值：int
	 * */
	public int addType(String typeName);
	/**
	 * 删除类型，判断关联表中没有改类型，才能删除该类型，如果有该类型，则把所有lost的类型设置为另一种类型，然后删除该类型
	 * @参数typeId
	 * @返回值：int
	 * */
	public int deleteType(int typeId);
	/**
	 * 修改类型的名字
	 * @参数 typeId
	 * @返回值 int
	 * */
	public int updateType(Type type);

	/**
	 * 根据id查询类型名称
	 * @参数 typeId
	 * @返回值 Type
	 * */
	public Type queryTypeById(Type type);
	/**
	 * 查询所有的类型
	 * @参数 null
	 * @返回值 List<Type>
	 * */
	public List<Type> queryAllType();
	/**
	 * 根据lostId查询所有的lost
	 * @参数 lostId
	 * @返回值 List<Type>
	 * */
	public List<Type> queryTypeByLostId(int lostId);
}
