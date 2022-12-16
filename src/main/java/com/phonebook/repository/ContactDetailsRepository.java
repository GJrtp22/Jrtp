package com.phonebook.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.phonebook.beans.ContactDetails;

public interface ContactDetailsRepository extends JpaRepository<ContactDetails, Integer> {
	
	public List<ContactDetails>  findByIsActive(String isActive);

}
