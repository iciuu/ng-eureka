package com.ng.feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="CalculatorServer")
public interface CalculatorService {

    @RequestMapping(value="/add", method= RequestMethod.GET)
    int myadd(@RequestParam("a") int a, @RequestParam("b") int b);
}
