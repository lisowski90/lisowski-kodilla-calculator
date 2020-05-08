package com.kodilla.patterns.strategy.social.media;

public class SnapchatPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "Snapchat";
    }
}
