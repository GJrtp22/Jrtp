package com.phonebook.serviceImplement;

import java.util.List;
import org.springframework.stereotype.Service;
import com.phonebook.beans.ContactDetails;
import com.phonebook.repository.ContactDetailsRepository;
import com.phonebook.service.ContactDetailsService;

@Service
public class ContactDetailsServiceImplement implements ContactDetailsService {

	private ContactDetailsRepository contactDetailsRepository;

	public ContactDetailsServiceImplement(ContactDetailsRepository contactDetailsRepository) {
		this.contactDetailsRepository = contactDetailsRepository;
	}

	@Override
	public String createContact(ContactDetails contact) {

		return null;
	}

	@Override
	public List<ContactDetails> displayAllContacts() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public ContactDetails getContactById(Integer contactId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateContact(ContactDetails contact) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteContactById(Integer contactId) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
