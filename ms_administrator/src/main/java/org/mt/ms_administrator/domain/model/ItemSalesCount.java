package org.mt.ms_administrator.domain.model;

import lombok.*;
import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ItemSalesCount {
    private Long menuItemId;
    private String menuItemName;
    private Long totalQuantity;
    private BigDecimal totalRevenue;
}