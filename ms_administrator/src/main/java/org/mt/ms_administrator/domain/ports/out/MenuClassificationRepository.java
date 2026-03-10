package org.mt.ms_administrator.domain.ports.out;

import org.mt.ms_administrator.domain.model.MenuClassification;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface MenuClassificationRepository {
    Mono<MenuClassification> save(MenuClassification classification);
    Mono<MenuClassification> findById(Long id);
    Flux<MenuClassification> findAll();
    Mono<Void> delete(Long id);
}