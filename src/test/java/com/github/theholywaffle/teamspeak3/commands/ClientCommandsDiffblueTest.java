package com.github.theholywaffle.teamspeak3.commands;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import com.github.theholywaffle.teamspeak3.api.ReasonIdentifier;
import java.util.Arrays;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ClientCommandsDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void clientSetServerQueryLoginTest() {
    // Arrange and Act
    Command actualClientSetServerQueryLoginResult = ClientCommands.clientSetServerQueryLogin("name");

    // Assert
    String actualName = actualClientSetServerQueryLoginResult.getName();
    String actualToStringResult = actualClientSetServerQueryLoginResult.toString();
    assertEquals("clientsetserverquerylogin", actualName);
    assertEquals("clientsetserverquerylogin client_login_name=name", actualToStringResult);
    assertFalse(actualClientSetServerQueryLoginResult.getFuture().isCancelled());
  }

  @Test
  public void clientPokeTest() {
    // Arrange and Act
    Command actualClientPokeResult = ClientCommands.clientPoke(123, "message");

    // Assert
    String actualName = actualClientPokeResult.getName();
    String actualToStringResult = actualClientPokeResult.toString();
    assertEquals("clientpoke", actualName);
    assertEquals("clientpoke clid=123 msg=message", actualToStringResult);
    assertFalse(actualClientPokeResult.getFuture().isCancelled());
  }

  @Test
  public void clientGetDBIdFromUIdTest2() {
    // Arrange and Act
    Command actualClientGetDBIdFromUIdResult = ClientCommands.clientGetDBIdFromUId("123");

    // Assert
    String actualName = actualClientGetDBIdFromUIdResult.getName();
    String actualToStringResult = actualClientGetDBIdFromUIdResult.toString();
    assertEquals("clientgetdbidfromuid", actualName);
    assertEquals("clientgetdbidfromuid cluid=123", actualToStringResult);
    assertFalse(actualClientGetDBIdFromUIdResult.getFuture().isCancelled());
  }

  @Test
  public void clientGetDBIdFromUIdTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    ClientCommands.clientGetDBIdFromUId("");
  }

  @Test
  public void clientUpdateTest() {
    // Arrange and Act
    Command actualClientUpdateResult = ClientCommands.clientUpdate(null);

    // Assert
    String actualName = actualClientUpdateResult.getName();
    String actualToStringResult = actualClientUpdateResult.toString();
    assertEquals("clientupdate", actualName);
    assertEquals("clientupdate", actualToStringResult);
    assertFalse(actualClientUpdateResult.getFuture().isCancelled());
  }

  @Test
  public void clientListTest() {
    // Arrange and Act
    Command actualClientListResult = ClientCommands.clientList();

    // Assert
    String actualName = actualClientListResult.getName();
    String actualToStringResult = actualClientListResult.toString();
    assertEquals("clientlist", actualName);
    assertEquals("clientlist -uid -away -voice -times -groups -info" + " -icon -country -ip -badges",
        actualToStringResult);
    assertFalse(actualClientListResult.getFuture().isCancelled());
  }

  @Test
  public void clientMoveTest2() {
    // Arrange and Act
    Command actualClientMoveResult = ClientCommands.clientMove(123, 123, "Password123");

    // Assert
    String actualName = actualClientMoveResult.getName();
    String actualToStringResult = actualClientMoveResult.toString();
    assertEquals("clientmove", actualName);
    assertEquals("clientmove clid=123 cid=123 cpw=Password123", actualToStringResult);
    assertFalse(actualClientMoveResult.getFuture().isCancelled());
  }

  @Test
  public void clientInfoTest() {
    // Arrange and Act
    Command actualClientInfoResult = ClientCommands.clientInfo(123);

    // Assert
    String actualName = actualClientInfoResult.getName();
    String actualToStringResult = actualClientInfoResult.toString();
    assertEquals("clientinfo", actualName);
    assertEquals("clientinfo clid=123", actualToStringResult);
    assertFalse(actualClientInfoResult.getFuture().isCancelled());
  }

  @Test
  public void clientGetIdsTest2() {
    // Arrange and Act
    Command actualClientGetIdsResult = ClientCommands.clientGetIds("123");

    // Assert
    String actualName = actualClientGetIdsResult.getName();
    String actualToStringResult = actualClientGetIdsResult.toString();
    assertEquals("clientgetids", actualName);
    assertEquals("clientgetids cluid=123", actualToStringResult);
    assertFalse(actualClientGetIdsResult.getFuture().isCancelled());
  }

  @Test
  public void clientGetIdsTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    ClientCommands.clientGetIds("");
  }

  @Test
  public void clientMoveTest() {
    // Arrange
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);

    // Act
    Command actualClientMoveResult = ClientCommands.clientMove(intArray, 123, "Password123");

    // Assert
    String actualName = actualClientMoveResult.getName();
    String actualToStringResult = actualClientMoveResult.toString();
    assertEquals("clientmove", actualName);
    assertEquals("clientmove cid=123 cpw=Password123 clid=1|clid=1" + "|clid=1|clid=1|clid=1|clid=1|clid=1|clid=1",
        actualToStringResult);
    assertFalse(actualClientMoveResult.getFuture().isCancelled());
  }

  @Test
  public void clientKickTest() {
    // Arrange
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);

    // Act
    Command actualClientKickResult = ClientCommands.clientKick(ReasonIdentifier.REASON_KICK_CHANNEL, "because",
        intArray);

    // Assert
    String actualName = actualClientKickResult.getName();
    String actualToStringResult = actualClientKickResult.toString();
    assertEquals("clientkick", actualName);
    assertEquals("clientkick reasonid=4 reasonmsg=because clid=1|clid" + "=1|clid=1|clid=1|clid=1|clid=1|clid=1|clid=1",
        actualToStringResult);
    assertFalse(actualClientKickResult.getFuture().isCancelled());
  }

  @Test
  public void clientEditTest() {
    // Arrange and Act
    Command actualClientEditResult = ClientCommands.clientEdit(123, null);

    // Assert
    String actualName = actualClientEditResult.getName();
    String actualToStringResult = actualClientEditResult.toString();
    assertEquals("clientedit", actualName);
    assertEquals("clientedit clid=123", actualToStringResult);
    assertFalse(actualClientEditResult.getFuture().isCancelled());
  }

  @Test
  public void clientFindTest2() {
    // Arrange and Act
    Command actualClientFindResult = ClientCommands.clientFind("away");

    // Assert
    String actualName = actualClientFindResult.getName();
    String actualToStringResult = actualClientFindResult.toString();
    assertEquals("clientfind", actualName);
    assertEquals("clientfind pattern=away", actualToStringResult);
    assertFalse(actualClientFindResult.getFuture().isCancelled());
  }

  @Test
  public void clientFindTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    ClientCommands.clientFind("");
  }

  @Test
  public void sendTextMessageTest() {
    // Arrange and Act
    Command actualSendTextMessageResult = ClientCommands.sendTextMessage(1, 123, "message");

    // Assert
    String actualName = actualSendTextMessageResult.getName();
    String actualToStringResult = actualSendTextMessageResult.toString();
    assertEquals("sendtextmessage", actualName);
    assertEquals("sendtextmessage targetmode=1 target=123" + " msg=message", actualToStringResult);
    assertFalse(actualSendTextMessageResult.getFuture().isCancelled());
  }
}

