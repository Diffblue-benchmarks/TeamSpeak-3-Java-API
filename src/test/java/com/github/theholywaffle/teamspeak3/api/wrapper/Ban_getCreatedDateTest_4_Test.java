package com.github.theholywaffle.teamspeak3.api.wrapper;

import com.github.theholywaffle.teamspeak3.api.wrapper.Ban;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Ban_getCreatedDateTest_4_Test {
//failed_pass   @Test
//  public void getCreatedDateTest() throws Exception {
//    // Arrange
//    HashMap<String, String> hashMap = new HashMap<String, String>();
//    hashMap.put("aaaaa", "aaaaa");
//    Ban ban = new Ban(hashMap);
//
//    // Act
//    Date actual = ban.getCreatedDate();
//
//    // Assert
//    int timezoneOffset = actual.getTimezoneOffset();
//    int hours = actual.getHours();
//    String toStringResult = actual.toString();
//    int minutes = actual.getMinutes();
//    long time = actual.getTime();
//    int seconds = actual.getSeconds();
//    int month = actual.getMonth();
//    int date = actual.getDate();
//    String toLocaleStringResult = actual.toLocaleString();
//    Assert.assertEquals(0, timezoneOffset);
//    Assert.assertEquals(3, actual.getDay());
//    Assert.assertEquals("Dec 31, 1969 11:59:59 PM", toLocaleStringResult);
//    Assert.assertEquals(31, date);
//    Assert.assertEquals(11, month);
//    Assert.assertEquals(59, seconds);
//    Assert.assertEquals(-1000L, time);
//    Assert.assertEquals(59, minutes);
//    Assert.assertEquals("Wed Dec 31 23:59:59 UTC 1969", toStringResult);
//    Assert.assertEquals(23, hours);
//    String invokerName = ban.getInvokerName();
//    String toStringResult1 = ban.toString();
//    int enforcements = ban.getEnforcements();
//    Date createdDate = ban.getCreatedDate();
//    int invokerClientDBId = ban.getInvokerClientDBId();
//    String lastNickname = ban.getLastNickname();
//    String bannedName = ban.getBannedName();
//    int id = ban.getId();
//    String bannedIp = ban.getBannedIp();
//    String invokerUId = ban.getInvokerUId();
//    long duration = ban.getDuration();
//    Map<String, String> map = ban.getMap();
//    String reason = ban.getReason();
//    Assert.assertEquals("", invokerName);
//    Assert.assertEquals("", ban.getBannedUId());
//    Assert.assertEquals("", reason);
//    Assert.assertSame(hashMap, map);
//    Assert.assertTrue(map instanceof HashMap);
//    Assert.assertEquals(-1L, duration);
//    Assert.assertSame(hashMap, map);
//    Assert.assertEquals("", invokerUId);
//    Assert.assertEquals("", bannedIp);
//    Assert.assertEquals(-1, id);
//    Assert.assertEquals("", bannedName);
//    Assert.assertEquals("", lastNickname);
//    Assert.assertEquals(-1, invokerClientDBId);
//    int year = createdDate.getYear();
//    int timezoneOffset1 = createdDate.getTimezoneOffset();
//    int hours1 = createdDate.getHours();
//    String toStringResult2 = createdDate.toString();
//    int minutes1 = createdDate.getMinutes();
//    long time1 = createdDate.getTime();
//    int seconds1 = createdDate.getSeconds();
//    int month1 = createdDate.getMonth();
//    int date1 = createdDate.getDate();
//    String toLocaleStringResult1 = createdDate.toLocaleString();
//    Assert.assertEquals(-1, enforcements);
//    Assert.assertEquals("{aaaaa=aaaaa}", toStringResult1);
//    Assert.assertEquals("Dec 31, 1969 11:59:59 PM", toLocaleStringResult1);
//    Assert.assertEquals(31, date1);
//    Assert.assertEquals(11, month1);
//    Assert.assertEquals(59, seconds1);
//    Assert.assertEquals(-1000L, time1);
//    Assert.assertEquals(59, minutes1);
//    Assert.assertEquals("Wed Dec 31 23:59:59 UTC 1969", toStringResult2);
//    Assert.assertEquals(23, hours1);
//    Assert.assertEquals(0, timezoneOffset1);
//    Assert.assertEquals(69, year);
//    Assert.assertEquals(3, createdDate.getDay());
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
