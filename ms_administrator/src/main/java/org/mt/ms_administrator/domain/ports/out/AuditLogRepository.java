package org.mt.ms_administrator.domain.ports.out;

import org.mt.ms_administrator.domain.model.AuditLog;
import reactor.core.publisher.Mono;

public interface AuditLogRepository {
    Mono<AuditLog> save(AuditLog log);
}