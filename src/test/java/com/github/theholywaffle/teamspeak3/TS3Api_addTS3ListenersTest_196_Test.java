package com.github.theholywaffle.teamspeak3;

import com.github.theholywaffle.teamspeak3.CommandQueue;
import com.github.theholywaffle.teamspeak3.TS3Api;
import com.github.theholywaffle.teamspeak3.TS3ApiAsync;
import com.github.theholywaffle.teamspeak3.TS3Query;
import com.github.theholywaffle.teamspeak3.api.event.TS3Listener;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class TS3Api_addTS3ListenersTest_196_Test {
  @Test
  public void addTS3ListenersTest() throws Exception {
    // Arrange
    TS3Api tS3Api = new TS3Api(new TS3ApiAsync(new TS3Query(), null));
    TS3Listener tS3Listener = Whitebox.newInstance(TS3Listener.class);
    TS3Listener tS3Listener1 = Whitebox.newInstance(TS3Listener.class);
    TS3Listener tS3Listener2 = Whitebox.newInstance(TS3Listener.class);
    TS3Listener[] tS3ListenerArray = new TS3Listener[]{tS3Listener, tS3Listener1, tS3Listener2};

    // Act
    tS3Api.addTS3Listeners(tS3ListenerArray);

    // Assert
    Assert.assertEquals(3, tS3ListenerArray.length);
    Assert.assertSame(tS3Listener, tS3ListenerArray[0]);
    Assert.assertSame(tS3Listener2, tS3ListenerArray[2]);
    Assert.assertSame(tS3Listener1, tS3ListenerArray[1]);
    Assert.assertNotNull(tS3Api.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
