package com.github.theholywaffle.teamspeak3;

import com.github.theholywaffle.teamspeak3.CommandQueue;
import com.github.theholywaffle.teamspeak3.TS3Api;
import com.github.theholywaffle.teamspeak3.TS3ApiAsync;
import com.github.theholywaffle.teamspeak3.TS3Query;
import com.github.theholywaffle.teamspeak3.api.event.TS3EventType;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class TS3Api_registerEventsTest_21_Test {
  @Test
  public void registerEventsTest() throws Exception {
    // Arrange
    TS3Api tS3Api = new TS3Api(new TS3ApiAsync(new TS3Query(), null));
    TS3EventType[] tS3EventTypeArray = new TS3EventType[]{TS3EventType.SERVER, TS3EventType.SERVER,
        TS3EventType.SERVER};

    // Act and Assert
    thrown.expect(NullPointerException.class);
    tS3Api.registerEvents(tS3EventTypeArray);
    Assert.assertEquals(3, tS3EventTypeArray.length);
    Assert.assertArrayEquals(new TS3EventType[]{TS3EventType.SERVER, TS3EventType.SERVER, TS3EventType.SERVER},
        tS3EventTypeArray);
    Assert.assertNotNull(tS3Api.toString());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
