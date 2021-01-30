package com.example.demo.designPattern.publicerSubscriber.apply;

import org.springframework.beans.factory.annotation.Autowired;

public class RegPromotionObserver implements RegObserver {
    @Autowired
    private PromotionService promotionService; // 依赖注入

    @Override
    public void handleRegSuccess(long userId) {
        promotionService.issueNewUserExperienceCash(userId);
    }
}
