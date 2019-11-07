package com.github.theholywaffle.teamspeak3.api;

import com.github.theholywaffle.teamspeak3.api.ClientProperty;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ClientProperty_getNameTest_1_Test {
  @Test
  public void getNameTest() throws Exception {
    // Arrange
    ClientProperty clientProperty = ClientProperty.CID;

    // Act
    String actual = clientProperty.getName();

    // Assert
    Assert.assertEquals("cid", actual);
    Assert.assertEquals(ClientProperty.CID, clientProperty);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
