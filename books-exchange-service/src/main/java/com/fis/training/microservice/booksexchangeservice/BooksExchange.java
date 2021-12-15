package com.fis.training.microservice.booksexchangeservice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BooksExchange {

	@Id
	private String bookId;
	
	@Column(name = "bookName")
	private String name;
	
	private String author;
	
	private String copiesAvailable;
	
	private String totalCopies;
	
	private String environment;
	

	public BooksExchange() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BooksExchange(String bookId, String name, String author, String copiesAvailable, String totalCopies) {
		super();
		this.bookId = bookId;
		this.name = name;
		this.author = author;
		this.copiesAvailable = copiesAvailable;
		this.totalCopies = totalCopies;
		this.environment = environment;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCopiesAvailable() {
		return copiesAvailable;
	}

	public void setCopiesAvailable(String copiesAvailable) {
		this.copiesAvailable = copiesAvailable;
	}

	public String getTotalCopies() {
		return totalCopies;
	}

	public void setTotalCopies(String totalCopies) {
		this.totalCopies = totalCopies;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	
	
	
}
