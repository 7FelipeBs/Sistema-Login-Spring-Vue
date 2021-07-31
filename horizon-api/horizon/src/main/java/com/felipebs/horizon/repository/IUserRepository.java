package com.felipebs.horizon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.felipebs.horizon.user.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Long>{
	
	@Query("Select u FROM User u WHERE u.userName =:userName")
	User findByUsername(@Param("userName") String userName);
}
