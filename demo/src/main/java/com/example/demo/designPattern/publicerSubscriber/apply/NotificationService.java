package com.example.demo.designPattern.publicerSubscriber.apply;

import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    public void sendInboxMessage(long userId, String message) {

        System.out.println(userId + message);
    }
}
