package com.github.r_sneto.WebServices.repositories;

import com.github.r_sneto.WebServices.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
