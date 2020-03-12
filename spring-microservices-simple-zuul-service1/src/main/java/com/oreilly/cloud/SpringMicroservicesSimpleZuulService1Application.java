package com.oreilly.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringMicroservicesSimpleZuulService1Application {

	@RequestMapping("/execute")
	public String execute() {
		return "executed...";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringMicroservicesSimpleZuulService1Application.class, args);
	}

}
