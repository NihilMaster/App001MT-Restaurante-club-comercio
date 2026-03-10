package org.mt.ms_administrator.domain.model;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MenuItem {
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private Long classificationId;
    private Boolean available;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
