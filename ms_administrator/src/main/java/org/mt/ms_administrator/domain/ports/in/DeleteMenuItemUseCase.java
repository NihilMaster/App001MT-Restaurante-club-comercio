package org.mt.ms_administrator.domain.ports.in;

import reactor.core.publisher.Mono;

public interface DeleteMenuItemUseCase {
    Mono<Void> execute(Long id);
}