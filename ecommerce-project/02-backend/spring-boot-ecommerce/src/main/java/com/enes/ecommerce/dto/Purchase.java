package com.enes.ecommerce.dto;

import com.enes.ecommerce.entity.Address;
import com.enes.ecommerce.entity.Customer;
import com.enes.ecommerce.entity.Order;
import com.enes.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
