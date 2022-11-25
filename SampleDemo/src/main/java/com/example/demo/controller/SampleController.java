package com.example.demo.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.City;
import com.example.demo.utils.CitiesUtil;

@Controller
public class SampleController {
	
	
	@GetMapping("home")
	public String getHelloWorld(HttpSession session) {
		session.setAttribute("name","Durga");
		return "pages/home";
	}
	
	@GetMapping("cities")
	public String getCities(Model model) {
		List<City> cities = CitiesUtil.buildCities();
		model.addAttribute("stadiumList", cities);
		return "pages/cities";
	}
	
	@GetMapping("about")
	public String getAboutDetails() {
		return "pages/about-us";
	}
}
