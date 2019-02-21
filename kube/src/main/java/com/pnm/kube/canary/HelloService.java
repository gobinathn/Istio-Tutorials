package com.pnm.kube.canary;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloService {	
		 @RequestMapping("/hello")
	    public String hello() {		 
		      return String.format("This is hello from version 1");	     
	    }	
}

