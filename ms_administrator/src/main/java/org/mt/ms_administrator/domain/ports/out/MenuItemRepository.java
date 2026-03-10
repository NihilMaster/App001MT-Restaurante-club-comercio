package org.mt.ms_administrator.domain.ports.out;

import org.mt.ms_administrator.domain.model.MenuItem;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface MenuItemRepository {
    Mono<MenuItem> save(MenuItem item);
    Mono<MenuItem> findById(Long id);
    Flux<MenuItem> findAll();
    Mono<MenuItem> update(MenuItem item);
    Mono<Void> delete(Long id);
    Flux<MenuItem> findByClassificationId(Long classificationId);
}