package com.github.theholywaffle.teamspeak3.commands;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import com.github.theholywaffle.teamspeak3.api.PrivilegeKeyType;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PrivilegeKeyCommandsDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void privilegeKeyAddTest() {
    // Arrange and Act
    Command actualPrivilegeKeyAddResult = PrivilegeKeyCommands.privilegeKeyAdd(PrivilegeKeyType.SERVER_GROUP, 123, 123,
        "description");

    // Assert
    String actualName = actualPrivilegeKeyAddResult.getName();
    String actualToStringResult = actualPrivilegeKeyAddResult.toString();
    assertEquals("privilegekeyadd", actualName);
    assertEquals("privilegekeyadd tokentype=0 tokenid1=123 tokenid2=123" + " tokendescription=description",
        actualToStringResult);
    assertFalse(actualPrivilegeKeyAddResult.getFuture().isCancelled());
  }
  @Test
  public void privilegeKeyUseTest2() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    PrivilegeKeyCommands.privilegeKeyUse("");
  }
  @Test
  public void privilegeKeyUseTest() {
    // Arrange and Act
    Command actualPrivilegeKeyUseResult = PrivilegeKeyCommands.privilegeKeyUse("ABC123");

    // Assert
    String actualName = actualPrivilegeKeyUseResult.getName();
    String actualToStringResult = actualPrivilegeKeyUseResult.toString();
    assertEquals("privilegekeyuse", actualName);
    assertEquals("privilegekeyuse token=ABC123", actualToStringResult);
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
  public void privilegeKeyDeleteTest2() {
    // Arrange and Act
    Command actualPrivilegeKeyDeleteResult = PrivilegeKeyCommands.privilegeKeyDelete("ABC123");

    // Assert
    String actualName = actualPrivilegeKeyDeleteResult.getName();
    String actualToStringResult = actualPrivilegeKeyDeleteResult.toString();
    assertEquals("privilegekeydelete", actualName);
    assertEquals("privilegekeydelete token=ABC123", actualToStringResult);
    assertFalse(actualPrivilegeKeyDeleteResult.getFuture().isCancelled());
  }
  @Test
  public void privilegeKeyDeleteTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    PrivilegeKeyCommands.privilegeKeyDelete("");
  }
}

