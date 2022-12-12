package com.phonebook.serviceImplement;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.phonebook.beans.ContactDetails;
import com.phonebook.exception.ContactNotFoundException;
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
		contact = contactDetailsRepository.save(contact);
		if (contact.getContactId() != null) {
			return "Contact Saved Successfully";
		}

		return "Contact is not saved, please try again...";
	}

	@Override
	public List<ContactDetails> displayAllContacts() {

		return contactDetailsRepository.findAll();
	}

	@Override
	public ContactDetails getContactById(Integer contactId) {

		return contactDetailsRepository.findById(contactId)
				.orElseThrow(() -> new ContactNotFoundException("Contact ID: " + contactId + "Not Found"));

	}

	@Override
	public String updateContact(ContactDetails contact) {

		Optional<ContactDetails> contactDetails = contactDetailsRepository.findById(contact.getContactId());

		if (contactDetails.isPresent()) {
			contactDetails.get().setContactName(contact.getContactName());
			contactDetails.get().setContactEmail(contact.getContactEmail());
			contactDetails.get().setContactNumber(contact.getContactNumber());
			contactDetailsRepository.save(contactDetails.get());

			return "Contact Updated Successfully";
		}

		else {
			throw new ContactNotFoundException(" ContactId: " + contact.getContactId() + "Not Found");
		}

	}

	@Override
	public String deleteContactById(Integer contactId) {

		if (contactDetailsRepository.existsById(contactId)) {
			contactDetailsRepository.deleteById(contactId);
			return "Contact deleted";
		} else {
			return "No record Found";
		}
	}

}
