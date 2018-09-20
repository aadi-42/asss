package com.cg.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bean.Department;
import com.cg.bean.Student;
import com.cg.dao.IStudentDao;

@Service
public class StudentServiceImpl implements IStudentService {
	
	@Autowired
	private IStudentDao sDao;

	@Override
	public ArrayList<Department> getDepartment() {
		// TODO Auto-generated method stub
		return sDao.getDepartment();
	}

	@Override
	public boolean addStudent(Student students) {
		// TODO Auto-generated method stub
		return sDao.addStudent(students);
	}

}
