package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	public String showGroceryForm(Model model) {
		System.out.println("show grocery from");
		List<String> catList = gService.getCategoryList();
		catList.forEach(System.out::println);
		model.addAttribute("clist", catList);
		model.addAttribute("grocery", new Grocery());
		
		return "addgrocery";
	}
	@RequestMapping("/submitGrocery")
	public String submitGrocery(@ModelAttribute("grocery") Grocery groc, Model model) {
		boolean success = gService.saveGrocery(groc);
		if(success) {
			System.out.println("grocery submitted...");
		}
		else {
			System.out.println("grocery can not be submitted...");
		}
		return "success";
	}
	
	@RequestMapping("/retrieveGrocery")
	public String showAllGrocery(Model model) {
		System.out.println("showing all groceries...");
		List<Grocery> grocList = gService.getAllGrocery();
		grocList.forEach(System.out::println);
		return "showgrocery";
	}
}
