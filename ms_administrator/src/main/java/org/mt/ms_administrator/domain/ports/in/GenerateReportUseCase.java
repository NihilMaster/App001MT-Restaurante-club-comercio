package org.mt.ms_administrator.domain.ports.in;

import org.mt.ms_administrator.domain.model.OrderSummary;
import org.mt.ms_administrator.domain.model.ItemSalesCount;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface GenerateReportUseCase {
    Flux<OrderSummary> getOrdersBetween(LocalDateTime from, LocalDateTime to);
    Mono<BigDecimal> getTotalBillingBetween(LocalDateTime from, LocalDateTime to);
    Flux<ItemSalesCount> getTopSellingItems(LocalDateTime from, LocalDateTime to, int limit);
}