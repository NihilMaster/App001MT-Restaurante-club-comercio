package org.mt.ms_administrator.application.usecase;

import lombok.RequiredArgsConstructor;
import org.mt.ms_administrator.domain.model.MenuClassification;
import org.mt.ms_administrator.domain.ports.in.GetClassificationUseCase;
import org.mt.ms_administrator.domain.ports.out.MenuClassificationRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class GetClassificationUseCaseImpl implements GetClassificationUseCase {

    private final MenuClassificationRepository classificationRepository;

    @Override
    public Mono<MenuClassification> execute(Long id) {
        return classificationRepository.findById(id);
    }
}