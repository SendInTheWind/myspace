package com.lost.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lost.dao.TypeDao;
import com.lost.javabean.pojo.Type;
import com.lost.service.TypeService;

@Service
public class TypeServiceImpl implements TypeService{
	@Autowired 
	private TypeDao typeDao;
	
	@Override
	public int addType(String typeName) {
		return typeDao.addType(typeName);
	}

	@Override
	public int deleteType(int typeId) {
		return typeDao.deleteType(typeId);
	}

	@Override
	public int updateType(Type type) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Type queryTypeById(Type type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Type> queryAllType() {
		return typeDao.queryAllType();
	}

}
