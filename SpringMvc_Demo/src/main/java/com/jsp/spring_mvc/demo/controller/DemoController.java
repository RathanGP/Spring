package com.jsp.spring_mvc.demo.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController
{
	@RequestMapping("/example")
	public void print(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		String name=req.getParameter("n");
	
//		PrintWriter out=res.getWriter();
//		out.print("<h1>Welcome home"+name+"</h1>");
		
		req.setAttribute("Key", name);
		RequestDispatcher rd = req.getRequestDispatcher("output.jsp");
		rd.forward(req, res);
	}
	@RequestMapping("/example2")
	public ModelAndView print2(@RequestParam String n)
	{
		ModelAndView mvc=new ModelAndView();
		mvc.addObject("key",n);
		mvc.setViewName("output.jsp");
		
		return mvc;
		
	}
}