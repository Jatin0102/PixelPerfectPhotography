package com.pixelperfect.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "contact_messages")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long contactId;

    private String name;

    private String email;

    private String subject;

    @Column(length = 1000)
    private String message;

    public Contact() {
    }

    public Contact(Long contactId, String name, String email,
                   String subject, String message) {
        this.contactId = contactId;
        this.name = name;
        this.email = email;
        this.subject = subject;
        this.message = message;
    }

    public Long getContactId() {
        return contactId;
    }

    public void setContactId(Long contactId) {
        this.contactId = contactId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}