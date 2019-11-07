package com.github.theholywaffle.teamspeak3.api.wrapper;

import com.github.theholywaffle.teamspeak3.api.wrapper.DatabaseClient;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DatabaseClient_getLastConnectedDateTest_6_Test {
//failed_pass   @Test
//  public void getLastConnectedDateTest() throws Exception {
//    // Arrange
//    HashMap<String, String> hashMap = new HashMap<String, String>();
//    hashMap.put("aaaaa", "aaaaa");
//    DatabaseClient databaseClient = new DatabaseClient(hashMap);
//
//    // Act
//    Date actual = databaseClient.getLastConnectedDate();
//
//    // Assert
//    int year = actual.getYear();
//    int timezoneOffset = actual.getTimezoneOffset();
//    int hours = actual.getHours();
//    String toStringResult = actual.toString();
//    int minutes = actual.getMinutes();
//    long time = actual.getTime();
//    int seconds = actual.getSeconds();
//    int month = actual.getMonth();
//    int date = actual.getDate();
//    String toLocaleStringResult = actual.toLocaleString();
//    Assert.assertEquals(69, year);
//    Assert.assertEquals(3, actual.getDay());
//    Assert.assertEquals("Dec 31, 1969 11:59:59 PM", toLocaleStringResult);
//    Assert.assertEquals(31, date);
//    Assert.assertEquals(11, month);
//    Assert.assertEquals(59, seconds);
//    Assert.assertEquals(-1000L, time);
//    Assert.assertEquals(59, minutes);
//    Assert.assertEquals("Wed Dec 31 23:59:59 UTC 1969", toStringResult);
//    Assert.assertEquals(23, hours);
//    Assert.assertEquals(0, timezoneOffset);
//    String nickname = databaseClient.getNickname();
//    String toStringResult1 = databaseClient.toString();
//    String lastIp = databaseClient.getLastIp();
//    Map<String, String> map = databaseClient.getMap();
//    Date createdDate = databaseClient.getCreatedDate();
//    Date lastConnectedDate = databaseClient.getLastConnectedDate();
//    int totalConnections = databaseClient.getTotalConnections();
//    String uniqueIdentifier = databaseClient.getUniqueIdentifier();
//    String description = databaseClient.getDescription();
//    Assert.assertEquals("", nickname);
//    Assert.assertEquals(-1, databaseClient.getDatabaseId());
//    Assert.assertEquals("", description);
//    Assert.assertEquals("", uniqueIdentifier);
//    Assert.assertEquals(-1, totalConnections);
//    int year1 = lastConnectedDate.getYear();
//    int timezoneOffset1 = lastConnectedDate.getTimezoneOffset();
//    int hours1 = lastConnectedDate.getHours();
//    String toStringResult2 = lastConnectedDate.toString();
//    int minutes1 = lastConnectedDate.getMinutes();
//    long time1 = lastConnectedDate.getTime();
//    int seconds1 = lastConnectedDate.getSeconds();
//    int month1 = lastConnectedDate.getMonth();
//    int date1 = lastConnectedDate.getDate();
//    String toLocaleStringResult1 = lastConnectedDate.toLocaleString();
//    int day = lastConnectedDate.getDay();
//    int year2 = createdDate.getYear();
//    int timezoneOffset2 = createdDate.getTimezoneOffset();
//    int hours2 = createdDate.getHours();
//    String toStringResult3 = createdDate.toString();
//    int minutes2 = createdDate.getMinutes();
//    long time2 = createdDate.getTime();
//    int seconds2 = createdDate.getSeconds();
//    int month2 = createdDate.getMonth();
//    int date2 = createdDate.getDate();
//    String toLocaleStringResult2 = createdDate.toLocaleString();
//    Assert.assertEquals("{aaaaa=aaaaa}", toStringResult1);
//    Assert.assertSame(hashMap, map);
//    Assert.assertTrue(map instanceof HashMap);
//    Assert.assertEquals("", lastIp);
//    Assert.assertSame(hashMap, map);
//    Assert.assertEquals(31, date2);
//    Assert.assertEquals(11, month2);
//    Assert.assertEquals(59, seconds2);
//    Assert.assertEquals(-1000L, time2);
//    Assert.assertEquals(59, minutes2);
//    Assert.assertEquals("Wed Dec 31 23:59:59 UTC 1969", toStringResult3);
//    Assert.assertEquals(23, hours2);
//    Assert.assertEquals(0, timezoneOffset2);
//    Assert.assertEquals(69, year2);
//    Assert.assertEquals("Dec 31, 1969 11:59:59 PM", toLocaleStringResult1);
//    Assert.assertEquals(31, date1);
//    Assert.assertEquals(0, timezoneOffset1);
//    Assert.assertEquals(59, seconds1);
//    Assert.assertEquals(-1000L, time1);
//    Assert.assertEquals(59, minutes1);
//    Assert.assertEquals("Wed Dec 31 23:59:59 UTC 1969", toStringResult2);
//    Assert.assertEquals(23, hours1);
//    Assert.assertEquals("Dec 31, 1969 11:59:59 PM", toLocaleStringResult2);
//    Assert.assertEquals(69, year1);
//    Assert.assertEquals(3, day);
//    Assert.assertEquals(11, month1);
//    Assert.assertEquals(3, createdDate.getDay());
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
