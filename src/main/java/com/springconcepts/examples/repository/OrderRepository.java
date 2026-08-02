package com.springconcepts.examples.repository;

import com.springconcepts.examples.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Integer> {
}
