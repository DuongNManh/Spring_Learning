package com.project.shopapp.repositories;

import com.project.shopapp.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByPhoneNumber(String phoneNumber);
    // Optional is a container object which may or may not contain a non-null value
    // If a value is present, isPresent() will return true and get() will return the value.
    Optional<User> findByPhoneNumber(String phoneNumber);

}
