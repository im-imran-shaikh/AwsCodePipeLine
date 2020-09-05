package in.learnjavaskills.awscodepipeline.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageController
{
	@GetMapping("{message}")
	public String message(@PathVariable String message)
	{
		return message;
	}
	
	@GetMapping("getNames")
	public List<String> getNames()
	{
		return Arrays.asList("Imran","Pradeep", "Suraj", "Sarwar","Arjun","Rahul", "Karen");
	}
	
	@GetMapping("GetDate")
	public Date getDate()
	{
		return  new Date();
	}
}
