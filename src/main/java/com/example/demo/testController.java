package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Book;
import com.example.services.Bookservice;

@RestController
public class testController {
	
	@Autowired
	public Bookservice bookservice;
	
	@GetMapping("/books")	
	public List<Book> getBooks()
	{	
		return this.bookservice.getallbooks();
	}
	
	@GetMapping("/books/{id}")	 //to search book by id
	public Book getbookbyid(@PathVariable("id") int id) {
		
		return bookservice.getbookid(id);
			
	}
	
	@PostMapping("/books")        //adding book
	public Book addBook(@RequestBody Book book) {
		Book b = this.bookservice.addBook(book);
		return b;
	}
	
	@DeleteMapping("/books/{bookid}")       //delete book
	public void deleteBook(@PathVariable("bookid") int bookid) {
		bookservice.deleteBook(bookid);	
		
	}
	
	@PutMapping("books/{bookid}")
	public Book updatebook(@RequestBody Book book,@PathVariable("bookid") int bookid) {
		this.bookservice.updatebook(book ,bookid);
		return book;
	}
	
	
	
}








