package com.jsp.Spring.SpringProject_BookDB.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book
{
	@Id
	private int bookId;
	private String bookName;
	private String genre;
	private String bookAuthor;
	private int bookPrice;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", genre=" + genre + ", bookAuthor=" + bookAuthor
				+ ", bookPrice=" + bookPrice + "]";
	}
	
	

}
