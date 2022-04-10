package com.example.entities;

public class Book {
	private int Id;
	private String bookname;
	private String author;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int id, String bookname, String author) {
		super();
		Id = id;
		this.bookname = bookname;
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [Id=" + Id + ", bookname=" + bookname + ", author=" + author + "]";
	}
	
	
}
