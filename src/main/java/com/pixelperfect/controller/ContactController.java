package com.pixelperfect.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.pixelperfect.entity.Contact;
import com.pixelperfect.repository.ContactRepository;

@Controller
public class ContactController {

    @Autowired
    private ContactRepository contactRepository;

    @PostMapping("/saveContact")
    public String saveContact(@ModelAttribute Contact contact) {

        contactRepository.save(contact);

        return "redirect:/";
    }
}