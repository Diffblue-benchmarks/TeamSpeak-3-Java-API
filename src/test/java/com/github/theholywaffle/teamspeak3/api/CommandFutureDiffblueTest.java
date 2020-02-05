package com.github.theholywaffle.teamspeak3.api;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.github.theholywaffle.teamspeak3.api.exception.TS3Exception;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CommandFutureDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void setTest() {
    // Arrange
    CommandFuture<Object> commandFuture = new CommandFuture<Object>();

    // Act and Assert
    assertTrue(commandFuture.set("value"));
    boolean actualIsDoneResult = commandFuture.isDone();
    assertTrue(actualIsDoneResult);
    assertTrue(commandFuture.getUninterruptibly() instanceof String);
  }

  @Test
  public void onFailureTest() {
    // Arrange
    CommandFuture<Object> commandFuture = new CommandFuture<Object>();

    // Act and Assert
    assertSame(commandFuture, commandFuture.onFailure(null));
  }

  @Test
  public void isSuccessfulTest() {
    // Arrange, Act and Assert
    assertFalse((new CommandFuture<Object>()).isSuccessful());
  }

  @Test
  public void forwardSuccessTest() {
    // Arrange
    CommandFuture<Object> commandFuture = new CommandFuture<Object>();

    // Act and Assert
    assertSame(commandFuture, commandFuture.forwardSuccess(new CommandFuture<Object>()));
  }

  @Test
  public void isDoneTest() {
    // Arrange, Act and Assert
    assertFalse((new CommandFuture<Object>()).isDone());
  }

  @Test
  public void getTest() throws InterruptedException, TimeoutException {
    // Arrange, Act and Assert
    thrown.expect(TimeoutException.class);
    (new CommandFuture<Object>()).get(10L, TimeUnit.NANOSECONDS);
  }

  @Test
  public void immediateTest() {
    // Arrange and Act
    CommandFuture<Object> actualImmediateResult = CommandFuture.<Object>immediate("value");

    // Assert
    boolean actualIsDoneResult = actualImmediateResult.isDone();
    assertTrue(actualIsDoneResult);
    assertTrue(actualImmediateResult.getUninterruptibly() instanceof String);
  }

  @Test
  public void awaitTest2() throws InterruptedException, TimeoutException {
    // Arrange, Act and Assert
    thrown.expect(TimeoutException.class);
    (new CommandFuture<Object>()).await(349676884L, TimeUnit.NANOSECONDS);
  }

  @Test
  public void awaitTest() throws InterruptedException, TimeoutException {
    // Arrange, Act and Assert
    thrown.expect(TimeoutException.class);
    (new CommandFuture<Object>()).await(10L, TimeUnit.NANOSECONDS);
  }

  @Test
  public void ofAnyTest() {
    // Arrange
    CommandFuture<Object> commandFuture = new CommandFuture<Object>();
    CommandFuture<Object> commandFuture1 = new CommandFuture<Object>();

    // Act and Assert
    assertFalse(CommandFuture.<Object>ofAny(commandFuture, commandFuture1, new CommandFuture<Object>()).isDone());
  }

  @Test
  public void awaitUninterruptiblyTest() throws TimeoutException {
    // Arrange, Act and Assert
    thrown.expect(TimeoutException.class);
    (new CommandFuture<Object>()).awaitUninterruptibly(10L, TimeUnit.NANOSECONDS);
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertFalse((new CommandFuture<Object>()).isDone());
  }

  @Test
  public void getUninterruptiblyTest2() throws TimeoutException {
    // Arrange, Act and Assert
    thrown.expect(TimeoutException.class);
    (new CommandFuture<Object>()).getUninterruptibly(349643923L, TimeUnit.NANOSECONDS);
  }

  @Test
  public void getUninterruptiblyTest() throws TimeoutException {
    // Arrange, Act and Assert
    thrown.expect(TimeoutException.class);
    (new CommandFuture<Object>()).getUninterruptibly(10L, TimeUnit.NANOSECONDS);
  }

  @Test
  public void isCancelledTest() {
    // Arrange, Act and Assert
    assertFalse((new CommandFuture<Object>()).isCancelled());
  }

  @Test
  public void cancelTest() {
    // Arrange
    CommandFuture<Object> commandFuture = new CommandFuture<Object>();

    // Act and Assert
    assertTrue(commandFuture.cancel(true));
    assertTrue(commandFuture.isDone());
  }

  @Test
  public void forwardFailureTest() {
    // Arrange
    CommandFuture<Object> commandFuture = new CommandFuture<Object>();

    // Act and Assert
    assertSame(commandFuture, commandFuture.forwardFailure(new CommandFuture<Object>()));
  }

  @Test
  public void failTest() {
    // Arrange
    CommandFuture<Object> commandFuture = new CommandFuture<Object>();

    // Act and Assert
    assertTrue(commandFuture.fail(new TS3Exception("foo")));
    assertTrue(commandFuture.isDone());
  }

  @Test
  public void ofAllTest() {
    // Arrange
    CommandFuture<Object> commandFuture = new CommandFuture<Object>();
    CommandFuture<Object> commandFuture1 = new CommandFuture<Object>();

    // Act and Assert
    assertFalse(CommandFuture.<Object>ofAll(commandFuture, commandFuture1, new CommandFuture<Object>()).isDone());
  }

  @Test
  public void hasFailedTest() {
    // Arrange, Act and Assert
    assertFalse((new CommandFuture<Object>()).hasFailed());
  }
}

