package com.telusko;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {

	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("v1") int v1, @RequestParam("v2") int v2, HttpServletRequest request, HttpServletResponse response) {
		
		int v = v1+v2;
		ModelAndView mv = new ModelAndView();
		mv.setViewName("addition.jsp");
		mv.addObject("result", v);
		
		return mv;
	}
	
}