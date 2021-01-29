package com.example.demo.designPattern.publicerSubscriber.apply;

import org.springframework.beans.factory.annotation.Autowired;

public class RegNotificationObserver implements RegObserver {
    @Autowired
    private NotificationService notificationService;

    @Override
    public void handleRegSuccess(long userId) {
        notificationService.sendInboxMessage(userId, "Welcome...");
    }
}
