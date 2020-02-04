package com.github.theholywaffle.teamspeak3;

import static org.junit.Assert.assertFalse;
import com.github.theholywaffle.teamspeak3.api.ClientProperty;
import com.github.theholywaffle.teamspeak3.api.ServerInstanceProperty;
import java.util.Arrays;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TS3ApiAsyncDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void getFileInfosTest() {
    // Arrange
    TS3ApiAsync ts3ApiAsync = new TS3ApiAsync(new TS3Query());
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    ts3ApiAsync.getFileInfos(new String[]{"aaaaa", "aaaaa", "aaaaa"}, intArray,
        new String[]{"aaaaa", "aaaaa", "aaaaa"});
  }
  @Test
  public void addTS3ListenersTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new TS3ApiAsync(new TS3Query())).addTS3Listeners(null, null, null);
  }
  @Test
  public void updateClientTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new TS3ApiAsync(new TS3Query())).updateClient(ClientProperty.CID, "value");
  }
  @Test
  public void constructorTest() {
    // Arrange
    TS3Query ts3Query = new TS3Query();

    // Act
    new TS3ApiAsync(ts3Query);

    // Assert
    assertFalse(ts3Query.isConnected());
  }
  @Test
  public void editClientTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new TS3ApiAsync(new TS3Query())).editClient(123, ClientProperty.CID, "value");
  }
  @Test
  public void editInstanceTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new TS3ApiAsync(new TS3Query()))
        .editInstance(ServerInstanceProperty.CONNECTION_BANDWIDTH_RECEIVED_LAST_MINUTE_TOTAL, "value");
  }
}

