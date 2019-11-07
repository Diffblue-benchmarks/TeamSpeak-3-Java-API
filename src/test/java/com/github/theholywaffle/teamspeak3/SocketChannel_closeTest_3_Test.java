package com.github.theholywaffle.teamspeak3;

import com.github.theholywaffle.teamspeak3.SocketChannel;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class SocketChannel_closeTest_3_Test {
  @Test
  public void closeTest() throws Exception {
    // Arrange
    SocketChannel socketChannel = Whitebox.newInstance(SocketChannel.class);

    // Act
    socketChannel.close();
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
