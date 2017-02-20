package com.bingham.ken.game.auth.service;

import com.bingham.ken.game.auth.model.User;

/**
 * Created by kbingh64 on 2/19/2017.
 */

public interface UserService {
    public User findUserByEmail(String email);
    public void saveUser(User user);
}
