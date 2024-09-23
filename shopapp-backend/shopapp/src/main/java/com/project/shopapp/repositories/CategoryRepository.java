package com.project.shopapp.repositories;

import com.project.shopapp.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// The JpaRepository interface is a JPA specific repository interface. It provides various methods to perform CRUD operations.
// why we use the interface for CategoryRepository instead of the class?
// because we want to use the JpaRepository interface to perform CRUD operations on the Category entity.
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
