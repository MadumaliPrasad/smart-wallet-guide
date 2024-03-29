package com.smart.wallet.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.smart.wallet.model.Role;


public interface RoleRepository extends MongoRepository<Role, String> {

	Role findByRole(String role);
}
