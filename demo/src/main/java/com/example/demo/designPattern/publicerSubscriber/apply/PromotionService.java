package com.example.demo.designPattern.publicerSubscriber.apply;

import org.springframework.stereotype.Service;

@Service
public class PromotionService {

    public void issueNewUserExperienceCash(long userId) {
        System.out.println(userId + "in issueNewUserExperienceCash");
    }
}
