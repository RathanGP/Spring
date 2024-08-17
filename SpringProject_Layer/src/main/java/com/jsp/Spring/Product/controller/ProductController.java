package com.jsp.Spring.Product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.jsp.Spring.Product.service.ProductService;

@Controller
public class ProductController 
{
	@Autowired
	private ProductService productService;
	
	public String addProduct()
	{
		return productService.addProduct();
	}

}
