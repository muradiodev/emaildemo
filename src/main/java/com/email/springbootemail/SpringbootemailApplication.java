package com.email.springbootemail;

import com.email.springbootemail.model.Mail;
import com.email.springbootemail.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootemailApplication implements CommandLineRunner {

    @Autowired
    private MailService mailService;


    public static void main(String[] args) {
        SpringApplication.run(SpringbootemailApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Mail mail = new Mail();
        mail.setMailFrom("muradace@gmail.com");
        mail.setMailTo("muradace@gmail.com");
        mail.setMailSubject("Spring Boot - Email demo");
        mail.setMailContent("Just testing");
        mailService.sendEmail(mail);
    }
}
