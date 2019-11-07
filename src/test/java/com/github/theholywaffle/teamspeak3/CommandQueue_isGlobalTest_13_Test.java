package com.github.theholywaffle.teamspeak3;

import com.github.theholywaffle.teamspeak3.CommandQueue;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class CommandQueue_isGlobalTest_13_Test {
  @Test
  public void isGlobalTest() throws Exception {
    // Arrange
    CommandQueue commandQueue = Whitebox.newInstance(CommandQueue.class);

    // Act
    boolean actual = commandQueue.isGlobal();

    // Assert
    Assert.assertFalse(actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
