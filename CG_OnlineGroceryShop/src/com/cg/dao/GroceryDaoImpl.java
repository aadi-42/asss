package com.cg.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;



import com.cg.bean.Category;

@Transactional
@Repository
public class GroceryDaoImpl implements GroceryDao {

	@PersistenceContext
	private EntityManager eManager;

	@Override
	public List<String> getCategoryList() {

		// JPA code here
		List<String> categoryList = new ArrayList<String>();
		List<Category> caList = new ArrayList<Category>();
		String result = "SELECT category from Category category";
		Query query = eManager.createQuery(result,Category.class);
		caList = query.getResultList();
		for (Category category : caList) {
			
			categoryList.add(category.getCategory());
		}
		return categoryList;

		
	}

}
