package com.spring.security.jwt.repository;

import java.util.Optional;

import com.spring.security.jwt.models.ERole;
import com.spring.security.jwt.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
  Optional<Role> findByName(ERole name);
}
