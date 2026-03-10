package org.mt.ms_administrator.application.usecase;

import lombok.RequiredArgsConstructor;
import org.mt.ms_administrator.domain.model.AuditLog;
import org.mt.ms_administrator.domain.model.MenuClassification;
import org.mt.ms_administrator.domain.ports.in.DeleteClassificationUseCase;
import org.mt.ms_administrator.domain.ports.out.AuditLogRepository;
import org.mt.ms_administrator.domain.ports.out.MenuClassificationRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class DeleteClassificationUseCaseImpl implements DeleteClassificationUseCase {

    private final MenuClassificationRepository classificationRepository;
    private final AuditLogRepository auditLogRepository;

    @Override
    @Transactional
    public Mono<Void> execute(Long id) {
        return classificationRepository.findById(id)
                .flatMap(classification ->
                        auditLogRepository.save(createAuditLog(classification))
                                .then(classificationRepository.delete(id))
                );
    }

    private AuditLog createAuditLog(MenuClassification classification) {
        return AuditLog.builder()
                .schemaName("restaurante")
                .tableName("menu_classifications")
                .action("DELETE")
                .userId("system")
                .oldValues(classification.toString())
                .createdAt(java.time.LocalDateTime.now())
                .build();
    }
}