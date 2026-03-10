package org.mt.ms_administrator.domain.model;

import lombok.*;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuditLog {
    private Long id;
    private String schemaName;      // "restaurante"
    private String tableName;       // "menu_items"
    private String action;          // "INSERT", "UPDATE", "DELETE"
    private String userId;          // Del JWT
    private String oldValues;       // JSON
    private String newValues;       // JSON
    private LocalDateTime createdAt;
}
