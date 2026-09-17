package com.github.r_sneto.WebServices.repositories;

import com.github.r_sneto.WebServices.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
