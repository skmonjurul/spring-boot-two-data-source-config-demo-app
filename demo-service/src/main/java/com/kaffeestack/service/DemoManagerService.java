package com.kaffeestack.service;

import com.kaffeestack.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class DemoManagerService implements IDemoManagerService{

    @Autowired
    private DemoService demoService;

    @Override
    public void createOrder(Order order) {
        demoService.createOrder(order);
    }
}
