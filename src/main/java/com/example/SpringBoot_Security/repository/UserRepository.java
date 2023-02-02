package com.example.SpringBoot_Security.repository;

import com.example.SpringBoot_Security.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // todo возможно не нужна аннотация repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
