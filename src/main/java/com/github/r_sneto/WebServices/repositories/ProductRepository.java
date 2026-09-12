package com.github.r_sneto.WebServices.repositories;

import com.github.r_sneto.WebServices.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
