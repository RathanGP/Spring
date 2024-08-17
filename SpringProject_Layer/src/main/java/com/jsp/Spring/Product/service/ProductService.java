package com.jsp.Spring.Product.service;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.Spring.Product.entity.Product;
import com.jsp.Spring.Product.repository.ProductRepository;

@Service
public class ProductService
{
	@Autowired
	private ProductRepository productRepository;

	Scanner sc=new Scanner(System.in);
	
	public String addProduct()
	{
		Product product=new Product();
		System.out.println("Enter ProductID");
		product.setProductId(sc.nextInt());
		System.out.println("Enter ProductName");
		product.setProductName(sc.next());
		System.out.println("Enter ProductBrand");
		product.setProductBrand(sc.next());
		System.out.println("Enter ProductPrice");
		product.setProductPrice(sc.nextInt());
		
		productRepository.addProduct(product);
		
		
		return "Product added successfully";
	}
	
	
}
