package com.github.theholywaffle.teamspeak3.api;

import com.github.theholywaffle.teamspeak3.api.ClientProperty;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ClientProperty_isChangeableTest_2_Test {
  @Test
  public void isChangeableTest() throws Exception {
    // Arrange
    ClientProperty clientProperty = ClientProperty.CID;

    // Act
    boolean actual = clientProperty.isChangeable();

    // Assert
    Assert.assertFalse(actual);
    Assert.assertEquals(ClientProperty.CID, clientProperty);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
