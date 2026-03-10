package org.mt.ms_administrator.application.usecase;

import lombok.RequiredArgsConstructor;
import org.mt.ms_administrator.domain.model.MenuClassification;
import org.mt.ms_administrator.domain.ports.in.ListClassificationsUseCase;
import org.mt.ms_administrator.domain.ports.out.MenuClassificationRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class ListClassificationsUseCaseImpl implements ListClassificationsUseCase {

    private final MenuClassificationRepository classificationRepository;

    @Override
    public Flux<MenuClassification> execute() {
        return classificationRepository.findAll()
                .sort((a, b) -> {
                    if (a.getSortOrder() == null) return 1;
                    if (b.getSortOrder() == null) return -1;
                    return a.getSortOrder().compareTo(b.getSortOrder());
                });
    }
}