package com.github.theholywaffle.teamspeak3.commands.response;

import com.github.theholywaffle.teamspeak3.commands.Command;
import com.github.theholywaffle.teamspeak3.commands.response.ResponseBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ResponseBuilder_ResponseBuilderTest_3_Test {
  @Test
  public void ResponseBuilderTest() throws Exception {
    // Arrange
    Command command = (Command) null;

    // Act
    ResponseBuilder responseBuilder = new ResponseBuilder(command);

    // Assert
    String toStringResult = responseBuilder.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(null, responseBuilder.getCommand());
    Assert.assertEquals(null, command);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
