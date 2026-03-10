package org.mt.ms_administrator.application.usecase;

import lombok.RequiredArgsConstructor;
import org.mt.ms_administrator.domain.model.AuditLog;
import org.mt.ms_administrator.domain.model.MenuClassification;
import org.mt.ms_administrator.domain.ports.in.CreateClassificationCommand;
import org.mt.ms_administrator.domain.ports.in.CreateClassificationUseCase;
import org.mt.ms_administrator.domain.ports.out.AuditLogRepository;
import org.mt.ms_administrator.domain.ports.out.MenuClassificationRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class CreateClassificationUseCaseImpl implements CreateClassificationUseCase {

    private final MenuClassificationRepository classificationRepository;
    private final AuditLogRepository auditLogRepository;

    @Override
    @Transactional
    public Mono<MenuClassification> execute(CreateClassificationCommand command) {
        return classificationRepository.save(command.toClassification())
                .flatMap(saved ->
                        auditLogRepository.save(createAuditLog(saved, command.getUserId()))
                                .thenReturn(saved)
                );
    }

    private AuditLog createAuditLog(MenuClassification classification, String userId) {
        return AuditLog.builder()
                .schemaName("restaurante")
                .tableName("menu_classifications")
                .action("INSERT")
                .userId(userId != null ? userId : "system")
                .newValues(classification.toString())
                .createdAt(java.time.LocalDateTime.now())
                .build();
    }
}