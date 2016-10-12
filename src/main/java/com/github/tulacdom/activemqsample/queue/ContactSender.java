package com.github.tulacdom.activemqsample.queue;

import com.github.tulacdom.activemqsample.domain.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class ContactSender {

    private final JmsTemplate jmsTemplate;

    @Autowired
    public ContactSender(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    public void sendContact(String destination, final Contact contact) {
        jmsTemplate.convertAndSend(destination, contact);
    }
}
