package com.github.theholywaffle.teamspeak3.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class ClientPropertyDiffblueTest {
  @Test
  public void isChangeableTest() {
    // Arrange, Act and Assert
    assertFalse(ClientProperty.CID.isChangeable());
  }

  @Test
  public void getNameTest() {
    // Arrange, Act and Assert
    assertEquals("cid", ClientProperty.CID.getName());
  }
}

