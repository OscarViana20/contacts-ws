package com.oviana.contacts.api;

import javax.validation.Valid;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.oviana.contacts.dto.Contact;
import com.oviana.contacts.service.ContactService;

@RestController
public class ContacsApi {

	@Autowired
	Mapper mapper;

	@Autowired
	ContactService contactService;

	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public Contact getById() {
		return new Contact(1L, "John", "Doe", "+57 311 222 3344", "john@sinbugs.com");
	}

	@RequestMapping(value = "/contact", method = RequestMethod.POST)
	public ContactResponse updateOrSave(@RequestBody @Valid ContactRequest contactRequest) {

		// Mapeo request dto - entity
		Contact contact = mapper.map(contactRequest, Contact.class);

		// Invoca lógica de negocio
		Contact updatedContact = contactService.save(contact);

		// Mapeo entity - dto
		return mapper.map(updatedContact, ContactResponse.class);
	}
}
