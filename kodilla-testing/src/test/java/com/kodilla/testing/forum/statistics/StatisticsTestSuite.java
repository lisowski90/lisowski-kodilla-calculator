package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuite {
    @Test
    public void testCounterAllZero() {
        //Given
        Statistics statisticsToCount = mock(Statistics.class);
        List<String> theList = new ArrayList<>();
        when(statisticsToCount.userName()).thenReturn(theList);
        when(statisticsToCount.postCount()).thenReturn(0);
        when(statisticsToCount.commentCount()).thenReturn(0);

        Counter counter = new Counter(statisticsToCount);

        //When
        counter.calculateAdvStatistic(statisticsToCount);
        double one = counter.getCommentPerPost();
        double two = counter.getCommentPerUser();
        double three = counter.getPostPerUser();

        //Then
        Assert.assertEquals(0, one, 0);
        Assert.assertEquals(0, two, 0);
        Assert.assertEquals(0, three,0);
    }

    @Test
    public void testCounterZeroUser() {
        //Given
        Statistics statisticsToCount = mock(Statistics.class);
        List<String> theList = new ArrayList<>();
        when(statisticsToCount.userName()).thenReturn(theList);
        when(statisticsToCount.postCount()).thenReturn(1000);
        when(statisticsToCount.commentCount()).thenReturn(2000);

        Counter counter = new Counter(statisticsToCount);

        //When
        counter.calculateAdvStatistic(statisticsToCount);
        double one = counter.getCommentPerPost();
        double two = counter.getCommentPerUser();
        double three = counter.getPostPerUser();

        //Then
        Assert.assertEquals(2, one, 0);
        Assert.assertEquals(0, two, 0);
        Assert.assertEquals(0, three,0);
    }

    @Test
    public void testCounterZeroPost() {
        //Given
        Statistics statisticsToCount = mock(Statistics.class);
        List<String> theList = new ArrayList<>();
        for(int i = 0; i < 100; i++) {
            theList.add("i");
        }
        when(statisticsToCount.userName()).thenReturn(theList);
        when(statisticsToCount.postCount()).thenReturn(0);
        when(statisticsToCount.commentCount()).thenReturn(5);

        Counter counter = new Counter(statisticsToCount);

        //When
        counter.calculateAdvStatistic(statisticsToCount);
        double one = counter.getCommentPerPost();
        double two = counter.getCommentPerUser();
        double three = counter.getPostPerUser();

        //Then
        Assert.assertEquals(0, one, 0);
        Assert.assertEquals(0, two, 0);
        Assert.assertEquals(0, three,0);
    }

    @Test
    public void testCounterMorePostThanComm() {
        //Given
        Statistics statisticsToCount = mock(Statistics.class);
        List<String> theList = new ArrayList<>();
        for(int i = 0; i < 100; i++) {
            theList.add("i");
        }
        when(statisticsToCount.userName()).thenReturn(theList);
        when(statisticsToCount.postCount()).thenReturn(2000);
        when(statisticsToCount.commentCount()).thenReturn(1000);

        Counter counter = new Counter(statisticsToCount);

        //When
        counter.calculateAdvStatistic(statisticsToCount);
        double one = counter.getCommentPerPost();
        double two = counter.getCommentPerUser();
        double three = counter.getPostPerUser();

        //Then
        Assert.assertEquals(0.5, one, 0.1);
        Assert.assertEquals(10, two, 0.00005);
        Assert.assertEquals(20, three,0);
    }

    @Test
    public void testCounterMoreCommThanPost() {
        //Given
        Statistics statisticsToCount = mock(Statistics.class);
        List<String> theList = new ArrayList<>();
        for(int i = 0; i < 100; i++) {
            theList.add("i");
        }
        when(statisticsToCount.userName()).thenReturn(theList);
        when(statisticsToCount.postCount()).thenReturn(1000);
        when(statisticsToCount.commentCount()).thenReturn(2000);

        Counter counter = new Counter(statisticsToCount);

        //When
        counter.calculateAdvStatistic(statisticsToCount);
        double one  = counter.getCommentPerPost();
        double two = counter.getCommentPerUser();
        double three = counter.getPostPerUser();

        //Then
        Assert.assertEquals(2, one, 0);
        Assert.assertEquals(20, two, 0);
        Assert.assertEquals(10, three,0);
    }
}
