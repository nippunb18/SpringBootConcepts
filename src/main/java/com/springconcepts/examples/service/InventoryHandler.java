package com.springconcepts.examples.service;

import com.springconcepts.examples.entity.Product;
import com.springconcepts.examples.repository.InventoryRepository;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class InventoryHandler {

    private final InventoryRepository inventoryRepository;

    public InventoryHandler(InventoryRepository inventoryRepository)
    {

        this.inventoryRepository=inventoryRepository;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public Product updateProductDetails(Product product)
    {
        if(product.getPrice()>5000)
        {

            throw new RuntimeException("DB crashed");
        }
        return inventoryRepository.save(product);

    }

    public Product getProduct(int id)
    {

        return inventoryRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Product Not found"));

    }
}
