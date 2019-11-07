package com.github.theholywaffle.teamspeak3;

import com.github.theholywaffle.teamspeak3.CommandQueue;
import com.github.theholywaffle.teamspeak3.TS3ApiAsync;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class CommandQueue_getAsyncApiTest_2_Test {
  @Test
  public void getAsyncApiTest() throws Exception {
    // Arrange
    CommandQueue commandQueue = Whitebox.newInstance(CommandQueue.class);

    // Act
    TS3ApiAsync actual = commandQueue.getAsyncApi();

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
