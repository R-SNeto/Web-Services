package com.github.r_sneto.WebServices.repositories;

import com.github.r_sneto.WebServices.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
