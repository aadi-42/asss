package com.cg.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.GroceryDao;

@Transactional
@Service
public class GroceryServiceImpl implements GroceryService {

	@Autowired
	private GroceryDao gDao;
	
	@Override
	public List<String> getCategoryList() {
		
		return gDao.getCategoryList();
	}

}
