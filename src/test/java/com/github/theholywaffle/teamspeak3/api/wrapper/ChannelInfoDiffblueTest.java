package com.github.theholywaffle.teamspeak3.api.wrapper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import java.util.Map;
import org.junit.Test;

public class ChannelInfoDiffblueTest {
  @Test
  public void getIdTest() {
    // Arrange, Act and Assert
    assertEquals(1, (new ChannelInfo(1, null)).getId());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ChannelInfo actualChannelInfo = new ChannelInfo(1, null);

    // Assert
    Map<String, String> actualMap = actualChannelInfo.getMap();
    assertNull(actualMap);
    assertEquals(1, actualChannelInfo.getId());
  }
}

