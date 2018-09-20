package com.cg.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.bean.Department;
import com.cg.bean.Student;

@Transactional
@Repository
public class StudentDaoImpl implements IStudentDao {

	@PersistenceContext
	private EntityManager eManager;

	@Override
	public ArrayList<Department> getDepartment() {

		ArrayList<Department> list = new ArrayList<>();
		String query = "SELECT dept from Department dept";
		TypedQuery<Department> details = eManager.createQuery(query, Department.class);
		list = (ArrayList<Department>) details.getResultList();
		return list;
	}

	@Override
	public boolean addStudent(Student students) {

		eManager.persist(students);
		System.out.println(students.getId());
		return false;
	}
	
	
}
