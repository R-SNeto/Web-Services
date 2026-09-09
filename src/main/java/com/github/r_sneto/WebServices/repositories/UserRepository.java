package com.github.r_sneto.WebServices.repositories;

import com.github.r_sneto.WebServices.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
