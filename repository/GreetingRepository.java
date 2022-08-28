package com.example.greetingappdevelopment.repository;

import com.example.greetingappdevelopment.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingRepository extends JpaRepository<User, Integer> {
}
