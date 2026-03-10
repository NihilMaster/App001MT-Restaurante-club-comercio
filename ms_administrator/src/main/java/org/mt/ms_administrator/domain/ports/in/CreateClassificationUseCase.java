package org.mt.ms_administrator.domain.ports.in;

import org.mt.ms_administrator.domain.model.MenuClassification;
import reactor.core.publisher.Mono;

public interface CreateClassificationUseCase {
    Mono<MenuClassification> execute(CreateClassificationCommand command);
}