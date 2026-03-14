package org.mt.ms_orders.domain.ports.usecases;

import org.mt.ms_orders.domain.model.Order;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface OrderUseCase {

     Mono<Order> CreateOrder(Order order);
     Mono<Order> GetOrderById(int id);
     Flux<Order> GetAllOrders();
     Mono<Order> UpdateOrder(Order order);
     Mono<Order> closeOrder(int id);
     Mono<Order> addItem(int idOrder, int idMenuItem, int quantity);
     Mono<Void> deleteOrder(int id);
}
