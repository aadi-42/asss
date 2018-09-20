package com.cg.service;

import java.util.ArrayList;

import com.cg.bean.Department;
import com.cg.bean.Student;

public interface IStudentService {

	ArrayList<Department> getDepartment();

	boolean addStudent(Student students);

}
