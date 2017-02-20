package com.bingham.ken.game.auth.repository;

import com.bingham.ken.game.auth.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by kbingh64 on 2/19/2017.
 */

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}