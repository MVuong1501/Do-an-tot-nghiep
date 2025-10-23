package com.doan.WEB_TMDT.module.inventory.repository;

import com.doan.WEB_TMDT.module.inventory.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
    boolean existsBySku(String sku);
    Optional<Product> findBySku(String sku);
}
