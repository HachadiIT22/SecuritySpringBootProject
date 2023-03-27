package com.hachadi.security.repositories;

import com.hachadi.security.modals.User;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface UserRepository  extends JpaRepository<User, Integer> {

  UserDetails findByEmail(String email);

}
