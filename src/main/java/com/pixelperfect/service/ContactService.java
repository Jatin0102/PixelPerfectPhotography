package com.pixelperfect.service;

import java.util.List;

import com.pixelperfect.entity.Contact;

public interface ContactService {

    Contact saveContact(Contact contact);

    List<Contact> getAllContacts();

    Contact getContactById(Long contactId);

    Contact updateContact(Contact contact);

    void deleteContact(Long contactId);

}