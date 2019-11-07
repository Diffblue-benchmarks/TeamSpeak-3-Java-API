package com.github.theholywaffle.teamspeak3.commands;

import com.github.theholywaffle.teamspeak3.api.VirtualServerProperty;
import com.github.theholywaffle.teamspeak3.commands.Command;
import com.github.theholywaffle.teamspeak3.commands.VirtualServerCommands;
import java.util.HashMap;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class VirtualServerCommands_serverEditTest_8_Test {
  @Test
  public void serverEditTest() throws Exception {
    // Arrange
    HashMap<VirtualServerProperty, String> hashMap = new HashMap<VirtualServerProperty, String>();
    hashMap.put(VirtualServerProperty.CONNECTION_BANDWIDTH_RECEIVED_LAST_MINUTE_TOTAL, "aaaaa");

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    VirtualServerCommands.serverEdit(hashMap);
    Assert.assertEquals(1, hashMap.size());
    Assert.assertEquals("aaaaa", hashMap.get(VirtualServerProperty.CONNECTION_BANDWIDTH_RECEIVED_LAST_MINUTE_TOTAL));
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
