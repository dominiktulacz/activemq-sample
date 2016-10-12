package com.github.tulacdom.activemqsample.rest;

import com.github.tulacdom.activemqsample.domain.Contact;
import com.github.tulacdom.activemqsample.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contact")
public class ContactController {

    private final ContactService contactService;

    @Autowired
    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public void addContact(@RequestBody Contact contact) {
        contactService.add(contact);
    }
}
