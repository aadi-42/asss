package com.cg.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
	public String submitGrocery(
			@ModelAttribute("grocery") @Valid Grocery grocery,
			BindingResult bindingResult, Model model) {

		System.out.println("Submitting..." + grocery);
		boolean hasError = bindingResult.hasErrors();
		System.out.println("Has error" + hasError);
		if (hasError) {
			List<String> catList = groceryService.getCategoryList();
			model.addAttribute("clist", catList);
			return "addgrocery";
		} else {
			System.out.println(grocery);
			boolean success = groceryService.saveGrocery(grocery);
			return "submitgrocery";
		}
	}

	/*
	 * @RequestMapping("/login") public String doLogin(@ModelAttribute("login")
	 * Login login, Model model) { System.out.println(login); return "success";
	 * }
	 */

	@RequestMapping("/retreivegrocery")
	public String retreiveGroceryForm(Model model) {

		System.out.println("Retreiving...");
		List<Grocery> grocList = new ArrayList<Grocery>();
		grocList = groceryService.retrievegrocery();
		model.addAttribute("grocery", grocList);
		System.out.println(grocList);
		return "retreivegrocery";
	}

	@ExceptionHandler(Exception.class)
	public ModelAndView handleError(Exception e) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("err", e);
		mav.setViewName("dataError");
		//System.out.println(e.getMessage());
		return mav;
	}

}
