package com.cg.dao;

import java.util.ArrayList;

import com.cg.bean.Department;
import com.cg.bean.Student;

public interface IStudentDao {

	ArrayList<Department> getDepartment();

	boolean addStudent(Student students);

}
