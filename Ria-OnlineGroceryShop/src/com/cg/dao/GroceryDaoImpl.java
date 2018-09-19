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
		// JPA code here
		String qStr = "SELECT cat.category FROM Category cat";
		TypedQuery<String> query = eManager.createQuery(qStr, String.class);
		List<String> cList = query.getResultList();
		//cList.forEach(System.out::println);
		return cList;
	}
	@Override
	public boolean saveGrocery(Grocery groc) {
		boolean success = false;
		
		try {
			eManager.persist(groc);
			success = true;
		} catch (Exception e) {
			// log error
			e.printStackTrace(); // remove this
		}
		
		return success;
	}
	@Override
	public List<Grocery> getAllGrocery() {
		String qStr = "SELECT groc_hib FROM Grocery groc_hib";
		TypedQuery<Grocery> query = eManager.createQuery(qStr, Grocery.class);
		List<Grocery> grocList = query.getResultList();
		return grocList;
	}

}
