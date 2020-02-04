package com.github.theholywaffle.teamspeak3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class TS3QueryDiffblueTest {
  @Test
  public void fireDisconnectTest() {
    // Arrange
    TS3Query ts3Query = new TS3Query();

    // Act
    ts3Query.fireDisconnect();

    // Assert
    assertFalse(ts3Query.isConnected());
  }

  @Test
  public void isConnectedTest() {
    // Arrange, Act and Assert
    assertFalse((new TS3Query()).isConnected());
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    TS3Query actualTs3Query = new TS3Query();

    // Assert
    boolean actualIsConnectedResult = actualTs3Query.isConnected();
    assertFalse(actualIsConnectedResult);
    assertEquals(0, actualTs3Query.getFileTransferHelper().getClientTransferId());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    TS3Query actualTs3Query = new TS3Query(new TS3Config());

    // Assert
    boolean actualIsConnectedResult = actualTs3Query.isConnected();
    assertFalse(actualIsConnectedResult);
    assertEquals(0, actualTs3Query.getFileTransferHelper().getClientTransferId());
  }
}

