package com.github.theholywaffle.teamspeak3.commands;

import com.github.theholywaffle.teamspeak3.api.Property;
import com.github.theholywaffle.teamspeak3.commands.CommandBuilder;
import java.util.HashMap;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class CommandBuilder_addPropertiesTest_1_Test {
  @Test
  public void addPropertiesTest() throws Exception {
    // Arrange
    CommandBuilder commandBuilder = new CommandBuilder("aaaaa");
    HashMap<Property, String> hashMap = new HashMap<Property, String>();
    hashMap.put(Whitebox.newInstance(Property.class), "aaaaa");

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    commandBuilder.addProperties(hashMap);
    Assert.assertEquals(1, hashMap.size());
    Assert.assertNotNull(commandBuilder.toString());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
