package com.ng.feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="CalculatorServer",fallback = CalculatorService.HystrixCalculatorService.class)
public interface CalculatorService {

    @RequestMapping(value="/add", method= RequestMethod.GET)
    int myadd(@RequestParam("a") int a, @RequestParam("b") int b);

    /**
     * 这里采用和SpringCloud官方文档相同的做法，把fallback类作为内部类放入Feign接口中
     * http://cloud.spring.io/spring-cloud-static/Camden.SR6/#spring-cloud-feign-hystrix
     * （也可以外面独立定义该类，个人觉得没必要，这种东西写成内部类最合适）
     */
    @Component
    class HystrixCalculatorService implements CalculatorService {
        @Override
        public int myadd(@RequestParam("a") int a, @RequestParam("b") int b) {
            return -999;
        }
    }
}
