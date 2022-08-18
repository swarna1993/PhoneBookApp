package com.bikkadIt.PhoneBookApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bikkadIt.PhoneBookApp.model.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer>{

}
