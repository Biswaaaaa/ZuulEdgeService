package com.oreilly.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.oreilly.cloud.filters.MyZuulFilter;

@SpringBootApplication
@EnableZuulProxy
public class SpringMicroservicesZuulApplication {

	@Bean
	public MyZuulFilter MyZuulFilter() {
		return new MyZuulFilter();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringMicroservicesZuulApplication.class, args);
	}

}
