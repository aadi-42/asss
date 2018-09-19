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
	private GroceryService groceryService;

	@RequestMapping("/addgrocery")
	public String showGroceryForm(Model model) {

		System.out.println("Add Grocery...");
		List<String> catList = groceryService.getCategoryList();
		model.addAttribute("clist", catList);
		model.addAttribute("grocery", new Grocery());
		return "addgrocery";
	}

	@RequestMapping("/submitgrocery")
	public String submitGrocery(@ModelAttribute("grocery") Grocery grocery,
			Model model) {

		System.out.println("Submitting..." + grocery);
		boolean success = groceryService.saveGrocery(grocery);
		return "submitgrocery";
	}

	/*
	 * @RequestMapping("/login") public String doLogin(@ModelAttribute("login")
	 * Login login, Model model) { System.out.println(login); return "success";
	 * }
	 */

	@RequestMapping("/retreivegrocery")
	public String retreiveGroceryForm(Model model) {

		System.out.println("Retreiving...");
		model.addAttribute("retreivegrocery", new Grocery());
		return "retreivegrocery";
	}

}
