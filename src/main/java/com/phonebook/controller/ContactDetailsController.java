package com.phonebook.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.phonebook.beans.ContactDetails;
import com.phonebook.service.ContactDetailsService;



@RestController
@RequestMapping("api/phonebook")
public class ContactDetailsController {
	
	private ContactDetailsService contactDetailsService;
	
	
	public ContactDetailsController(ContactDetailsService contactDetailsService)
	{
		this.contactDetailsService=contactDetailsService;
	}
	
	@PostMapping("/savecontact")
	public ResponseEntity<String> createContact(@RequestBody ContactDetails contact){
		
		String response = contactDetailsService.createContact(contact);	
		return new ResponseEntity<String>(response, HttpStatus.CREATED);
	}
	
	@GetMapping("/allcontacts")
	public ResponseEntity<List<ContactDetails>> displayAllContacts(){
			
		return new ResponseEntity<List<ContactDetails>>(contactDetailsService.displayAllContacts(), HttpStatus.OK);	
	}
	
	@GetMapping("/{contactId}")
	public ResponseEntity<ContactDetails> getContactById(@PathVariable("contactId") Integer conatcId){
		
		return new ResponseEntity<ContactDetails>(contactDetailsService.getContactById(conatcId), HttpStatus.OK);
	}
	
	@PutMapping("/updatecontact")
	public ResponseEntity<String> updateContact(@RequestBody ContactDetails contact){
		
		return new ResponseEntity<String>(contactDetailsService.updateContact(contact), HttpStatus.OK);
	
		
	}
	
	@DeleteMapping("/delete/{contactId}")
	public ResponseEntity<String> deleteContact(@PathVariable("contactId") Integer contactId){
		
		return new ResponseEntity<String>(contactDetailsService.deleteContactById(contactId), HttpStatus.OK);
	}

}
