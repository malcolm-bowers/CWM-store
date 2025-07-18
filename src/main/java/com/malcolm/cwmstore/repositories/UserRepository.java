package com.malcolm.cwmstore.repositories;

import com.malcolm.cwmstore.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
