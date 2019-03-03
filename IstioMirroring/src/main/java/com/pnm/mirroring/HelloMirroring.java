package com.pnm.mirroring;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class HelloMirroring {
		
	 @RequestMapping("/mirroring")
	    public String welcome() {
		 String message ="Hello Mirroring v1";
		 System.out.println("Hello Mirroring");
		 
		   return message;	     
	    }	
}

