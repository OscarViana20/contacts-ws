package com.oviana.contacts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oviana.contacts.dao.ContactRepository;
import com.oviana.contacts.dto.Contact;

@Service // indica a spring que cree una instancia (bean) de la clase
public class ContactService {

	@Autowired // Indica a spring que asigne una instancia de un bean
	ContactRepository dao;

	public Contact save(Contact contact) {
		return dao.saveAndFlush(contact);
	}
}
