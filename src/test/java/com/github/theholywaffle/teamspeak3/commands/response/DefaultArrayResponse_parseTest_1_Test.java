package com.github.theholywaffle.teamspeak3.commands.response;

import com.github.theholywaffle.teamspeak3.api.wrapper.Wrapper;
import com.github.theholywaffle.teamspeak3.commands.response.DefaultArrayResponse;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DefaultArrayResponse_parseTest_1_Test {
  @Test
  public void parseTest() throws Exception {
    // Arrange
    String rawResponse = "aaaaa";

    // Act
    DefaultArrayResponse actual = DefaultArrayResponse.parse(rawResponse);

    // Assert
    String toStringResult = actual.toString();
    Wrapper firstResponse = actual.getFirstResponse();
    Assert.assertEquals("aaaaa", toStringResult);
    Assert.assertEquals("aaaaa", actual.getRawResponse());
    String toStringResult1 = firstResponse.toString();
    Map<String, String> map = firstResponse.getMap();
    Assert.assertEquals("{aaaaa=}", toStringResult1);
    Assert.assertTrue(map instanceof java.util.HashMap);
    Assert.assertEquals(1, map.size());
    Assert.assertEquals("", map.get("aaaaa"));
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
