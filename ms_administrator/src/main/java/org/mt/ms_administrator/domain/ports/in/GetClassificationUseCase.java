package org.mt.ms_administrator.domain.ports.in;

import org.mt.ms_administrator.domain.model.MenuClassification;
import reactor.core.publisher.Mono;

public interface GetClassificationUseCase {
    Mono<MenuClassification> execute(Long id);
}