package com.kaffeestack.replicadao;

import com.kaffeestack.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IOrderRepositoryForReplica extends JpaRepository<Order, Long> {
}
