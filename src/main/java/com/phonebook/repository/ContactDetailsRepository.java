package com.phonebook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.phonebook.beans.ContactDetails;

public interface ContactDetailsRepository extends JpaRepository<ContactDetails, Integer> {

}
