package org.mt.ms_administrator.domain.ports.in;

import org.mt.ms_administrator.domain.model.MenuItem;
import reactor.core.publisher.Mono;

public interface UpdateMenuItemUseCase {
    Mono<MenuItem> execute(UpdateMenuItemCommand command);
}