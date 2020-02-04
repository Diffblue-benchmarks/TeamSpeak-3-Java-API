package com.github.theholywaffle.teamspeak3.api.wrapper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import java.util.Map;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ClientInfoDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void getIdTest() {
    // Arrange, Act and Assert
    assertEquals(123, (new ClientInfo(123, null)).getId());
  }

  @Test
  public void isTalkingTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ClientInfo(123, null)).isTalking();
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ClientInfo actualClientInfo = new ClientInfo(123, null);

    // Assert
    Map<String, String> actualMap = actualClientInfo.getMap();
    assertNull(actualMap);
    assertEquals(123, actualClientInfo.getId());
  }
}

