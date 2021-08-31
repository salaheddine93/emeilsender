package com.example.emeilsender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class EmeilsenderApplication {

    @Autowired
    private EmailSender emailSender;

    public static void main(String[] args) {
        SpringApplication.run(EmeilsenderApplication.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void trigger(){
      emailSender.envoyer("iliassleader@gmail.com",
              "Message d'essai",
              "testtttttttttttttttttttt!!!");
    }
}
