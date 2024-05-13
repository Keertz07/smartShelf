package com.techymeet.libraryManagement.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.techymeet.libraryManagement.bo.BookBo;
import com.techymeet.libraryManagement.bo.Userbo;
import com.techymeet.libraryManagement.service.ServiceCo;

@Controller
public class LoginController {
	@Autowired
	ServiceCo service;
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String loginUser(HttpServletRequest request,Model model) {
		Userbo userbo =new Userbo();
		model.addAttribute("userbo",userbo);
			 request.setAttribute("successMessage", request.getParameter("successMessage"));
		
		
			 request.setAttribute("errorMessage", request.getParameter("errorMessage"));
		
		return "index";
	}
	@RequestMapping(value="/loginUser",method=RequestMethod.POST)
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
	    		return "redirect:/viewbook";
	    	}
	    	else{
	    		model.addAttribute("message", "Failure");
	    		return "index";
	    	}
	    }
	   return "index";
		
	}
	@RequestMapping(value = "/viewbook", method = RequestMethod.GET)
	public String viewBook(HttpServletRequest request, Model model)throws ServletException, IOException{
		
		List<BookBo> list = service.viewBook();
		model.addAttribute("list", list);
		
		return "user";
		
	}
	@PostMapping("/searchTitle")
    public ModelAndView searchTitle(@RequestParam("title") String title) {
        List<BookBo> list = service.searchTitle(title);
        ModelAndView modelAndView = new ModelAndView();
        if (list != null && !list.isEmpty()) {
            modelAndView.addObject("list", list);
        } else {
            modelAndView.addObject("errorMessage", "Sorry, No Record Found!");
        }
        modelAndView.setViewName("user"); 
        return modelAndView;
    }
	@PostMapping("/searchAuthor")
    public ModelAndView searchAuthor(@RequestParam("author") String author) {
        List<BookBo> list = service.searchAuthor(author);
        ModelAndView modelAndView = new ModelAndView();
        if (list != null && !list.isEmpty()) {
            modelAndView.addObject("list", list);
        } else {
            modelAndView.addObject("errorMessage", "Sorry, No Record Found!");
        }
        modelAndView.setViewName("user"); 
        return modelAndView;
    }
	@PostMapping("/searchSubject")
    public ModelAndView searchSubject(@RequestParam("subject") String subject) {
        List<BookBo> list = service.searchSubject(subject);
        ModelAndView modelAndView = new ModelAndView();
        if (list != null && !list.isEmpty()) {
            modelAndView.addObject("list", list);
        } else {
            modelAndView.addObject("errorMessage", "Sorry, No Record Found!");
        }
        modelAndView.setViewName("user"); 
        return modelAndView;
    }
}
