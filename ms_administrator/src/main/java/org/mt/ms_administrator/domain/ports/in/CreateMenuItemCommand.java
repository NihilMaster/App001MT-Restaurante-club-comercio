package org.mt.ms_administrator.domain.ports.in;

import lombok.*;
import org.mt.ms_administrator.domain.model.MenuItem;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateMenuItemCommand {
    private String name;
    private String description;
    private BigDecimal price;
    private Long classificationId;
    private Boolean available;
    private String userId; // Para auditoría

    public MenuItem toMenuItem() {
        return MenuItem.builder()
                .name(this.name)
                .description(this.description)
                .price(this.price)
                .classificationId(this.classificationId)
                .available(this.available != null ? this.available : true)
                .createdAt(LocalDateTime.now())
                .updatedAt(LocalDateTime.now())
                .build();
    }
}