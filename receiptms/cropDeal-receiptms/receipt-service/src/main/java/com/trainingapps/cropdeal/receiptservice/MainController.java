package com.trainingapps.cropdeal.receiptservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	@GetMapping("/receipt")
	
	public String Receipt()
	
	{
		return "List of receipts";
	}
	

}
