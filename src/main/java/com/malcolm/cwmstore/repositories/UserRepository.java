package com.malcolm.cwmstore.repositories;

import com.malcolm.cwmstore.classes.User;

public interface UserRepository {
    void save(User user);
    User findByEmail(String email);
}
