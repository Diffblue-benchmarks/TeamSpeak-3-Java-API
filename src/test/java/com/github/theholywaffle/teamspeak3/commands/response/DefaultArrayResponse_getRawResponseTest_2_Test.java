package com.github.theholywaffle.teamspeak3.commands.response;

import com.github.theholywaffle.teamspeak3.commands.response.DefaultArrayResponse;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class DefaultArrayResponse_getRawResponseTest_2_Test {
  @Test
  public void getRawResponseTest() throws Exception {
    // Arrange
    DefaultArrayResponse defaultArrayResponse = Whitebox.newInstance(DefaultArrayResponse.class);

    // Act
    String actual = defaultArrayResponse.getRawResponse();

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
