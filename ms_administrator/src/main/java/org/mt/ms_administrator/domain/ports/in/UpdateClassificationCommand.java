package org.mt.ms_administrator.domain.ports.in;

import lombok.*;
import org.mt.ms_administrator.domain.model.MenuClassification;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateClassificationCommand {

    private Long id;
    private String name;
    private String description;
    private Integer sortOrder;
    private String userId;

    public MenuClassification toClassification() {
        return MenuClassification.builder()
                .id(this.id)
                .name(this.name)
                .description(this.description)
                .sortOrder(this.sortOrder)
                .build();
    }
}