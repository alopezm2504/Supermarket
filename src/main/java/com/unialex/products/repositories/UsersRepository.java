package com.unialex.products.repositories;

import com.unialex.products.models.Product;
import com.unialex.products.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {
}
