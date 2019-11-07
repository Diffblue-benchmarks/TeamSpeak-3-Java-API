package com.github.theholywaffle.teamspeak3.commands.response;

import com.github.theholywaffle.teamspeak3.api.wrapper.Wrapper;
import com.github.theholywaffle.teamspeak3.commands.Command;
import com.github.theholywaffle.teamspeak3.commands.response.DefaultArrayResponse;
import com.github.theholywaffle.teamspeak3.commands.response.ResponseBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ResponseBuilder_buildResponseTest_1_Test {
  @Test
  public void buildResponseTest() throws Exception {
    // Arrange
    ResponseBuilder responseBuilder = new ResponseBuilder(null);

    // Act
    DefaultArrayResponse actual = responseBuilder.buildResponse();

    // Assert
    String toStringResult = actual.toString();
    Wrapper firstResponse = actual.getFirstResponse();
    Assert.assertEquals("", toStringResult);
    Assert.assertEquals("", actual.getRawResponse());
    Assert.assertEquals("{}", firstResponse.toString());
    String toStringResult1 = responseBuilder.toString();
    Assert.assertNotNull(toStringResult1);
    Assert.assertEquals(null, responseBuilder.getCommand());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
