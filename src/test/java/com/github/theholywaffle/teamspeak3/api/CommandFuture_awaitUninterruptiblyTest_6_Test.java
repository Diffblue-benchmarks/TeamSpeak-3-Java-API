package com.github.theholywaffle.teamspeak3.api;

import com.github.theholywaffle.teamspeak3.api.CommandFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class CommandFuture_awaitUninterruptiblyTest_6_Test {
  @Test
  public void awaitUninterruptiblyTest() throws Exception {
    // Arrange
    CommandFuture<Object> commandFuture = new CommandFuture<Object>();
    long timeout = 1L;
    TimeUnit unit = TimeUnit.NANOSECONDS;

    // Act and Assert
    thrown.expect(TimeoutException.class);
    commandFuture.awaitUninterruptibly(timeout, unit);
    boolean isSuccessfulResult = commandFuture.isSuccessful();
    boolean hasFailedResult = commandFuture.hasFailed();
    String toStringResult = commandFuture.toString();
    Assert.assertFalse(isSuccessfulResult);
    Assert.assertFalse(commandFuture.isCancelled());
    Assert.assertNotNull(toStringResult);
    Assert.assertFalse(hasFailedResult);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
