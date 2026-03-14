package org.mt.ms_orders.infraestructure.adapters.persistence.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.math.BigDecimal;

@Table(name = "order_items")
@Data
public class OrderItemEntity {
    private long idOrder;
    private long idMenuItem;
    private int quantity;
    private BigDecimal unitPrice;
    private BigDecimal subtotal;
}
