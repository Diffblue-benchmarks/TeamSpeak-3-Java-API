package com.github.theholywaffle.teamspeak3.commands;

import com.github.theholywaffle.teamspeak3.api.ServerInstanceProperty;
import com.github.theholywaffle.teamspeak3.commands.Command;
import com.github.theholywaffle.teamspeak3.commands.ServerCommands;
import java.util.HashMap;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ServerCommands_instanceEditTest_1_Test {
  @Test
  public void instanceEditTest() throws Exception {
    // Arrange
    HashMap<ServerInstanceProperty, String> hashMap = new HashMap<ServerInstanceProperty, String>();
    hashMap.put(ServerInstanceProperty.CONNECTION_BANDWIDTH_RECEIVED_LAST_MINUTE_TOTAL, "aaaaa");

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    ServerCommands.instanceEdit(hashMap);
    Assert.assertEquals(1, hashMap.size());
    Assert.assertEquals("aaaaa", hashMap.get(ServerInstanceProperty.CONNECTION_BANDWIDTH_RECEIVED_LAST_MINUTE_TOTAL));
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
