package com.phonebook.serviceImplement;

import java.util.List;
import java.util.Optional;

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
		ContactDetails save = contactDetailsRepository.save(contact);
		if (save != null) {
			return "Contact Saved Successfully";
		}

		return "Contact is not saved, please try again...";
	}

	@Override
	public List<ContactDetails> displayAllContacts() {
		List<ContactDetails> findAll = contactDetailsRepository.findAll();
		if (findAll != null) {
			return findAll;
		}

		return null;
	}

	@Override
	public ContactDetails getContactById(Integer contactId) {

		Optional<ContactDetails> findById = contactDetailsRepository.findById(contactId);
		if (findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override
	public String updateContact(ContactDetails contact) {
		
		Optional<ContactDetails> contactDetails = contactDetailsRepository.findById(contact.getContactId());
		
		if(contactDetails.isPresent()) {
		contactDetails.get().setContactName(contact.getContactName());
		contactDetails.get().setContactEmail(contact.getContactEmail());
		contactDetails.get().setContactNumber(contact.getContactNumber());		
		 contactDetailsRepository.save(contactDetails.get());
		
			return "Contact Updated Successfully";
		}
		
		return "Contact is not updated, please try again...";
		
	}

	@Override
	public String deleteContactById(Integer contactId) {
		contactDetailsRepository.deleteById(contactId);
		return "Contact deleted";
	}

}
