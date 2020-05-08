package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.media.TwitterPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User jas = new Millenials("John Nowakowski");
        User mis = new YGeneration("Michael Douglas");
        User tis = new ZGeneration("Ted Bunddy");

        //When
        String jasShareBy = jas.sharePost();
        System.out.println(jasShareBy);
        String misShareBy = mis.sharePost();
        System.out.println(misShareBy);
        String tisShareBy = tis.sharePost();
        System.out.println(tisShareBy);

        //Then
        Assert.assertEquals("Facebook", jasShareBy);
        Assert.assertEquals("Twitter", misShareBy);
        Assert.assertEquals("Snapchat", tisShareBy);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User jas = new Millenials("John Nowakowski");


        //When
        String jasShareBy = jas.sharePost();
        System.out.println(jasShareBy);
        jas.setHowToSharePost(new TwitterPublisher());
        jasShareBy = jas.sharePost();
        System.out.println(jasShareBy);

        //Then
        Assert.assertEquals("Twitter", jasShareBy);
    }
}
