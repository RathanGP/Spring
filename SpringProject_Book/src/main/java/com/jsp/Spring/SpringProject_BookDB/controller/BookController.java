package com.jsp.Spring.SpringProject_BookDB.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.jsp.Spring.SpringProject_BookDB.entity.Book;
import com.jsp.Spring.SpringProject_BookDB.service.BookService;

@Controller
public class BookController 
{
	@Autowired
	private BookService bookService;

	public String addBook()
	{
		return bookService.addBook();
	}
	
	public Book findBookById()
	{
		return bookService.findBookById();
	}
	public void deleteBook()
	{
		 bookService.deleteBookById();
	}
	public void updateBookById()
	{
		bookService.updateBookPriceById();
	}
}
