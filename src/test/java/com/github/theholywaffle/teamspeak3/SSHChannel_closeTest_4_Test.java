package com.github.theholywaffle.teamspeak3;

import com.github.theholywaffle.teamspeak3.SSHChannel;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class SSHChannel_closeTest_4_Test {
  @Test
  public void closeTest() throws Exception {
    // Arrange
    SSHChannel sSHChannel = Whitebox.newInstance(SSHChannel.class);

    // Act
    sSHChannel.close();
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
