package com.bingham.ken.game.auth.repository;

import com.bingham.ken.game.auth.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by kbingh64 on 2/19/2017.
 */


@Repository("roleRepository")
public interface RoleRepository extends JpaRepository<Role, Integer>{
    Role findByRole(String role);

}
