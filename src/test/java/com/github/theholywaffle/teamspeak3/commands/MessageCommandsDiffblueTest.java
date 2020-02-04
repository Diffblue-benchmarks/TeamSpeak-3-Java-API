package com.github.theholywaffle.teamspeak3.commands;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MessageCommandsDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void messageUpdateFlagTest() {
    // Arrange and Act
    Command actualMessageUpdateFlagResult = MessageCommands.messageUpdateFlag(123, true);

    // Assert
    String actualName = actualMessageUpdateFlagResult.getName();
    String actualToStringResult = actualMessageUpdateFlagResult.toString();
    assertEquals("messageupdateflag", actualName);
    assertEquals("messageupdateflag msgid=123 flag=1", actualToStringResult);
    assertFalse(actualMessageUpdateFlagResult.getFuture().isCancelled());
  }

  @Test
  public void messageGetTest() {
    // Arrange and Act
    Command actualMessageGetResult = MessageCommands.messageGet(123);

    // Assert
    String actualName = actualMessageGetResult.getName();
    String actualToStringResult = actualMessageGetResult.toString();
    assertEquals("messageget", actualName);
    assertEquals("messageget msgid=123", actualToStringResult);
    assertFalse(actualMessageGetResult.getFuture().isCancelled());
  }

  @Test
  public void messageDelTest() {
    // Arrange and Act
    Command actualMessageDelResult = MessageCommands.messageDel(123);

    // Assert
    String actualName = actualMessageDelResult.getName();
    String actualToStringResult = actualMessageDelResult.toString();
    assertEquals("messagedel", actualName);
    assertEquals("messagedel msgid=123", actualToStringResult);
    assertFalse(actualMessageDelResult.getFuture().isCancelled());
  }

  @Test
  public void messageAddTest2() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    MessageCommands.messageAdd("", "cluid", "message");
  }

  @Test
  public void messageAddTest() {
    // Arrange and Act
    Command actualMessageAddResult = MessageCommands.messageAdd("123", "cluid", "message");

    // Assert
    String actualName = actualMessageAddResult.getName();
    String actualToStringResult = actualMessageAddResult.toString();
    assertEquals("messageadd", actualName);
    assertEquals("messageadd cluid=123 subject=cluid message=message", actualToStringResult);
    assertFalse(actualMessageAddResult.getFuture().isCancelled());
  }

  @Test
  public void messageListTest() {
    // Arrange and Act
    Command actualMessageListResult = MessageCommands.messageList();

    // Assert
    String actualName = actualMessageListResult.getName();
    String actualToStringResult = actualMessageListResult.toString();
    assertEquals("messagelist", actualName);
    assertEquals("messagelist", actualToStringResult);
    assertFalse(actualMessageListResult.getFuture().isCancelled());
  }
}

