package com.ng.eureka.userclient.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CalculateService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod="addServiceToFallback")
    public void getCustomer() {
        int result = restTemplate.exchange( "http://CALCULATORSERVER/add?a=23&b=13", HttpMethod.GET, null,Integer.class).getBody();
        System.out.println(result);
    }

    public void addServiceToFallback(){
        System.out.println("-999");
    }
}
