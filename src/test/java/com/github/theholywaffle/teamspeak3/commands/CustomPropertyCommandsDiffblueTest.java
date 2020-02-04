package com.github.theholywaffle.teamspeak3.commands;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class CustomPropertyCommandsDiffblueTest {
  @Test
  public void customSearchTest() {
    // Arrange and Act
    Command actualCustomSearchResult = CustomPropertyCommands.customSearch("cldbid", "cldbid");

    // Assert
    String actualName = actualCustomSearchResult.getName();
    String actualToStringResult = actualCustomSearchResult.toString();
    assertEquals("customsearch", actualName);
    assertEquals("customsearch ident=cldbid pattern=cldbid", actualToStringResult);
    assertFalse(actualCustomSearchResult.getFuture().isCancelled());
  }

  @Test
  public void customDeleteTest() {
    // Arrange and Act
    Command actualCustomDeleteResult = CustomPropertyCommands.customDelete(1, "cldbid");

    // Assert
    String actualName = actualCustomDeleteResult.getName();
    String actualToStringResult = actualCustomDeleteResult.toString();
    assertEquals("customdelete", actualName);
    assertEquals("customdelete cldbid=1 ident=cldbid", actualToStringResult);
    assertFalse(actualCustomDeleteResult.getFuture().isCancelled());
  }

  @Test
  public void customSetTest() {
    // Arrange and Act
    Command actualCustomSetResult = CustomPropertyCommands.customSet(1, "cldbid", "cldbid");

    // Assert
    String actualName = actualCustomSetResult.getName();
    String actualToStringResult = actualCustomSetResult.toString();
    assertEquals("customset", actualName);
    assertEquals("customset cldbid=1 ident=cldbid value=cldbid", actualToStringResult);
    assertFalse(actualCustomSetResult.getFuture().isCancelled());
  }

  @Test
  public void customInfoTest() {
    // Arrange and Act
    Command actualCustomInfoResult = CustomPropertyCommands.customInfo(1);

    // Assert
    String actualName = actualCustomInfoResult.getName();
    String actualToStringResult = actualCustomInfoResult.toString();
    assertEquals("custominfo", actualName);
    assertEquals("custominfo cldbid=1", actualToStringResult);
    assertFalse(actualCustomInfoResult.getFuture().isCancelled());
  }
}

