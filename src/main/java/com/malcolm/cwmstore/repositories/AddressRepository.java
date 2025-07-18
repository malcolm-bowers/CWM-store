package com.malcolm.cwmstore.repositories;

import com.malcolm.cwmstore.entities.Address;
import org.springframework.data.repository.ListCrudRepository;

public interface AddressRepository extends ListCrudRepository<Address, Long> {
}