package com.example.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.entities.Book;

@Service
public class Bookservice {
	public static List<Book> list=new ArrayList<>();					
	
	static {
		list.add(new Book(1,"java cheatsheet","Aniket"));			
		list.add(new Book(2,"python cheatsheet","Ani"));
		list.add(new Book(3,"flutter cheatsheet","ket"));
		list.add(new Book(4,"spring cheatsheet","Aet"));
	}
	
	public List<Book>getallbooks(){
		return list;
	}
	
	public Book getbookid(int id) {
		Book book=null;
		book=list.stream().filter(e->e.getId()==id).findFirst().get();
		return book;
	}
	
	
	public Book addBook(Book b) {
		list.add(b);
		return b;
	}
	
	public void deleteBook(int bokid) {
		list=list.stream().filter(book -> book.getId()!=bokid).collect(Collectors.toList());
	}
	
	public void updatebook(Book book,int bookid ) {
		list=list.stream().map(b->{
			if(b.getId()==bookid) {
				b.setBookname(book.getBookname());
				b.setAuthor(book.getAuthor());
			}
			return b;
		}).collect(Collectors.toList());
				
	}
	
}

	






