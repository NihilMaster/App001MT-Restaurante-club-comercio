package org.mt.ms_orders.domain.ports.repository;

import org.mt.ms_orders.domain.model.Order;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface OrderRepository {
    Mono<Order> save(Order order);
    Mono<Order> findById(int id);
    Mono<Order> update(Order order);
    Mono<Order> closeOrder(int id);
    Mono<Order> addItem(int idOrder, int idMenuItem, int quantity);
    Flux<Order> findAll();
    Mono<Void> deleteById(int id);
}
