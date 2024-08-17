package com.jsp.Spring.Product;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.Spring.Product.controller.ProductController;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
        ProductController pc = ac.getBean(ProductController.class);
        System.out.println(pc.addProduct());
    }
}
