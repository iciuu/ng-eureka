package com.ng.feign.controller;

import com.ng.feign.service.CalculatorService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/demo/feign")
public class ConsumerController {
    @Resource
    private CalculatorService calculatorService;

    @RequestMapping("/toadd")
    int toadd(int a, int b){
        return calculatorService.myadd(a, b);
    }
}
