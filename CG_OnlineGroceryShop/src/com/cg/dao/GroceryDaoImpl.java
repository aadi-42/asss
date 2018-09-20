package com.cg.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.bean.Category;
import com.cg.bean.Grocery;

@Transactional
@Repository
public class GroceryDaoImpl implements GroceryDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<String> getCategoryList() {
		// JPA code here
		List<String> categoryList = new ArrayList<String>();
		List<Category> catList = new ArrayList<Category>();
		String result = "SELECT c.category from Category c";
		
		TypedQuery<String> query = entityManager.createQuery(result,String.class);
		categoryList = query.getResultList();
		/*for (Category category : catList) {
			
			categoryList.add(category.getCategory());
		}*/
		return categoryList;

	}

	public boolean saveGrocery(Grocery grocery) {

		boolean success=false;
		try{
		entityManager.persist(grocery);
		success=true;
		} catch (Exception e){
			e.printStackTrace(); //removelater
		}
		return success;

	}

	@Override
	public List<Grocery> retrievegrocery() {
		// TODO Auto-generated method stub
		List<Grocery> grocList = new ArrayList<Grocery>();
		String result = "SELECT g from Grocery g";
		
		TypedQuery<Grocery> query = entityManager.createQuery(result,Grocery.class);
		grocList = query.getResultList();
		/*for (Category category : catList) {
			
			categoryList.add(category.getCategory());
		}*/
		return grocList;
	}

}
