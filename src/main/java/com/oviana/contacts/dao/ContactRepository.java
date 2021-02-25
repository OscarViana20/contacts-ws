package com.oviana.contacts.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oviana.contacts.dto.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
