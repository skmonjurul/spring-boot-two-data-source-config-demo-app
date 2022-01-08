package com.kaffeestack.maindao;

import com.kaffeestack.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IOrderRepositoryForMain extends JpaRepository<Order, Long> {
}
