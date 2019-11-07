package com.github.theholywaffle.teamspeak3.api;

import com.github.theholywaffle.teamspeak3.api.CommandFuture;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CommandFuture_ofAnyTest_8_Test {
//failed_compile   @Test
//  public void ofAnyTest() throws Exception {
//    // Arrange
//    CommandFuture<Object> commandFuture = new CommandFuture<Object>();
//    CommandFuture<Object> commandFuture1 = new CommandFuture<Object>();
//    CommandFuture<Object> commandFuture2 = new CommandFuture<Object>();
//    CommandFuture<Object>[] commandFutureArray = new CommandFuture<Object>[]{commandFuture, commandFuture1,
//        commandFuture2};
//
//    // Act
//    CommandFuture<Object> actual = CommandFuture.<Object>ofAny(commandFutureArray);
//
//    // Assert
//    boolean isDoneResult = actual.isDone();
//    boolean isSuccessfulResult = actual.isSuccessful();
//    boolean hasFailedResult = actual.hasFailed();
//    String toStringResult = actual.toString();
//    Assert.assertFalse(isDoneResult);
//    Assert.assertFalse(actual.isCancelled());
//    Assert.assertNotNull(toStringResult);
//    Assert.assertFalse(hasFailedResult);
//    Assert.assertFalse(isSuccessfulResult);
//    Assert.assertEquals(3, commandFutureArray.length);
//    CommandFuture<Object> commandFuture3 = commandFutureArray[0];
//    CommandFuture<Object> commandFuture4 = commandFutureArray[1];
//    CommandFuture<Object> commandFuture5 = commandFutureArray[2];
//    Assert.assertSame(commandFuture, commandFuture3);
//    boolean isDoneResult1 = commandFuture3.isDone();
//    boolean isSuccessfulResult1 = commandFuture3.isSuccessful();
//    boolean hasFailedResult1 = commandFuture3.hasFailed();
//    String toStringResult1 = commandFuture3.toString();
//    boolean isCancelledResult = commandFuture3.isCancelled();
//    Assert.assertSame(commandFuture2, commandFuture5);
//    boolean isDoneResult2 = commandFuture5.isDone();
//    boolean isSuccessfulResult2 = commandFuture5.isSuccessful();
//    boolean hasFailedResult2 = commandFuture5.hasFailed();
//    String toStringResult2 = commandFuture5.toString();
//    boolean isCancelledResult1 = commandFuture5.isCancelled();
//    Assert.assertSame(commandFuture1, commandFuture4);
//    boolean isDoneResult3 = commandFuture4.isDone();
//    boolean isSuccessfulResult3 = commandFuture4.isSuccessful();
//    boolean hasFailedResult3 = commandFuture4.hasFailed();
//    String toStringResult3 = commandFuture4.toString();
//    Assert.assertFalse(isCancelledResult1);
//    Assert.assertFalse(commandFuture4.isCancelled());
//    Assert.assertNotNull(toStringResult3);
//    Assert.assertFalse(hasFailedResult3);
//    Assert.assertFalse(isSuccessfulResult3);
//    Assert.assertFalse(isDoneResult3);
//    Assert.assertNotNull(toStringResult2);
//    Assert.assertFalse(hasFailedResult2);
//    Assert.assertFalse(isSuccessfulResult2);
//    Assert.assertFalse(isDoneResult2);
//    Assert.assertNotNull(toStringResult1);
//    Assert.assertFalse(hasFailedResult1);
//    Assert.assertFalse(isSuccessfulResult1);
//    Assert.assertFalse(isDoneResult1);
//    Assert.assertFalse(isCancelledResult);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
