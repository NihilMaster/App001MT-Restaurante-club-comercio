package org.mt.ms_administrator.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MenuClassification {
    private Long id;
    private String name;
    private String description;
    private Integer sortOrder;  // Para ordenar en el frontend
    private LocalDateTime createdAt;
}
