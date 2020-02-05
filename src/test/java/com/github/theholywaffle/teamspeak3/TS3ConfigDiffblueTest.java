package com.github.theholywaffle.teamspeak3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.github.theholywaffle.teamspeak3.api.reconnect.ConnectionHandler;
import com.github.theholywaffle.teamspeak3.api.reconnect.DisconnectingConnectionHandler;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TS3ConfigDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void setConnectionHandlerTest() {
    // Arrange
    TS3Config ts3Config = new TS3Config();
    DisconnectingConnectionHandler disconnectingConnectionHandler = new DisconnectingConnectionHandler(
        new DisconnectingConnectionHandler(
            new DisconnectingConnectionHandler(new DisconnectingConnectionHandler(null))));

    // Act
    TS3Config actualSetConnectionHandlerResult = ts3Config.setConnectionHandler(disconnectingConnectionHandler);

    // Assert
    assertSame(ts3Config, actualSetConnectionHandlerResult);
    assertSame(disconnectingConnectionHandler, actualSetConnectionHandlerResult.getConnectionHandler());
  }
  @Test
  public void setFloodRateTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new TS3Config()).setFloodRate(null);
  }
  @Test
  public void setQueryPortTest3() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new TS3Config()).setQueryPort(2147483647);
  }
  @Test
  public void setQueryPortTest2() {
    // Arrange
    TS3Config ts3Config = new TS3Config();

    // Act
    TS3Config actualSetQueryPortResult = ts3Config.setQueryPort(8080);

    // Assert
    assertSame(ts3Config, actualSetQueryPortResult);
    assertEquals(8080, actualSetQueryPortResult.getQueryPort());
  }
  @Test
  public void setQueryPortTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new TS3Config()).setQueryPort(-1);
  }
  @Test
  public void getHostTest() {
    // Arrange, Act and Assert
    assertNull((new TS3Config()).getHost());
  }
  @Test
  public void setEnableCommunicationsLoggingTest() {
    // Arrange
    TS3Config ts3Config = new TS3Config();

    // Act
    TS3Config actualSetEnableCommunicationsLoggingResult = ts3Config.setEnableCommunicationsLogging(true);

    // Assert
    assertSame(ts3Config, actualSetEnableCommunicationsLoggingResult);
    assertTrue(actualSetEnableCommunicationsLoggingResult.getEnableCommunicationsLogging());
  }
  @Test
  public void getQueryPortTest() {
    // Arrange, Act and Assert
    assertEquals(10011, (new TS3Config()).getQueryPort());
  }
  @Test
  public void getEnableCommunicationsLoggingTest() {
    // Arrange, Act and Assert
    assertFalse((new TS3Config()).getEnableCommunicationsLogging());
  }
  @Test
  public void getFloodRateTest() {
    // Arrange and Act
    TS3Query.FloodRate actualFloodRate = (new TS3Config()).getFloodRate();

    // Assert
    assertSame(actualFloodRate.DEFAULT, actualFloodRate);
  }
  @Test
  public void getCommandTimeoutTest() {
    // Arrange, Act and Assert
    assertEquals(4000, (new TS3Config()).getCommandTimeout());
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    TS3Config actualTs3Config = new TS3Config();

    // Assert
    int actualQueryPort = actualTs3Config.getQueryPort();
    ConnectionHandler actualConnectionHandler = actualTs3Config.getConnectionHandler();
    String actualHost = actualTs3Config.getHost();
    int actualCommandTimeout = actualTs3Config.getCommandTimeout();
    assertEquals(10011, actualQueryPort);
    assertFalse(actualTs3Config.getEnableCommunicationsLogging());
    assertEquals(4000, actualCommandTimeout);
    assertNull(actualConnectionHandler);
    assertNull(actualHost);
  }
  @Test
  public void setHostTest() {
    // Arrange
    TS3Config ts3Config = new TS3Config();

    // Act
    TS3Config actualSetHostResult = ts3Config.setHost("localhost");

    // Assert
    assertSame(ts3Config, actualSetHostResult);
    assertEquals("localhost", actualSetHostResult.getHost());
  }
  @Test
  public void getConnectionHandlerTest() {
    // Arrange, Act and Assert
    assertNull((new TS3Config()).getConnectionHandler());
  }
  @Test
  public void setCommandTimeoutTest2() {
    // Arrange
    TS3Config ts3Config = new TS3Config();

    // Act
    TS3Config actualSetCommandTimeoutResult = ts3Config.setCommandTimeout(10);

    // Assert
    assertSame(ts3Config, actualSetCommandTimeoutResult);
    assertEquals(10, actualSetCommandTimeoutResult.getCommandTimeout());
  }
  @Test
  public void setCommandTimeoutTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new TS3Config()).setCommandTimeout(-1);
  }
  @Test
  public void setReconnectStrategyTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new TS3Config()).setReconnectStrategy(null);
  }
}

