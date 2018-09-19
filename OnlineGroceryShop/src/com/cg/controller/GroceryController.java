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
	public String showGroceryForm(Model model){
		
		System.out.println("Show grocery form");
		model.addAttribute("grocery",new Grocery());
		System.out.println("Show form");
		List<String> catList = gService.getCategoryList();
		model.addAttribute("clist",catList);
		System.out.println(catList);
		return "addgrocery";
	}
	
	@RequestMapping("/retreiveGrocery")
	public String showGroceryList(Model model){
		System.out.println("show grocery list");
		List<Grocery> groceryList=gService.getGroceryList();
		System.out.println(groceryList);
		model.addAttribute("groceryList",groceryList);
		return "showallgrocery";
	}
	
	@RequestMapping("/submitGrocery")
	public String submitGrocery(@ModelAttribute()Grocery grocery, Model model){
		System.out.println(grocery);
		boolean success = gService.saveGrocery(grocery);
		if(success)
		return "GroceryAdded";
		else
			return "UnableToAdd";
	}
	

}
