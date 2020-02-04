package com.github.theholywaffle.teamspeak3.commands;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class ComplaintCommandsDiffblueTest {
  @Test
  public void complainListTest() {
    // Arrange and Act
    Command actualComplainListResult = ComplaintCommands.complainList(1);

    // Assert
    String actualName = actualComplainListResult.getName();
    String actualToStringResult = actualComplainListResult.toString();
    assertEquals("complainlist", actualName);
    assertEquals("complainlist tcldbid=1", actualToStringResult);
    assertFalse(actualComplainListResult.getFuture().isCancelled());
  }

  @Test
  public void complainDelTest() {
    // Arrange and Act
    Command actualComplainDelResult = ComplaintCommands.complainDel(1, 1);

    // Assert
    String actualName = actualComplainDelResult.getName();
    String actualToStringResult = actualComplainDelResult.toString();
    assertEquals("complaindel", actualName);
    assertEquals("complaindel tcldbid=1 fcldbid=1", actualToStringResult);
    assertFalse(actualComplainDelResult.getFuture().isCancelled());
  }

  @Test
  public void complainDelAllTest() {
    // Arrange and Act
    Command actualComplainDelAllResult = ComplaintCommands.complainDelAll(1);

    // Assert
    String actualName = actualComplainDelAllResult.getName();
    String actualToStringResult = actualComplainDelAllResult.toString();
    assertEquals("complaindelall", actualName);
    assertEquals("complaindelall tcldbid=1", actualToStringResult);
    assertFalse(actualComplainDelAllResult.getFuture().isCancelled());
  }

  @Test
  public void complainAddTest() {
    // Arrange and Act
    Command actualComplainAddResult = ComplaintCommands.complainAdd(1, "complainadd");

    // Assert
    String actualName = actualComplainAddResult.getName();
    String actualToStringResult = actualComplainAddResult.toString();
    assertEquals("complainadd", actualName);
    assertEquals("complainadd tcldbid=1 message=complainadd", actualToStringResult);
    assertFalse(actualComplainAddResult.getFuture().isCancelled());
  }
}

