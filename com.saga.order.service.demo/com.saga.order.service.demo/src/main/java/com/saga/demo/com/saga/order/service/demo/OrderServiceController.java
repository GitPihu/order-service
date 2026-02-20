package com.saga.demo.com.saga.order.service.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderServiceController {
    @GetMapping("/msg")
    public String getMsg() {
        return "Welcome Priyanka yadav";
    }


}
