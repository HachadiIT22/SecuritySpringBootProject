package com.hachadi.security.repositories;

import com.hachadi.security.modals.User;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@Transactional
public interface UserRepository  extends JpaRepository<User, Integer> {

  Optional<User> findByEmail(String email);

}
