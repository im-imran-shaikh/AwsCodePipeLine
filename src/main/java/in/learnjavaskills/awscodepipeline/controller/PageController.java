package in.learnjavaskills.awscodepipeline.controller;

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
}
