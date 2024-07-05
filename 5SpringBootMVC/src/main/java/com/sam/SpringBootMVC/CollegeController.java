package com.sam.SpringBootMVC;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class CollegeController {
	@RequestMapping("/")
	ModelAndView hello() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		return mv;
	}

	@RequestMapping("/colleges")
	ModelAndView getProducts() {
		ModelAndView mv = new ModelAndView();

		ArrayList<String> al = new ArrayList<String>();
		al.add("Cummins");
		al.add("MMCOE");
		al.add("MIT");
		al.add("Sinhagad");

		mv.addObject("colleges", al);
		mv.setViewName("colleges");
		return mv;
	}

	@RequestMapping("/logout")
	ModelAndView logout(HttpServletRequest request) {
		System.err.println("logout");
		request.getSession().invalidate();

		ModelAndView mv = new ModelAndView("index");
		return mv;
	}

}
