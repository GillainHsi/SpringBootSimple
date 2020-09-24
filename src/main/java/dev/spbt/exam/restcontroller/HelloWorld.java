package dev.spbt.exam.restcontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	@RequestMapping(value = "/respect", method = RequestMethod.POST)
	public String RespectPost() {
		return "POST => 尊敬的泰廷課長";
	}
	
	@RequestMapping(value = "/respect", method = RequestMethod.GET)
	public String RespectGet() {
		return "GET => 尊敬的泰廷課長";
	}

}
