package com.cg.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bean.Grocery;
import com.cg.dao.GroceryDao;

@Transactional
@Service
public class GroceryServiceImpl implements GroceryService {

	@Autowired
	private GroceryDao groceryDao;

	@Override
	public List<String> getCategoryList() {
		// TODO Auto-generated method stub
		return groceryDao.getCategoryList();
	}

	@Override
	public boolean saveGrocery(Grocery grocery) {
		// TODO Auto-generated method stub
		return groceryDao.saveGrocery(grocery);
	}

}
