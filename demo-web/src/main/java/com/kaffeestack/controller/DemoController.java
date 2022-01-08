package com.kaffeestack.controller;

import com.kaffeestack.model.Order;
import com.kaffeestack.service.IDemoManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/v1")
public class DemoController {

    @Autowired
    private IDemoManagerService iDemoManagerService;


    @PostMapping("/orders")
    public void saveOrder(Order order) {
        iDemoManagerService.createOrder(order);
    }


}
