package org.mt.ms_administrator.domain.ports.in;

import lombok.*;
import org.mt.ms_administrator.domain.model.MenuClassification;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateClassificationCommand {

    private String name;
    private String description;
    private Integer sortOrder;
    private String userId;

    public MenuClassification toClassification() {
        return MenuClassification.builder()
                .name(this.name)
                .description(this.description)
                .sortOrder(this.sortOrder != null ? this.sortOrder : 0)
                .createdAt(LocalDateTime.now())
                .build();
    }
}