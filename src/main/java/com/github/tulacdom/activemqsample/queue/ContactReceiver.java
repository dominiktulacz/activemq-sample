package com.github.tulacdom.activemqsample.queue;

import com.github.tulacdom.activemqsample.domain.Contact;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ContactReceiver {

    private static final Logger LOGGER = LoggerFactory.getLogger(ContactReceiver.class);

    @JmsListener(destination = "contact")
    public void receiveMessage(Contact contact) {
        LOGGER.info("Received contact: " + contact);
    }
}
