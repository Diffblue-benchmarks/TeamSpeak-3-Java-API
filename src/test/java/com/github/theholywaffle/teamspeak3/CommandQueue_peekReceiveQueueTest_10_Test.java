package com.github.theholywaffle.teamspeak3;

import com.github.theholywaffle.teamspeak3.CommandQueue;
import com.github.theholywaffle.teamspeak3.commands.Command;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class CommandQueue_peekReceiveQueueTest_10_Test {
//failed_run   @Test
//  public void peekReceiveQueueTest() throws Exception {
//    // Arrange
//    CommandQueue commandQueue = Whitebox.newInstance(CommandQueue.class);
//
//    // Act
//    Command actual = commandQueue.peekReceiveQueue();
//
//    // Assert
//    Assert.assertEquals(null, actual);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
