package com.github.theholywaffle.teamspeak3.api.wrapper;

import com.github.theholywaffle.teamspeak3.api.wrapper.DatabaseClientInfo;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DatabaseClientInfo_getMonthlyBytesDownloadedTest_9_Test {
//failed_pass   @Test
//  public void getMonthlyBytesDownloadedTest() throws Exception {
//    // Arrange
//    HashMap<String, String> hashMap = new HashMap<String, String>();
//    hashMap.put("aaaaa", "aaaaa");
//    DatabaseClientInfo databaseClientInfo = new DatabaseClientInfo(hashMap);
//
//    // Act
//    long actual = databaseClientInfo.getMonthlyBytesDownloaded();
//
//    // Assert
//    Assert.assertEquals(-1L, actual);
//    String toStringResult = databaseClientInfo.toString();
//    Date createdDate = databaseClientInfo.getCreatedDate();
//    Date lastConnectedDate = databaseClientInfo.getLastConnectedDate();
//    long monthlyBytesDownloaded = databaseClientInfo.getMonthlyBytesDownloaded();
//    long totalBytesDownloaded = databaseClientInfo.getTotalBytesDownloaded();
//    String nickname = databaseClientInfo.getNickname();
//    String lastIp = databaseClientInfo.getLastIp();
//    Map<String, String> map = databaseClientInfo.getMap();
//    int totalConnections = databaseClientInfo.getTotalConnections();
//    long totalBytesUploaded = databaseClientInfo.getTotalBytesUploaded();
//    String uniqueIdentifier = databaseClientInfo.getUniqueIdentifier();
//    String description = databaseClientInfo.getDescription();
//    long iconId = databaseClientInfo.getIconId();
//    int databaseId = databaseClientInfo.getDatabaseId();
//    String avatar = databaseClientInfo.getAvatar();
//    long monthlyBytesUploaded = databaseClientInfo.getMonthlyBytesUploaded();
//    Assert.assertEquals("{aaaaa=aaaaa}", toStringResult);
//    Assert.assertEquals("", databaseClientInfo.getBase64HashClientUID());
//    Assert.assertEquals(-1L, monthlyBytesUploaded);
//    Assert.assertEquals("", avatar);
//    Assert.assertEquals(-1, databaseId);
//    Assert.assertEquals(-1L, iconId);
//    Assert.assertEquals("", description);
//    Assert.assertEquals("", uniqueIdentifier);
//    Assert.assertEquals(-1L, totalBytesUploaded);
//    Assert.assertEquals(-1, totalConnections);
//    Assert.assertSame(hashMap, map);
//    Assert.assertTrue(map instanceof HashMap);
//    Assert.assertEquals("", lastIp);
//    Assert.assertSame(hashMap, map);
//    Assert.assertEquals("", nickname);
//    Assert.assertEquals(-1L, totalBytesDownloaded);
//    Assert.assertEquals(-1L, monthlyBytesDownloaded);
//    int year = lastConnectedDate.getYear();
//    int timezoneOffset = lastConnectedDate.getTimezoneOffset();
//    int hours = lastConnectedDate.getHours();
//    String toStringResult1 = lastConnectedDate.toString();
//    int minutes = lastConnectedDate.getMinutes();
//    long time = lastConnectedDate.getTime();
//    int seconds = lastConnectedDate.getSeconds();
//    int month = lastConnectedDate.getMonth();
//    int date = lastConnectedDate.getDate();
//    String toLocaleStringResult = lastConnectedDate.toLocaleString();
//    int day = lastConnectedDate.getDay();
//    int year1 = createdDate.getYear();
//    int timezoneOffset1 = createdDate.getTimezoneOffset();
//    int hours1 = createdDate.getHours();
//    String toStringResult2 = createdDate.toString();
//    int minutes1 = createdDate.getMinutes();
//    long time1 = createdDate.getTime();
//    int seconds1 = createdDate.getSeconds();
//    int month1 = createdDate.getMonth();
//    int date1 = createdDate.getDate();
//    String toLocaleStringResult1 = createdDate.toLocaleString();
//    Assert.assertEquals(3, day);
//    Assert.assertEquals(3, createdDate.getDay());
//    Assert.assertEquals("Dec 31, 1969 11:59:59 PM", toLocaleStringResult1);
//    Assert.assertEquals(31, date1);
//    Assert.assertEquals(11, month1);
//    Assert.assertEquals(59, seconds1);
//    Assert.assertEquals(-1000L, time1);
//    Assert.assertEquals(59, minutes1);
//    Assert.assertEquals("Wed Dec 31 23:59:59 UTC 1969", toStringResult2);
//    Assert.assertEquals(23, hours1);
//    Assert.assertEquals(0, timezoneOffset1);
//    Assert.assertEquals(69, year1);
//    Assert.assertEquals("Dec 31, 1969 11:59:59 PM", toLocaleStringResult);
//    Assert.assertEquals(31, date);
//    Assert.assertEquals(11, month);
//    Assert.assertEquals(59, seconds);
//    Assert.assertEquals(-1000L, time);
//    Assert.assertEquals(59, minutes);
//    Assert.assertEquals("Wed Dec 31 23:59:59 UTC 1969", toStringResult1);
//    Assert.assertEquals(23, hours);
//    Assert.assertEquals(0, timezoneOffset);
//    Assert.assertEquals(69, year);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
