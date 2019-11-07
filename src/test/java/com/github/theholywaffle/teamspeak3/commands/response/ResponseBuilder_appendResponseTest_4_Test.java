package com.github.theholywaffle.teamspeak3.commands.response;

import com.github.theholywaffle.teamspeak3.commands.Command;
import com.github.theholywaffle.teamspeak3.commands.response.ResponseBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ResponseBuilder_appendResponseTest_4_Test {
  @Test
  public void appendResponseTest() throws Exception {
    // Arrange
    ResponseBuilder responseBuilder = new ResponseBuilder(null);
    String rawArrayResponse = "aaaaa";

    // Act
    responseBuilder.appendResponse(rawArrayResponse);

    // Assert
    String toStringResult = responseBuilder.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(null, responseBuilder.getCommand());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
