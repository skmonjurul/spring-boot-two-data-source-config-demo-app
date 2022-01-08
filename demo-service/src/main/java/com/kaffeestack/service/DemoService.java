package com.kaffeestack.service;

import com.kaffeestack.maindao.IOrderRepositoryForMain;
import com.kaffeestack.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class DemoService {

    @Autowired
    private IOrderRepositoryForMain iOrderRepositoryForMain;

    public void createOrder(Order order) {
        iOrderRepositoryForMain.save(order);
    }
}
