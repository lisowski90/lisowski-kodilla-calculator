package com.kodilla.jdbc;

import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbManagerTestSuite {

    @Test
    public void testGetConnection() throws SQLException {
        //Given

        //When
        DBManager dbManager = DBManager.getInstance();

        //Then
        Assert.assertNotNull(dbManager.getConnection());
    }

    @Test
    public void testSelectUser() throws SQLException {
        //Given
        DBManager dbManager = DBManager.getInstance();

        //When
        String sqlQuery = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getInt("ID") + ", " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
            statement.close();
            Assert.assertEquals(5, counter);
    }

    @Test
    public void testSelectUsersAndPosts() throws SQLException {
        //Given
        DBManager dbManager = DBManager.getInstance();

        //When
        String sqlQuery = "SELECT U.FIRSTNAME, U.LASTNAME, COUNT(*)\n" +
                            "FROM users U JOIN posts P ON U.ID = P.USER_ID\n" +
                            "GROUP BY P.USER_ID\n" +
                            "HAVING COUNT(*) > 1;";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }

        rs.close();
        statement.close();

        Assert.assertEquals(2, counter);

    }
}
