package org.mt.ms_orders.infraestructure.entrypoints;

import jakarta.validation.Valid;
import org.mt.ms_orders.infraestructure.entrypoints.dto.request.CreateOrderDto;
import org.mt.ms_orders.infraestructure.entrypoints.dto.response.CreatedOrderDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/ms-orders")
public class OrdersRestController {
    @GetMapping("/healthStatus")
    public String healthStatus() {
        return "STATUS OK";
    }

    @PostMapping(path = "/create")
    public Mono<ResponseEntity<CreatedOrderDto>> createOrder(@RequestBody @Valid CreateOrderDto createOrderDto) {

        return Mono.just(ResponseEntity.status(HttpStatus.CREATED).body(new CreatedOrderDto()));
    }
}
