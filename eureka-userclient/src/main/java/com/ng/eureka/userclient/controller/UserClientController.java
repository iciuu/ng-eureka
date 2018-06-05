package com.ng.eureka.userclient.controller;

import com.ng.eureka.userclient.service.CalculateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userclient")
public class UserClientController {

    @Autowired
    CalculateService calculateService;

    @RequestMapping("/cal")
    public void cal(){
        calculateService.getCustomer();
    }
}
