package com.github.theholywaffle.teamspeak3.commands;

import com.github.theholywaffle.teamspeak3.api.ClientProperty;
import com.github.theholywaffle.teamspeak3.commands.ClientCommands;
import com.github.theholywaffle.teamspeak3.commands.Command;
import java.util.HashMap;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ClientCommands_clientUpdateTest_3_Test {
  @Test
  public void clientUpdateTest() throws Exception {
    // Arrange
    HashMap<ClientProperty, String> hashMap = new HashMap<ClientProperty, String>();
    hashMap.put(ClientProperty.CID, "aaaaa");

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    ClientCommands.clientUpdate(hashMap);
    Assert.assertEquals(1, hashMap.size());
    Assert.assertEquals("aaaaa", hashMap.get(ClientProperty.CID));
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
