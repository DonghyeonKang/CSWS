package com.example.CSWS.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository {
    UserDTO findByUsername(String username);
}
