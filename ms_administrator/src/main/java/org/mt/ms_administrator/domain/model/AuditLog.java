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
