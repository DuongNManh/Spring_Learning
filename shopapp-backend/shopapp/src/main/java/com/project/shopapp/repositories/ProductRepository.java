package com.project.shopapp.repositories;

import com.project.shopapp.models.Product;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

    boolean existsByName(String name);

    // phan trang cho san pham
    Page<Product> findAll(Pageable pageable);
}
