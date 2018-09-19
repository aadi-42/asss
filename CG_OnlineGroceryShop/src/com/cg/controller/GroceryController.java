package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cg.bean.Grocery;
import com.cg.service.GroceryService;


@Controller
public class GroceryController {
	
	
	@Autowired
	private GroceryService gService;
	
	@RequestMapping("/addGrocery")
	public String showGroceryForm(Model model){
		System.out.println("show groc form");
		List<String> catList = gService.getCategoryList();
		
		model.addAttribute("clist",catList);
		model.addAttribute("grocery",new Grocery());
		return "addgrocery";
	}
	/*
	@RequestMapping("/submitGrocery")
	public String showGroceryDetails(@ModelAttribute("grocery") Grocery grocery,Model model){
		
		System.out.println(grocery);
		return "submitgrocery";
	}*/
	

}
