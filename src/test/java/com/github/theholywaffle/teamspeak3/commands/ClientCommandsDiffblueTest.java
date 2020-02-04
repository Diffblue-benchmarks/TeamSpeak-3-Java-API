package com.github.theholywaffle.teamspeak3.commands;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import com.github.theholywaffle.teamspeak3.api.ReasonIdentifier;
import java.util.Arrays;
import org.junit.Test;

public class ClientCommandsDiffblueTest {
  @Test
  public void clientPokeTest() {
    // Arrange and Act
    Command actualClientPokeResult = ClientCommands.clientPoke(1, "away");

    // Assert
    String actualName = actualClientPokeResult.getName();
    String actualToStringResult = actualClientPokeResult.toString();
    assertEquals("clientpoke", actualName);
    assertEquals("clientpoke clid=1 msg=away", actualToStringResult);
    assertFalse(actualClientPokeResult.getFuture().isCancelled());
  }

  @Test
  public void clientGetDBIdFromUIdTest() {
    // Arrange and Act
    Command actualClientGetDBIdFromUIdResult = ClientCommands.clientGetDBIdFromUId("away");

    // Assert
    String actualName = actualClientGetDBIdFromUIdResult.getName();
    String actualToStringResult = actualClientGetDBIdFromUIdResult.toString();
    assertEquals("clientgetdbidfromuid", actualName);
    assertEquals("clientgetdbidfromuid cluid=away", actualToStringResult);
    assertFalse(actualClientGetDBIdFromUIdResult.getFuture().isCancelled());
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
  public void clientInfoTest() {
    // Arrange and Act
    Command actualClientInfoResult = ClientCommands.clientInfo(1);

    // Assert
    String actualName = actualClientInfoResult.getName();
    String actualToStringResult = actualClientInfoResult.toString();
    assertEquals("clientinfo", actualName);
    assertEquals("clientinfo clid=1", actualToStringResult);
    assertFalse(actualClientInfoResult.getFuture().isCancelled());
  }

  @Test
  public void clientMoveTest() {
    // Arrange
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);

    // Act
    Command actualClientMoveResult = ClientCommands.clientMove(intArray, 1, "away");

    // Assert
    String actualName = actualClientMoveResult.getName();
    String actualToStringResult = actualClientMoveResult.toString();
    assertEquals("clientmove", actualName);
    assertEquals("clientmove cid=1 cpw=away clid=1|clid=1|clid=1|clid" + "=1|clid=1|clid=1|clid=1|clid=1",
        actualToStringResult);
    assertFalse(actualClientMoveResult.getFuture().isCancelled());
  }

  @Test
  public void clientKickTest() {
    // Arrange
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);

    // Act
    Command actualClientKickResult = ClientCommands.clientKick(ReasonIdentifier.REASON_KICK_CHANNEL, "away", intArray);

    // Assert
    String actualName = actualClientKickResult.getName();
    String actualToStringResult = actualClientKickResult.toString();
    assertEquals("clientkick", actualName);
    assertEquals("clientkick reasonid=4 reasonmsg=away clid=1|clid=1" + "|clid=1|clid=1|clid=1|clid=1|clid=1|clid=1",
        actualToStringResult);
    assertFalse(actualClientKickResult.getFuture().isCancelled());
  }

  @Test
  public void clientEditTest() {
    // Arrange and Act
    Command actualClientEditResult = ClientCommands.clientEdit(1, null);

    // Assert
    String actualName = actualClientEditResult.getName();
    String actualToStringResult = actualClientEditResult.toString();
    assertEquals("clientedit", actualName);
    assertEquals("clientedit clid=1", actualToStringResult);
    assertFalse(actualClientEditResult.getFuture().isCancelled());
  }

  @Test
  public void clientFindTest() {
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
  public void sendTextMessageTest() {
    // Arrange and Act
    Command actualSendTextMessageResult = ClientCommands.sendTextMessage(1, 1, "away");

    // Assert
    String actualName = actualSendTextMessageResult.getName();
    String actualToStringResult = actualSendTextMessageResult.toString();
    assertEquals("sendtextmessage", actualName);
    assertEquals("sendtextmessage targetmode=1 target=1 msg=away", actualToStringResult);
    assertFalse(actualSendTextMessageResult.getFuture().isCancelled());
  }
}

