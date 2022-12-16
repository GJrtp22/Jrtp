package com.phonebook.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.phonebook.beans.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByUserName(String username);

}
