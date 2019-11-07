package com.github.theholywaffle.teamspeak3.commands.response;

import com.github.theholywaffle.teamspeak3.api.wrapper.QueryError;
import com.github.theholywaffle.teamspeak3.commands.response.DefaultArrayResponse;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class DefaultArrayResponse_parseErrorTest_6_Test {
  @Test
  public void parseErrorTest() throws Exception {
    // Arrange
    String rawError = "aaaaa";

    // Act and Assert
    thrown.expect(StringIndexOutOfBoundsException.class);
    DefaultArrayResponse.parseError(rawError);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
