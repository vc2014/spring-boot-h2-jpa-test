package com.example.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import com.example.pojo.Document;

@RestController
public class SampleController {
    //@Autowired CustomerService customerService;

    @RequestMapping(path="/documents", method= RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Document postCustomer(@RequestBody Document document){
    	
    	System.out.println(document);
    	return null;
        //return customerService.createCustomer(customer);
    }
}
