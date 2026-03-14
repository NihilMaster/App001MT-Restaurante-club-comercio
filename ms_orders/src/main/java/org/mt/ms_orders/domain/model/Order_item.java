package org.mt.ms_orders.domain.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Order_item {
    private int id;
    private int idOrder;
    private int idMenuItem;
    private int quantity;
    private BigDecimal subtotal;
}
