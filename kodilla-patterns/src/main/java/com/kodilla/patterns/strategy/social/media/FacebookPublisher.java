package com.kodilla.patterns.strategy.social.media;

public class FacebookPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "Facebook";
    }
}
