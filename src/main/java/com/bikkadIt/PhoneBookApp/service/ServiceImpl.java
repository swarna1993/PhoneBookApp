package com.bikkadIt.PhoneBookApp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bikkadIt.PhoneBookApp.model.Contact;

@Service
public class ServiceImpl implements ServiceI{

	@Override
	public boolean saveContact(Contact contact) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Contact> getAllContact() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact getContactById(Integer contactId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteContactById(Integer contactId) {
		// TODO Auto-generated method stub
		return false;
	}

}
