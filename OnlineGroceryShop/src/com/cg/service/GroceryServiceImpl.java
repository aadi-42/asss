package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

import com.cg.bean.Grocery;
import com.cg.dao.GroceryDao;
@Transactional
@Service
public class GroceryServiceImpl implements GroceryService {

	@Autowired
	private GroceryDao gDao;
	
	
	@Override
	public List<String> getCategoryList() {
		
		System.out.println("service reached");
		return gDao.getCategoryList();
	}


	@Override
	public boolean saveGrocery(Grocery grocery) {
		// TODO Auto-generated method stub
		return gDao.saveGrocery(grocery);
	}


	@Override
	public List<Grocery> getGroceryList() {
		// TODO Auto-generated method stub
		return gDao.getGroceryList();
	}

}
