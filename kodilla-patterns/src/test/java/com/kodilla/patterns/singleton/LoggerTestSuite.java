package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testGetLastLog() {
        //Given
        Logger.getInstance().log("#321");
        //When
        String result = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("#321", result);
    }
}
