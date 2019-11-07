package com.github.theholywaffle.teamspeak3;

import com.github.theholywaffle.teamspeak3.CommandQueue;
import com.github.theholywaffle.teamspeak3.TS3ApiAsync;
import com.github.theholywaffle.teamspeak3.TS3Query;
import com.github.theholywaffle.teamspeak3.api.event.TS3Listener;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class TS3ApiAsync_removeTS3ListenersTest_152_Test {
  @Test
  public void removeTS3ListenersTest() throws Exception {
    // Arrange
    TS3ApiAsync tS3ApiAsync = new TS3ApiAsync(new TS3Query(), null);
    TS3Listener tS3Listener = Whitebox.newInstance(TS3Listener.class);
    TS3Listener tS3Listener1 = Whitebox.newInstance(TS3Listener.class);
    TS3Listener tS3Listener2 = Whitebox.newInstance(TS3Listener.class);
    TS3Listener[] tS3ListenerArray = new TS3Listener[]{tS3Listener, tS3Listener1, tS3Listener2};

    // Act
    tS3ApiAsync.removeTS3Listeners(tS3ListenerArray);

    // Assert
    Assert.assertEquals(3, tS3ListenerArray.length);
    Assert.assertSame(tS3Listener, tS3ListenerArray[0]);
    Assert.assertSame(tS3Listener2, tS3ListenerArray[2]);
    Assert.assertSame(tS3Listener1, tS3ListenerArray[1]);
    Assert.assertNotNull(tS3ApiAsync.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
