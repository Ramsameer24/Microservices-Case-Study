package com.fis.training.microservice.subscriptionservice;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SubscriptionController {
	
	@Autowired
	SubscriptionProxy proxy;
	
	@GetMapping("/subscription/name/{name}/author/{author}/availablecopies/{availablecopies}")
	public Subscription booksubscription(
			@PathVariable String name,
			@PathVariable String author,
			@PathVariable Long availablecopies) {
		
		HashMap<String, String> uriVariables = new HashMap<>();
		uriVariables.put("name", name);
		uriVariables.put("author", author);
		ResponseEntity<Subscription> responseEntity= new RestTemplate().getForEntity("http://localhost:8000/books-exchange/name/{name}/author/{author}", Subscription.class, uriVariables);
		 
		Subscription subscription = responseEntity.getBody();
		 
		return new Subscription(subscription.getBookId(),name,author,"John", "12-JUN-2020", null, availablecopies,subscription.getEnvironment());
		
	}
	
	@GetMapping("/subscription-feign/name/{name}/author/{author}/availablecopies/{availablecopies}")
	public Subscription bookSubscriptionFeign(
			@PathVariable String name,
			@PathVariable String author,
			@PathVariable Long availablecopies) {
		
	
		Subscription subscription = proxy.retrieveExchange(name, author);
		 
		return new Subscription(subscription.getBookId(),name,author,"John", "12-JUN-2020", null, availablecopies,subscription.getEnvironment()+"Feign");
		
	}
	

}
