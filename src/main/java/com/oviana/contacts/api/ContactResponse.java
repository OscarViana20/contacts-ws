package com.oviana.contacts.api;

import lombok.Data;

@Data
public class ContactResponse {

	private Long id;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String email;
}
