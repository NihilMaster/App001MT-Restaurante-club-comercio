package org.mt.ms_administrator.domain.ports.in;

import org.mt.ms_administrator.domain.model.MenuClassification;
import reactor.core.publisher.Flux;

public interface ListClassificationsUseCase {
    Flux<MenuClassification> execute();
}