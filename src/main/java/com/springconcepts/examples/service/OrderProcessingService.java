package com.springconcepts.examples.service;

import com.springconcepts.examples.entity.Order;
import com.springconcepts.examples.entity.Product;
import com.zaxxer.hikari.util.IsolationLevel;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderProcessingService {
private final OrderHandler orderHandler;
private final InventoryHandler inventoryHandler;


public OrderProcessingService(OrderHandler orderHandler,InventoryHandler inventoryHandler)

{
    this.orderHandler=orderHandler;
    this.inventoryHandler=inventoryHandler;

}

@Transactional(propagation = Propagation.REQUIRED,isolation =Isolation.READ_COMMITTED)
public Order placeAnOrder(Order order)
{

    //get Product Inventory
 Product product=inventoryHandler.getProduct(order.getProductId());
 //validate stock availability
    validateStockAvailability(order, product);
//update Total Price
 order.setTotalPrice(order.getQuantity()*product.getPrice());
 Order saveOrder=orderHandler.saveOrder(order);
 //update stock in inventory
    updateInventoryStock(order, product);
    return saveOrder;
}

    private static void validateStockAvailability(Order order, Product product) {
        if(order.getQuantity()> product.getStockQuantity())
        {
            throw new RuntimeException("Product not in Stock");
        }
    }

    private void updateInventoryStock(Order order, Product product) {
        int availableStock= product.getStockQuantity()- order.getQuantity();
        product.setStockQuantity(availableStock);
        inventoryHandler.updateProductDetails(product);
    }

}
