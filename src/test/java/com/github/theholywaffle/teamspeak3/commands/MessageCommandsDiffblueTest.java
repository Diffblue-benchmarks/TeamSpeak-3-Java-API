package com.github.theholywaffle.teamspeak3.commands;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class MessageCommandsDiffblueTest {
  @Test
  public void messageUpdateFlagTest() {
    // Arrange and Act
    Command actualMessageUpdateFlagResult = MessageCommands.messageUpdateFlag(1, true);

    // Assert
    String actualName = actualMessageUpdateFlagResult.getName();
    String actualToStringResult = actualMessageUpdateFlagResult.toString();
    assertEquals("messageupdateflag", actualName);
    assertEquals("messageupdateflag msgid=1 flag=1", actualToStringResult);
    assertFalse(actualMessageUpdateFlagResult.getFuture().isCancelled());
  }

  @Test
  public void messageGetTest() {
    // Arrange and Act
    Command actualMessageGetResult = MessageCommands.messageGet(1);

    // Assert
    String actualName = actualMessageGetResult.getName();
    String actualToStringResult = actualMessageGetResult.toString();
    assertEquals("messageget", actualName);
    assertEquals("messageget msgid=1", actualToStringResult);
    assertFalse(actualMessageGetResult.getFuture().isCancelled());
  }

  @Test
  public void messageDelTest() {
    // Arrange and Act
    Command actualMessageDelResult = MessageCommands.messageDel(1);

    // Assert
    String actualName = actualMessageDelResult.getName();
    String actualToStringResult = actualMessageDelResult.toString();
    assertEquals("messagedel", actualName);
    assertEquals("messagedel msgid=1", actualToStringResult);
    assertFalse(actualMessageDelResult.getFuture().isCancelled());
  }

  @Test
  public void messageAddTest() {
    // Arrange and Act
    Command actualMessageAddResult = MessageCommands.messageAdd("cluid", "cluid", "cluid");

    // Assert
    String actualName = actualMessageAddResult.getName();
    String actualToStringResult = actualMessageAddResult.toString();
    assertEquals("messageadd", actualName);
    assertEquals("messageadd cluid=cluid subject=cluid message=cluid", actualToStringResult);
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

