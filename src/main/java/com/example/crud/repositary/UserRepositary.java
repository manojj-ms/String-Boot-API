package com.example.crud.repositary;

import com.example.crud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepositary extends JpaRepository<User, Integer> {
}
