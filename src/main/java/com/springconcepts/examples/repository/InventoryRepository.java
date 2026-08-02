package com.springconcepts.examples.repository;

import com.springconcepts.examples.entity.Product;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Product, Integer> {
}
