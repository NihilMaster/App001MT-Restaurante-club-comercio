package org.mt.ms_administrator.application.usecase;

import lombok.RequiredArgsConstructor;
import org.mt.ms_administrator.domain.model.AuditLog;
import org.mt.ms_administrator.domain.model.MenuClassification;
import org.mt.ms_administrator.domain.ports.in.UpdateClassificationCommand;
import org.mt.ms_administrator.domain.ports.in.UpdateClassificationUseCase;
import org.mt.ms_administrator.domain.ports.out.AuditLogRepository;
import org.mt.ms_administrator.domain.ports.out.MenuClassificationRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class UpdateClassificationUseCaseImpl implements UpdateClassificationUseCase {

    private final MenuClassificationRepository classificationRepository;
    private final AuditLogRepository auditLogRepository;

    @Override
    @Transactional
    public Mono<MenuClassification> execute(UpdateClassificationCommand command) {
        return classificationRepository.findById(command.getId())
                .flatMap(existing ->
                        classificationRepository.update(command.toClassification())
                                .flatMap(updated ->
                                        auditLogRepository.save(createAuditLog(existing, updated, command.getUserId()))
                                                .thenReturn(updated)
                                )
                );
    }

    private AuditLog createAuditLog(MenuClassification oldItem, MenuClassification newItem, String userId) {
        return AuditLog.builder()
                .schemaName("restaurante")
                .tableName("menu_classifications")
                .action("UPDATE")
                .userId(userId != null ? userId : "system")
                .oldValues(oldItem.toString())
                .newValues(newItem.toString())
                .createdAt(java.time.LocalDateTime.now())
                .build();
    }
}