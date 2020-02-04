package com.github.theholywaffle.teamspeak3.commands;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class DatabaseClientCommandsDiffblueTest {
  @Test
  public void clientDBEditTest() {
    // Arrange and Act
    Command actualClientDBEditResult = DatabaseClientCommands.clientDBEdit(1, null);

    // Assert
    String actualName = actualClientDBEditResult.getName();
    String actualToStringResult = actualClientDBEditResult.toString();
    assertEquals("clientdbedit", actualName);
    assertEquals("clientdbedit cldbid=1", actualToStringResult);
    assertFalse(actualClientDBEditResult.getFuture().isCancelled());
  }

  @Test
  public void clientDBInfoTest() {
    // Arrange and Act
    Command actualClientDBInfoResult = DatabaseClientCommands.clientDBInfo(1);

    // Assert
    String actualName = actualClientDBInfoResult.getName();
    String actualToStringResult = actualClientDBInfoResult.toString();
    assertEquals("clientdbinfo", actualName);
    assertEquals("clientdbinfo cldbid=1", actualToStringResult);
    assertFalse(actualClientDBInfoResult.getFuture().isCancelled());
  }

  @Test
  public void clientDBFindTest() {
    // Arrange and Act
    Command actualClientDBFindResult = DatabaseClientCommands.clientDBFind("cldbid", true);

    // Assert
    String actualName = actualClientDBFindResult.getName();
    String actualToStringResult = actualClientDBFindResult.toString();
    assertEquals("clientdbfind", actualName);
    assertEquals("clientdbfind pattern=cldbid -uid", actualToStringResult);
    assertFalse(actualClientDBFindResult.getFuture().isCancelled());
  }

  @Test
  public void clientDBListTest() {
    // Arrange and Act
    Command actualClientDBListResult = DatabaseClientCommands.clientDBList(1, 1, true);

    // Assert
    String actualName = actualClientDBListResult.getName();
    String actualToStringResult = actualClientDBListResult.toString();
    assertEquals("clientdblist", actualName);
    assertEquals("clientdblist start=1 duration=1 -count", actualToStringResult);
    assertFalse(actualClientDBListResult.getFuture().isCancelled());
  }

  @Test
  public void clientDBDeleteTest() {
    // Arrange and Act
    Command actualClientDBDeleteResult = DatabaseClientCommands.clientDBDelete(1);

    // Assert
    String actualName = actualClientDBDeleteResult.getName();
    String actualToStringResult = actualClientDBDeleteResult.toString();
    assertEquals("clientdbdelete", actualName);
    assertEquals("clientdbdelete cldbid=1", actualToStringResult);
    assertFalse(actualClientDBDeleteResult.getFuture().isCancelled());
  }
}

