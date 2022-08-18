package com.bikkadIt.PhoneBookApp.service;

import java.util.List;

import com.bikkadIt.PhoneBookApp.model.Contact;

public interface ServiceI {
	
	  boolean saveContact(Contact contact);
	  List<Contact> getAllContact();
	  Contact getContactById(Integer contactId);
	  boolean deleteContactById(Integer contactId);

}
