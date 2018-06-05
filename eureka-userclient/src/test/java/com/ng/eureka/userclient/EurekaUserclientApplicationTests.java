package com.ng.eureka.userclient;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EurekaUserclientApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	private RestTemplate restTemplate;

	@Test
	public void getCustomer() {
		int result = restTemplate.exchange( "http://CALCULATORSERVER/add?a=23&b=13", HttpMethod.GET, null,Integer.class).getBody();
		System.out.println(result);
	}
}
