package com.vistu.spring2.product.repository;

import com.vistu.spring2.product.domain.product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<product, Long> {
}
