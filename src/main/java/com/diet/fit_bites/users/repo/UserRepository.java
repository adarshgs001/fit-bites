package com.diet.fit_bites.users.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import com.diet.fit_bites.users.data.Users;

public interface UserRepository extends JpaRepository<Users, Long>, JpaSpecificationExecutor<Users> {

    @Query("SELECT u FROM Users u WHERE u.userId = ?1")
    public Users findOneByUserId(Long id);
}
