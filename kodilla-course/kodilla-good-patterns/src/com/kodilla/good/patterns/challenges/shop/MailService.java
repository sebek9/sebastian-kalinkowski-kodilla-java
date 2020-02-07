package com.kodilla.good.patterns.challenges.shop;

public class MailService implements InformationService{

    @Override
    public void inform(User user) {
        System.out.println("E-mail with order confirmation has been sent");
    }

}