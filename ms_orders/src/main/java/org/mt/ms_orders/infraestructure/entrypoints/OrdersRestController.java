package org.mt.ms_orders.infraestructure.entrypoints;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ms-orders")
public class OrdersRestController {
    @GetMapping("/healthStatus")
    public String healthStatus() {
        return "STATUS OK";
    }
}
