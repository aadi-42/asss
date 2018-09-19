package com.cg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.cg.bean.Login;

@Controller
public class MyController {

	@RequestMapping("/hello")
	public String homePage(Model model) {

		System.out.println("Homepage...");
		model.addAttribute(new Login());
		return "home";
	}

	@RequestMapping("/login")
	public String doLogin(@ModelAttribute("login") Login login, Model model) {
		System.out.println(login);
		return "success";
	}

	@RequestMapping("/world")
	public String worldPage() {

		System.out.println("Worldpage...");
		return "world";
	}

}
