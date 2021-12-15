package com.fis.training.microservice.subscriptionservice;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Subscription {
	
	@Id
	private String bookId;
	private String bookName;
	private String author;
	private String subscriberName;
	private String dateSubscribed;
	private String dateReturned;
	private Long availablecopies;
	
	private String environment;
	
	public Subscription() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Subscription(String bookId, String bookName, String author, String subscriberName, String dateSubscribed,
			String dateReturned, Long availablecopies,  String environment) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
		this.subscriberName = subscriberName;
		this.dateSubscribed = dateSubscribed;
		this.dateReturned = dateReturned;
		this.availablecopies = availablecopies;
		this.environment = environment;
	}
	
	public String getEnvironment() {
		return environment;
	}
	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getSubscriberName() {
		return subscriberName;
	}
	public void setSubscriberName(String subscriberName) {
		this.subscriberName = subscriberName;
	}
	public String getDateSubscribed() {
		return dateSubscribed;
	}
	public void setDateSubscribed(String dateSubscribed) {
		this.dateSubscribed = dateSubscribed;
	}
	public String getDateReturned() {
		return dateReturned;
	}
	public void setDateReturned(String dateReturned) {
		this.dateReturned = dateReturned;
	}
	public Long getAvailablecopies() {
		return availablecopies;
	}
	public void setAvailablecopies(Long availablecopies) {
		this.availablecopies = availablecopies;
	}
	
	


}
