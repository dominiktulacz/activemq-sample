package com.github.tulacdom.activemqsample.service;

import com.github.tulacdom.activemqsample.domain.Contact;
import com.github.tulacdom.activemqsample.queue.ContactSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    private final ContactSender contactSender;

    @Autowired
    public ContactService(ContactSender contactSender) {
        this.contactSender = contactSender;
    }

    public void add(Contact contact) {
        contactSender.sendContact("contact", contact);
    }
}
