package com.techymeet.libraryManagement.controller;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.techymeet.libraryManagement.bo.BookBo;
import com.techymeet.libraryManagement.bo.Userbo;
import com.techymeet.libraryManagement.service.ServiceCo;

@Controller

public class AdminController {
	@Autowired
	ServiceCo service;
	
	@RequestMapping(value="/addBook", method=RequestMethod.POST)
	public String addBook(@ModelAttribute("bookBo") BookBo bookBo, HttpServletRequest request, Model model) {
	    long status = 0;

	    // Convert the String date to Date object
	    
	    status = service.addBook(bookBo);

	    if (status > 0) {
	        model.addAttribute("message", "Successful");
	    } else {
	        model.addAttribute("message", "Failure");
	    }

	    return "admin";
	}

	@RequestMapping(value="/loginAdmin",method=RequestMethod.POST)
	public String loginUser(@ModelAttribute("userbo")Userbo userbo, HttpServletRequest request, HttpServletResponse response, Model model) {
	    String email=request.getParameter("email");
	    String password=request.getParameter("password");
	    HttpSession session = request.getSession();
	    Userbo userbo1=new Userbo();
	    if(null!=email && null!=password) {
	    	userbo1.setUsername(email);
	    	userbo1.setPassword(password);
	    	userbo=service.loginUser(userbo1);
	    	
	    	if(null!=userbo) {
	    	model.addAttribute("loggedInUser", userbo.getUsername());
	    		model.addAttribute("message", "Successfull");
	    		return "admin";
	    	}
	    	else{
	    		model.addAttribute("message", "Failure");
	    		return "index";
	    	}
	    }
	   return "index";
		
	}
}
