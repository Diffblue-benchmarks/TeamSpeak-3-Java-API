package com.github.theholywaffle.teamspeak3.commands;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import com.github.theholywaffle.teamspeak3.api.event.TS3EventType;
import org.junit.Test;

public class QueryCommandsDiffblueTest {
  @Test
  public void logInTest() {
    // Arrange and Act
    Command actualLogInResult = QueryCommands.logIn("client_nickname", "client_nickname");

    // Assert
    String actualName = actualLogInResult.getName();
    String actualToStringResult = actualLogInResult.toString();
    assertEquals("login", actualName);
    assertEquals("login client_nickname client_nickname", actualToStringResult);
    assertFalse(actualLogInResult.getFuture().isCancelled());
  }

  @Test
  public void usePortTest() {
    // Arrange and Act
    Command actualUsePortResult = QueryCommands.usePort(1, "client_nickname");

    // Assert
    String actualName = actualUsePortResult.getName();
    String actualToStringResult = actualUsePortResult.toString();
    assertEquals("use", actualName);
    assertEquals("use port=1 -virtual client_nickname=client" + "_nickname", actualToStringResult);
    assertFalse(actualUsePortResult.getFuture().isCancelled());
  }

  @Test
  public void whoAmITest() {
    // Arrange and Act
    Command actualWhoAmIResult = QueryCommands.whoAmI();

    // Assert
    String actualName = actualWhoAmIResult.getName();
    String actualToStringResult = actualWhoAmIResult.toString();
    assertEquals("whoami", actualName);
    assertEquals("whoami", actualToStringResult);
    assertFalse(actualWhoAmIResult.getFuture().isCancelled());
  }

  @Test
  public void useIdTest() {
    // Arrange and Act
    Command actualUseIdResult = QueryCommands.useId(1, "client_nickname");

    // Assert
    String actualName = actualUseIdResult.getName();
    String actualToStringResult = actualUseIdResult.toString();
    assertEquals("use", actualName);
    assertEquals("use sid=1 -virtual client_nickname=client_nickname", actualToStringResult);
    assertFalse(actualUseIdResult.getFuture().isCancelled());
  }

  @Test
  public void quitTest() {
    // Arrange and Act
    Command actualQuitResult = QueryCommands.quit();

    // Assert
    String actualName = actualQuitResult.getName();
    String actualToStringResult = actualQuitResult.toString();
    assertEquals("quit", actualName);
    assertEquals("quit", actualToStringResult);
    assertFalse(actualQuitResult.getFuture().isCancelled());
  }

  @Test
  public void logOutTest() {
    // Arrange and Act
    Command actualLogOutResult = QueryCommands.logOut();

    // Assert
    String actualName = actualLogOutResult.getName();
    String actualToStringResult = actualLogOutResult.toString();
    assertEquals("logout", actualName);
    assertEquals("logout", actualToStringResult);
    assertFalse(actualLogOutResult.getFuture().isCancelled());
  }

  @Test
  public void serverNotifyUnregisterTest() {
    // Arrange and Act
    Command actualServerNotifyUnregisterResult = QueryCommands.serverNotifyUnregister();

    // Assert
    String actualName = actualServerNotifyUnregisterResult.getName();
    String actualToStringResult = actualServerNotifyUnregisterResult.toString();
    assertEquals("servernotifyunregister", actualName);
    assertEquals("servernotifyunregister", actualToStringResult);
    assertFalse(actualServerNotifyUnregisterResult.getFuture().isCancelled());
  }

  @Test
  public void serverNotifyRegisterTest() {
    // Arrange and Act
    Command actualServerNotifyRegisterResult = QueryCommands.serverNotifyRegister(TS3EventType.SERVER, 1);

    // Assert
    String actualName = actualServerNotifyRegisterResult.getName();
    String actualToStringResult = actualServerNotifyRegisterResult.toString();
    assertEquals("servernotifyregister", actualName);
    assertEquals("servernotifyregister event=server id=1", actualToStringResult);
    assertFalse(actualServerNotifyRegisterResult.getFuture().isCancelled());
  }
}

