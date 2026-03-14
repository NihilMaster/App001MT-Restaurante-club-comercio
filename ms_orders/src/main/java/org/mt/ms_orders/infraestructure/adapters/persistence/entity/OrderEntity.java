package org.mt.ms_orders.infraestructure.adapters.persistence.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Table(name = "orders")
@Data
public class OrderEntity {
    @Id
    private Long id;
    private int idTable;
    private String customerName;
    private boolean isOpen;
    private BigDecimal totalCost;
    private String orderItems;
    private String notes;
    private LocalDateTime  createdAt;
    private LocalDateTime  updatedAt;
    private LocalDateTime  closedAt;
}
