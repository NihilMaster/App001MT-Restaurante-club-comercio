package org.mt.ms_administrator.domain.model;

import lombok.*;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MenuClassification {
    private Long id;
    private String name;
    private String description;
    private Integer sortOrder;  // Para ordenar en el frontend
    private LocalDateTime createdAt;
}
