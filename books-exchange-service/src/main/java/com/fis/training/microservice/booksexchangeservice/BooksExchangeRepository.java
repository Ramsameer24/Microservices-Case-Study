package com.fis.training.microservice.booksexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksExchangeRepository extends JpaRepository<BooksExchange, String> {

	BooksExchange findByNameAndAuthor(String name,String author);
}
