package com.cydeo.repository;

import com.cydeo.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartReposirtory extends JpaRepository<Cart, Long> {
}
