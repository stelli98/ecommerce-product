package com31.websiteecommerce.websiteecommerce.product.repository;

import com31.websiteecommerce.websiteecommerce.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product,Long> {
    Product save(Product product);
    List<Product> findAll();
    Optional<Product> findById(Long id);
    void delete(Product product);
}
