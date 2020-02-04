package com.github.theholywaffle.teamspeak3.commands;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class BanCommandsDiffblueTest {
  @Test
  public void banListTest() {
    // Arrange and Act
    Command actualBanListResult = BanCommands.banList();

    // Assert
    String actualName = actualBanListResult.getName();
    String actualToStringResult = actualBanListResult.toString();
    assertEquals("banlist", actualName);
    assertEquals("banlist", actualToStringResult);
    assertFalse(actualBanListResult.getFuture().isCancelled());
  }

  @Test
  public void banClientTest() {
    // Arrange and Act
    Command actualBanClientResult = BanCommands.banClient(1, 1L, "banadd");

    // Assert
    String actualName = actualBanClientResult.getName();
    String actualToStringResult = actualBanClientResult.toString();
    assertEquals("banclient", actualName);
    assertEquals("banclient clid=1 time=1 banreason=banadd", actualToStringResult);
    assertFalse(actualBanClientResult.getFuture().isCancelled());
  }

  @Test
  public void banAddTest() {
    // Arrange and Act
    Command actualBanAddResult = BanCommands.banAdd("banadd", "banadd", "banadd", "banadd", 1L, "banadd");

    // Assert
    String actualName = actualBanAddResult.getName();
    String actualToStringResult = actualBanAddResult.toString();
    assertEquals("banadd", actualName);
    assertEquals("banadd ip=banadd name=banadd uid=banadd mytsid=banadd" + " time=1 banreason=banadd",
        actualToStringResult);
    assertFalse(actualBanAddResult.getFuture().isCancelled());
  }

  @Test
  public void banDelAllTest() {
    // Arrange and Act
    Command actualBanDelAllResult = BanCommands.banDelAll();

    // Assert
    String actualName = actualBanDelAllResult.getName();
    String actualToStringResult = actualBanDelAllResult.toString();
    assertEquals("bandelall", actualName);
    assertEquals("bandelall", actualToStringResult);
    assertFalse(actualBanDelAllResult.getFuture().isCancelled());
  }

  @Test
  public void banDelTest() {
    // Arrange and Act
    Command actualBanDelResult = BanCommands.banDel(1);

    // Assert
    String actualName = actualBanDelResult.getName();
    String actualToStringResult = actualBanDelResult.toString();
    assertEquals("bandel", actualName);
    assertEquals("bandel banid=1", actualToStringResult);
    assertFalse(actualBanDelResult.getFuture().isCancelled());
  }
}

