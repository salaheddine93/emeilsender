package com.example.emeilsender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSender {

    @Autowired
    JavaMailSender javaMailSender;

    public void envoyer(String to,
                        String subject,
                        String body)
    {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("dpsicfar@gmail.com");
        message.setTo(to);
        message.setSubject(subject);
        message.setText(body);
        javaMailSender.send(message);
        System.out.println("sent email !!!");
    }
}
