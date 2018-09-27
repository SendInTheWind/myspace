package com.lost.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lost.dao.LostDao;
import com.lost.javabean.pojo.Lost;
import com.lost.service.LostService;

@Service
public class LostServiceImpl implements LostService{
	@Autowired
	private LostDao lostDao;
	@Override
	public int addLost(int userId,Lost lost) {
		//添加lost
		int succes=lostDao.addLost(lost);
		//获取有id的lost
		Lost dbLost=lostDao.queryLost(lost);
		System.out.println(lost.getLostId());
		
		//添加用户和丢失物品的关联表
		int successUserLost=lostDao.addUserLost(userId,dbLost.getLostId());
		//添加lost与类型表的关联表
		int successLostType=lostDao.addLostType(dbLost.getLostId(),lost.getLostTypeList());
		return 0;
	}

	@Override
	public int deleteLost(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return 0;
	}
	/**
	 * 修改传入的lost
	 * */
	@Override
	public int updateLost(Lost lost) {
		//1.修改lost
		int updateLost = lostDao.updateLost(lost);
		//2.删除关联表lostType
		int deleteLostTypeByLostId = lostDao.deleteLostType(lost.getLostId());
		//3.新增关联
		int addLostType = lostDao.addLostType(lost.getLostId(), lost.getLostTypeList());
		return addLostType;
	}
	/**
	 * 查询所有丢失的物品
	 * @param i 
	 * */
	@Override
	public List<Lost> queryAllLost(int lostJudge) {
		return lostDao.queryAllLost(lostJudge);
	}

	@Override
	public Lost queryLostById(int lostId) {
		return lostDao.queryLostById(lostId);
	}

	@Override
	public int queryLostType(int lostId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Lost> queryLost(Lost lost) {
		// TODO Auto-generated method stub
		return null;
	}

	public int deleteLostById(int lostId) {
		//删除userLost关联表
		int successUserLost=lostDao.deleteUserLost(lostId);
		//删除LostType关联表
		int successLostType=lostDao.deleteLostType(lostId);
		//删除lost
		int successLost=lostDao.deleteLostById(lostId);
		return successLost;
	}


}









