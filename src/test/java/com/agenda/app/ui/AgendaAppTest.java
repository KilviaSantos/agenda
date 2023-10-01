package com.agenda.app.ui;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class AgendaAppTest {

  @Test
  public void testApp() {
      Scanner scan = mock(Scanner.class);
      ByteArrayOutputStream out = new ByteArrayOutputStream();
      PrintStream ps = new PrintStream(out);
      
      when(scan.nextLine()).thenReturn("abraao alves").thenReturn(" ");

      AgendaApp app = new AgendaApp(scan, ps);
      app.execute();

      assertTrue(out.toString().contains("FIM"));
  }
}
