package com.cg.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.bean.Department;
import com.cg.bean.Student;
import com.cg.service.IStudentService;

@Controller
public class StudentController {

	@Autowired
	private IStudentService sService;

	@RequestMapping("/addstudent")
	public String addStudentDetails(Model model) {

		ArrayList<Department> list = new ArrayList<>();
		list = sService.getDepartment();
		model.addAttribute("details", list);
		

		return "addDetails";
	}

	@RequestMapping("/student")
	public String getStudentDetails(@RequestParam("id") String id, @RequestParam("name") String name, Model model, HttpServletRequest request) {
		
		Student st = new Student();
		int n = Integer.parseInt(id);
		HttpSession session = request.getSession();
		session.setAttribute("id", n);
		session.setAttribute("name", name);	
		
		
		model.addAttribute("obj", st);
		
		return "studentform";
	}
	
	@RequestMapping("/submitDetails")
	public String submitDetails(@ModelAttribute("obj") Student students, Model model, HttpServletRequest request){
		HttpSession session = request.getSession();
		
		
		String id = session.getAttribute("id").toString();
		int n = Integer.parseInt(id);
		students.setDepartmentId(n);
		String name = (String) session.getAttribute("name");
		students.setdName(name);
		sService.addStudent(students);
		
		return "success";
	}
	
}
