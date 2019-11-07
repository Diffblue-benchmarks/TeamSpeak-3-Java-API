package com.github.theholywaffle.teamspeak3;

import com.github.theholywaffle.teamspeak3.CommandQueue;
import com.github.theholywaffle.teamspeak3.TS3Api;
import com.github.theholywaffle.teamspeak3.TS3ApiAsync;
import com.github.theholywaffle.teamspeak3.TS3Query;
import com.github.theholywaffle.teamspeak3.api.wrapper.Message;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class TS3Api_setMessageReadTest_114_Test {
  @Test
  public void setMessageReadTest() throws Exception {
    // Arrange
    TS3Api tS3Api = new TS3Api(new TS3ApiAsync(new TS3Query(), null));
    HashMap<String, String> hashMap = new HashMap<String, String>();
    hashMap.put("aaaaa", "aaaak");
    Message message = new Message(hashMap);

    // Act and Assert
    thrown.expect(NullPointerException.class);
    tS3Api.setMessageRead(message);
    int id = message.getId();
    Date receivedDate = message.getReceivedDate();
    String toStringResult = message.toString();
    boolean hasBeenReadResult = message.hasBeenRead();
    Map<String, String> map = message.getMap();
    String senderUniqueIdentifier = message.getSenderUniqueIdentifier();
    Assert.assertEquals(-1, id);
    Assert.assertEquals("", message.getSubject());
    Assert.assertEquals("", senderUniqueIdentifier);
    Assert.assertSame(hashMap, map);
    Assert.assertTrue(map instanceof HashMap);
    Assert.assertFalse(hasBeenReadResult);
    Assert.assertSame(hashMap, map);
    Assert.assertEquals("{aaaaa=aaaak}", toStringResult);
    int year = receivedDate.getYear();
    int timezoneOffset = receivedDate.getTimezoneOffset();
    int hours = receivedDate.getHours();
    String toStringResult1 = receivedDate.toString();
    int minutes = receivedDate.getMinutes();
    long time = receivedDate.getTime();
    int seconds = receivedDate.getSeconds();
    int month = receivedDate.getMonth();
    int date = receivedDate.getDate();
    String toLocaleStringResult = receivedDate.toLocaleString();
    Assert.assertEquals(69, year);
    Assert.assertEquals(3, receivedDate.getDay());
    Assert.assertEquals("Dec 31, 1969 11:59:59 PM", toLocaleStringResult);
    Assert.assertEquals(31, date);
    Assert.assertEquals(11, month);
    Assert.assertEquals(59, seconds);
    Assert.assertEquals(-1000L, time);
    Assert.assertEquals(59, minutes);
    Assert.assertEquals("Wed Dec 31 23:59:59 UTC 1969", toStringResult1);
    Assert.assertEquals(23, hours);
    Assert.assertEquals(0, timezoneOffset);
    Assert.assertNotNull(tS3Api.toString());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
