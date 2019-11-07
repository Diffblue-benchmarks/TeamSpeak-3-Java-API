package com.github.theholywaffle.teamspeak3;

import com.github.theholywaffle.teamspeak3.CommandQueue;
import com.github.theholywaffle.teamspeak3.TS3Api;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class CommandQueue_getApiTest_8_Test {
  @Test
  public void getApiTest() throws Exception {
    // Arrange
    CommandQueue commandQueue = Whitebox.newInstance(CommandQueue.class);

    // Act
    TS3Api actual = commandQueue.getApi();

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
