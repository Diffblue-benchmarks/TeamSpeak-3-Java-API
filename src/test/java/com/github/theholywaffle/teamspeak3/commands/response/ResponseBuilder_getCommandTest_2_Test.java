package com.github.theholywaffle.teamspeak3.commands.response;

import com.github.theholywaffle.teamspeak3.commands.Command;
import com.github.theholywaffle.teamspeak3.commands.response.ResponseBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ResponseBuilder_getCommandTest_2_Test {
  @Test
  public void getCommandTest() throws Exception {
    // Arrange
    ResponseBuilder responseBuilder = new ResponseBuilder(null);

    // Act
    Command actual = responseBuilder.getCommand();

    // Assert
    Assert.assertEquals(null, actual);
    Assert.assertNotNull(responseBuilder.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
