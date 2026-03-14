package org.mt.ms_orders.domain.ports.usecases;

import lombok.RequiredArgsConstructor;
import org.mt.ms_orders.domain.model.Order;
import org.mt.ms_orders.domain.ports.repository.OrderRepository;
import org.mt.ms_orders.infraestructure.entrypoints.dto.request.CreateOrderDto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class OrderUseCase {
    private final OrderRepository orderRepository;

    public Mono<Order> CreateOrder(Order order) {
        return orderRepository.save(order);
    }

    public Mono<Order> GetOrderById(int id) {
        return orderRepository.findById(id);
    }

    public Flux<Order> GetAllOrders() {
        return orderRepository.findAll();
    }

    public Mono<Order> UpdateOrder(Order order) {
        return orderRepository.update(order);
    }

    public Mono<Order> closeOrder(int id) {
        return orderRepository.closeOrder(id);
    }

    public Mono<Order> addItem(int idOrder, int idMenuItem, int quantity) {
        return orderRepository.addItem(idOrder, idMenuItem, quantity);
    }

    public Mono<Void> deleteOrder(int id) {
        return orderRepository.deleteById(id);
    }

}
