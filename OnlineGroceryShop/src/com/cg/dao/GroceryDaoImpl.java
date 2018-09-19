package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.bean.Grocery;

@Transactional
@Repository
public class GroceryDaoImpl implements GroceryDao {

	@PersistenceContext
	private EntityManager eManager;
	@Override
	public List<String> getCategoryList() {
		System.out.println("in dao");
		String sql="SELECT c.category from Category c";
		TypedQuery<String> qry=eManager.createQuery(sql, String.class);
		System.out.println("query created");
		@SuppressWarnings("unchecked")
		List<String> catList=qry.getResultList();
		System.out.println("result fetched");
		return catList;
	}
	@Override
	public boolean saveGrocery(Grocery grocery) {
		boolean success=false;
		try{
			eManager.persist(grocery);
			success=true;
		}catch (Exception e){
			e.printStackTrace();
		}
		return success;
	}
	@Override
	public List<Grocery> getGroceryList() {
		String sql="SELECT g from Grocery g";
		TypedQuery<Grocery> qry=eManager.createQuery(sql, Grocery.class);
		List<Grocery> groceryList=qry.getResultList();
		return groceryList;
	}

}
