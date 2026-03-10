package org.mt.ms_administrator.domain.ports.in;

import org.mt.ms_administrator.domain.model.MenuItem;
import reactor.core.publisher.Mono;

public interface GetMenuItemUseCase {
    Mono<MenuItem> execute(Long id);
}