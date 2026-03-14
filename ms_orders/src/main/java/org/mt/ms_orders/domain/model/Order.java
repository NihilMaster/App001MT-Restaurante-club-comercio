package org.mt.ms_orders.domain.model;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class Order {
    private int id;
    private int idTable;
    private String customerName;
    private boolean isOpen;
    private BigDecimal totalPrice;
    private String notes;
    private List<Order_item> items;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime closedAt;
}
