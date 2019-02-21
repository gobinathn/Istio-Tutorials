package com.pnm.kube.kube;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class HelloKube {
	@Autowired
	 RestTemplate restTemplate;
	
	 @RequestMapping("/welcome")
	    public String welcome() {
		 String message ="";
		 try {
			 message = restTemplate.getForObject("http://hello-message-app:8888/hello", String.class);
		 }catch(Exception e){			 
			 System.out.println("Exception " + e.getMessage());
		 }		 
		   return message;	     
	    }	
	 
	 @Bean
	 public RestTemplate rest() {
	 return new RestTemplate();
	 }
}

