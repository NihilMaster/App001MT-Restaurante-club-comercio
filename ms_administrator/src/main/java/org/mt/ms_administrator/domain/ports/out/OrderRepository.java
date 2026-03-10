package org.mt.ms_administrator.domain.ports.out;

import org.mt.ms_administrator.domain.model.OrderSummary;
import org.mt.ms_administrator.domain.model.ItemSalesCount;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface OrderRepository {
    Flux<OrderSummary> findClosedOrdersBetween(LocalDateTime from, LocalDateTime to);
    Mono<BigDecimal> findTotalBillingBetween(LocalDateTime from, LocalDateTime to);
    Flux<ItemSalesCount> findTopSellingItems(LocalDateTime from, LocalDateTime to, int limit);
}