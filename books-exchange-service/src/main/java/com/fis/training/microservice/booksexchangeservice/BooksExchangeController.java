package com.fis.training.microservice.booksexchangeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksExchangeController {

	@Autowired
	Environment environment;
	
	@Autowired
	private BooksExchangeRepository repository;
	
	@GetMapping("books-exchange/name/{name}/author/{author}")
		public BooksExchange retrieveExchange(
				@PathVariable String name,
				@PathVariable String author) {
			
		
		//	BooksExchange booksExchange=new BooksExchange("B1212",name,author,"0","2");
			
			
			BooksExchange booksExchange = repository.findByNameAndAuthor(name, author);
			
			if(booksExchange == null) {
				throw new RuntimeException("No Data available.");
			}
			
			String serverPort = environment.getProperty("server.port");
			
		//	booksExchange.setEnvironment(serverPort);
			
			return booksExchange;
		}
		
	
}
