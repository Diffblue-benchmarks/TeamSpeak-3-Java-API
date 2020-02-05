package com.github.theholywaffle.teamspeak3.commands;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DatabaseClientCommandsDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void clientDBEditTest() {
    // Arrange and Act
    Command actualClientDBEditResult = DatabaseClientCommands.clientDBEdit(123, null);

    // Assert
    String actualName = actualClientDBEditResult.getName();
    String actualToStringResult = actualClientDBEditResult.toString();
    assertEquals("clientdbedit", actualName);
    assertEquals("clientdbedit cldbid=123", actualToStringResult);
    assertFalse(actualClientDBEditResult.getFuture().isCancelled());
  }

  @Test
  public void clientDBInfoTest() {
    // Arrange and Act
    Command actualClientDBInfoResult = DatabaseClientCommands.clientDBInfo(123);

    // Assert
    String actualName = actualClientDBInfoResult.getName();
    String actualToStringResult = actualClientDBInfoResult.toString();
    assertEquals("clientdbinfo", actualName);
    assertEquals("clientdbinfo cldbid=123", actualToStringResult);
    assertFalse(actualClientDBInfoResult.getFuture().isCancelled());
  }

  @Test
  public void clientDBFindTest2() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    DatabaseClientCommands.clientDBFind("", true);
  }

  @Test
  public void clientDBFindTest() {
    // Arrange and Act
    Command actualClientDBFindResult = DatabaseClientCommands.clientDBFind("foo", true);

    // Assert
    String actualName = actualClientDBFindResult.getName();
    String actualToStringResult = actualClientDBFindResult.toString();
    assertEquals("clientdbfind", actualName);
    assertEquals("clientdbfind pattern=foo -uid", actualToStringResult);
    assertFalse(actualClientDBFindResult.getFuture().isCancelled());
  }

  @Test
  public void clientDBListTest() {
    // Arrange and Act
    Command actualClientDBListResult = DatabaseClientCommands.clientDBList(1, 10, true);

    // Assert
    String actualName = actualClientDBListResult.getName();
    String actualToStringResult = actualClientDBListResult.toString();
    assertEquals("clientdblist", actualName);
    assertEquals("clientdblist start=1 duration=10 -count", actualToStringResult);
    assertFalse(actualClientDBListResult.getFuture().isCancelled());
  }

  @Test
  public void clientDBDeleteTest() {
    // Arrange and Act
    Command actualClientDBDeleteResult = DatabaseClientCommands.clientDBDelete(123);

    // Assert
    String actualName = actualClientDBDeleteResult.getName();
    String actualToStringResult = actualClientDBDeleteResult.toString();
    assertEquals("clientdbdelete", actualName);
    assertEquals("clientdbdelete cldbid=123", actualToStringResult);
    assertFalse(actualClientDBDeleteResult.getFuture().isCancelled());
  }
}
