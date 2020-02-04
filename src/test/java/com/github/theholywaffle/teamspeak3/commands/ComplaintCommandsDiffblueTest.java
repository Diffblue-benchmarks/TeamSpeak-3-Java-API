package com.github.theholywaffle.teamspeak3.commands;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class ComplaintCommandsDiffblueTest {
  @Test
  public void complainListTest() {
    // Arrange and Act
    Command actualComplainListResult = ComplaintCommands.complainList(123);

    // Assert
    String actualName = actualComplainListResult.getName();
    String actualToStringResult = actualComplainListResult.toString();
    assertEquals("complainlist", actualName);
    assertEquals("complainlist tcldbid=123", actualToStringResult);
    assertFalse(actualComplainListResult.getFuture().isCancelled());
  }

  @Test
  public void complainDelTest() {
    // Arrange and Act
    Command actualComplainDelResult = ComplaintCommands.complainDel(123, 123);

    // Assert
    String actualName = actualComplainDelResult.getName();
    String actualToStringResult = actualComplainDelResult.toString();
    assertEquals("complaindel", actualName);
    assertEquals("complaindel tcldbid=123 fcldbid=123", actualToStringResult);
    assertFalse(actualComplainDelResult.getFuture().isCancelled());
  }

  @Test
  public void complainDelAllTest() {
    // Arrange and Act
    Command actualComplainDelAllResult = ComplaintCommands.complainDelAll(123);

    // Assert
    String actualName = actualComplainDelAllResult.getName();
    String actualToStringResult = actualComplainDelAllResult.toString();
    assertEquals("complaindelall", actualName);
    assertEquals("complaindelall tcldbid=123", actualToStringResult);
    assertFalse(actualComplainDelAllResult.getFuture().isCancelled());
  }

  @Test
  public void complainAddTest() {
    // Arrange and Act
    Command actualComplainAddResult = ComplaintCommands.complainAdd(123, "message");

    // Assert
    String actualName = actualComplainAddResult.getName();
    String actualToStringResult = actualComplainAddResult.toString();
    assertEquals("complainadd", actualName);
    assertEquals("complainadd tcldbid=123 message=message", actualToStringResult);
    assertFalse(actualComplainAddResult.getFuture().isCancelled());
  }
}

