package com.example.SpringPersonalDetails;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
//@RestController
public class PersonalDetails {
	
	@GetMapping("/Sucess")
	public String spring()
	{
		return "Myself Priya Sharma. I have enrolled in Anudip Foundation Java Batch ANP-C1496";
	}
}