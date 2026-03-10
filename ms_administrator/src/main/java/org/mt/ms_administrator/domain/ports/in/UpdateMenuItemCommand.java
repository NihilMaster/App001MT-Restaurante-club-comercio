package org.mt.ms_administrator.domain.ports.in;

import lombok.*;
import org.mt.ms_administrator.domain.model.MenuItem;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateMenuItemCommand {
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private Long classificationId;
    private Boolean available;
    private String userId; // Para auditoría

    public MenuItem toMenuItem() {
        return MenuItem.builder()
                .id(this.id)
                .name(this.name)
                .description(this.description)
                .price(this.price)
                .classificationId(this.classificationId)
                .available(this.available)
                .updatedAt(LocalDateTime.now())
                .build();
    }
}