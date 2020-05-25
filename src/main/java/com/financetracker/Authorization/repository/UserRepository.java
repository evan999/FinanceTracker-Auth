package com.financetracker.Authorization.repository;

import com.financetracker.Authorization.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public class UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByUsername(String username)
}
