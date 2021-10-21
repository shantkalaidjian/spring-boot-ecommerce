package com.luv2code.ecommerce.dao;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<SecurityProperties.User, String> {
}
