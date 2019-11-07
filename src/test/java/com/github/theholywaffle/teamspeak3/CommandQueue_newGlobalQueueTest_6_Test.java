package com.github.theholywaffle.teamspeak3;

import com.github.theholywaffle.teamspeak3.CommandQueue;
import com.github.theholywaffle.teamspeak3.TS3Api;
import com.github.theholywaffle.teamspeak3.TS3ApiAsync;
import com.github.theholywaffle.teamspeak3.TS3Query;
import com.github.theholywaffle.teamspeak3.api.CommandFuture;
import com.github.theholywaffle.teamspeak3.api.wrapper.Binding;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CommandQueue_newGlobalQueueTest_6_Test {
  @Test
  public void newGlobalQueueTest() throws Exception {
    // Arrange
    TS3Query query = new TS3Query();
    boolean unlimited = true;

    // Act
    CommandQueue actual = CommandQueue.newGlobalQueue(query, unlimited);

    // Assert
    TS3Api api = actual.getApi();
    String toStringResult = actual.toString();
    TS3ApiAsync asyncApi = actual.getAsyncApi();
    boolean isGlobalResult = actual.isGlobal();
    long busyTime = actual.getBusyTime();
    String toStringResult1 = api.toString();
    Assert.assertEquals(0L, busyTime);
    Assert.assertNotNull(toStringResult);
    Assert.assertTrue(isGlobalResult);
    String toStringResult2 = asyncApi.toString();
    Assert.assertNotNull(toStringResult1);
    Assert.assertNotNull(toStringResult2);
    Assert.assertFalse((asyncApi.getBindings()).isDone());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
