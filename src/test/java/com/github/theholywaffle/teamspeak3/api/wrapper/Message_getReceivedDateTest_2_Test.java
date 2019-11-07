package com.github.theholywaffle.teamspeak3.api.wrapper;

import com.github.theholywaffle.teamspeak3.api.wrapper.Message;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Message_getReceivedDateTest_2_Test {
//failed_pass   @Test
//  public void getReceivedDateTest() throws Exception {
//    // Arrange
//    HashMap<String, String> hashMap = new HashMap<String, String>();
//    hashMap.put("aaaaa", "aaaaa");
//    Message message = new Message(hashMap);
//
//    // Act
//    Date actual = message.getReceivedDate();
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
//    int id = message.getId();
//    Date receivedDate = message.getReceivedDate();
//    String toStringResult1 = message.toString();
//    boolean hasBeenReadResult = message.hasBeenRead();
//    Map<String, String> map = message.getMap();
//    String senderUniqueIdentifier = message.getSenderUniqueIdentifier();
//    Assert.assertEquals(-1, id);
//    Assert.assertEquals("", message.getSubject());
//    Assert.assertEquals("", senderUniqueIdentifier);
//    Assert.assertSame(hashMap, map);
//    Assert.assertTrue(map instanceof HashMap);
//    Assert.assertFalse(hasBeenReadResult);
//    Assert.assertSame(hashMap, map);
//    Assert.assertEquals("{aaaaa=aaaaa}", toStringResult1);
//    int year1 = receivedDate.getYear();
//    int timezoneOffset1 = receivedDate.getTimezoneOffset();
//    int hours1 = receivedDate.getHours();
//    String toStringResult2 = receivedDate.toString();
//    int minutes1 = receivedDate.getMinutes();
//    long time1 = receivedDate.getTime();
//    int seconds1 = receivedDate.getSeconds();
//    int month1 = receivedDate.getMonth();
//    int date1 = receivedDate.getDate();
//    String toLocaleStringResult1 = receivedDate.toLocaleString();
//    Assert.assertEquals(69, year1);
//    Assert.assertEquals(3, receivedDate.getDay());
//    Assert.assertEquals("Dec 31, 1969 11:59:59 PM", toLocaleStringResult1);
//    Assert.assertEquals(31, date1);
//    Assert.assertEquals(11, month1);
//    Assert.assertEquals(59, seconds1);
//    Assert.assertEquals(-1000L, time1);
//    Assert.assertEquals(59, minutes1);
//    Assert.assertEquals("Wed Dec 31 23:59:59 UTC 1969", toStringResult2);
//    Assert.assertEquals(23, hours1);
//    Assert.assertEquals(0, timezoneOffset1);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
