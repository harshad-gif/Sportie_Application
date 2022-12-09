package com.ecommerce.respository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ecommerce.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {


	@Query(value = "select u from User u where u.name=:name")
	Optional<User> findUserByName(String name);
}
