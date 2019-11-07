package com.github.theholywaffle.teamspeak3;

import com.github.theholywaffle.teamspeak3.EventManager;
import com.github.theholywaffle.teamspeak3.TS3Query;
import com.github.theholywaffle.teamspeak3.api.exception.TS3UnknownEventException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class EventManager_fireEventTest_5_Test {
  @Test
  public void fireEventTest() throws Exception {
    // Arrange
    EventManager eventManager = new EventManager(new TS3Query());
    String notifyName = "aaaaa";
    String notifyBody = "aaaaa";

    // Act and Assert
    thrown.expect(TS3UnknownEventException.class);
    eventManager.fireEvent(notifyName, notifyBody);
    Assert.assertNotNull(eventManager.toString());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
