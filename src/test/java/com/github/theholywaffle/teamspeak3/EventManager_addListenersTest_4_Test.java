package com.github.theholywaffle.teamspeak3;

import com.github.theholywaffle.teamspeak3.EventManager;
import com.github.theholywaffle.teamspeak3.TS3Query;
import com.github.theholywaffle.teamspeak3.api.event.TS3Listener;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class EventManager_addListenersTest_4_Test {
  @Test
  public void addListenersTest() throws Exception {
    // Arrange
    EventManager eventManager = new EventManager(new TS3Query());
    TS3Listener tS3Listener = Whitebox.newInstance(TS3Listener.class);
    TS3Listener tS3Listener1 = Whitebox.newInstance(TS3Listener.class);
    TS3Listener tS3Listener2 = Whitebox.newInstance(TS3Listener.class);
    TS3Listener[] tS3ListenerArray = new TS3Listener[]{tS3Listener, tS3Listener1, tS3Listener2};

    // Act
    eventManager.addListeners(tS3ListenerArray);

    // Assert
    Assert.assertEquals(3, tS3ListenerArray.length);
    Assert.assertSame(tS3Listener, tS3ListenerArray[0]);
    Assert.assertSame(tS3Listener2, tS3ListenerArray[2]);
    Assert.assertSame(tS3Listener1, tS3ListenerArray[1]);
    Assert.assertNotNull(eventManager.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
