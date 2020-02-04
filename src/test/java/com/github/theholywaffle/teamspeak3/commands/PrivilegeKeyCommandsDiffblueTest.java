package com.github.theholywaffle.teamspeak3.commands;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import com.github.theholywaffle.teamspeak3.api.PrivilegeKeyType;
import org.junit.Test;

public class PrivilegeKeyCommandsDiffblueTest {
  @Test
  public void privilegeKeyAddTest() {
    // Arrange and Act
    Command actualPrivilegeKeyAddResult = PrivilegeKeyCommands.privilegeKeyAdd(PrivilegeKeyType.SERVER_GROUP, 1, 1,
        "privilegekeyadd");

    // Assert
    String actualName = actualPrivilegeKeyAddResult.getName();
    String actualToStringResult = actualPrivilegeKeyAddResult.toString();
    assertEquals("privilegekeyadd", actualName);
    assertEquals("privilegekeyadd tokentype=0 tokenid1=1 tokenid2=1" + " tokendescription=privilegekeyadd",
        actualToStringResult);
    assertFalse(actualPrivilegeKeyAddResult.getFuture().isCancelled());
  }

  @Test
  public void privilegeKeyUseTest() {
    // Arrange and Act
    Command actualPrivilegeKeyUseResult = PrivilegeKeyCommands.privilegeKeyUse("privilegekeyadd");

    // Assert
    String actualName = actualPrivilegeKeyUseResult.getName();
    String actualToStringResult = actualPrivilegeKeyUseResult.toString();
    assertEquals("privilegekeyuse", actualName);
    assertEquals("privilegekeyuse token=privilegekeyadd", actualToStringResult);
    assertFalse(actualPrivilegeKeyUseResult.getFuture().isCancelled());
  }

  @Test
  public void privilegeKeyListTest() {
    // Arrange and Act
    Command actualPrivilegeKeyListResult = PrivilegeKeyCommands.privilegeKeyList();

    // Assert
    String actualName = actualPrivilegeKeyListResult.getName();
    String actualToStringResult = actualPrivilegeKeyListResult.toString();
    assertEquals("privilegekeylist", actualName);
    assertEquals("privilegekeylist", actualToStringResult);
    assertFalse(actualPrivilegeKeyListResult.getFuture().isCancelled());
  }

  @Test
  public void privilegeKeyDeleteTest() {
    // Arrange and Act
    Command actualPrivilegeKeyDeleteResult = PrivilegeKeyCommands.privilegeKeyDelete("privilegekeyadd");

    // Assert
    String actualName = actualPrivilegeKeyDeleteResult.getName();
    String actualToStringResult = actualPrivilegeKeyDeleteResult.toString();
    assertEquals("privilegekeydelete", actualName);
    assertEquals("privilegekeydelete token=privilegekeyadd", actualToStringResult);
    assertFalse(actualPrivilegeKeyDeleteResult.getFuture().isCancelled());
  }
}

