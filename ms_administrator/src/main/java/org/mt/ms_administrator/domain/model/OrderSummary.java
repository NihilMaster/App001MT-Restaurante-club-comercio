package org.mt.ms_administrator.domain.model;

import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderSummary {
    private Long id;
    private Long tableNumber;
    private String customerName;
    private BigDecimal totalCost;
    private LocalDateTime createdAt;
    private LocalDateTime closedAt;
}
