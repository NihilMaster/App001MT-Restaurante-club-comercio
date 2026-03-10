package org.mt.ms_administrator.domain.ports.in;

import org.mt.ms_administrator.domain.model.MenuItem;
import reactor.core.publisher.Flux;

public interface ListMenuItemsUseCase {
    Flux<MenuItem> execute();
}