package org.mt.ms_orders.infraestructure.adapters.persistence.r2dbc;

import org.mt.ms_orders.infraestructure.adapters.persistence.entity.OrderEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderR2dbcRepository extends ReactiveCrudRepository<OrderEntity, Long> {

}
