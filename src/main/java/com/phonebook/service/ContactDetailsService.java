package com.phonebook.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.phonebook.beans.ContactDetails;

@Service
public interface ContactDetailsService {
	
	public String createContact(ContactDetails contact);
	
	public List<ContactDetails> displayAllContacts();
	
	public ContactDetails getContactById(Integer contactId);
	
	public String updateContact(ContactDetails contact);
	
	public String deleteContactById(Integer contactId);

}
