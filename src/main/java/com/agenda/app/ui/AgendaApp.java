package com.agenda.app.ui;

import java.io.PrintStream;
import java.util.Scanner;

public class AgendaApp {
  private PrintStream out;
  private Scanner scan;

  public AgendaApp(Scanner scan, PrintStream out) {
    this.scan = scan;
    this.out = out;
  }

  public void execute() {
    out.println("Qual seu nome: ");
    String nome = scan.nextLine();

    out.println("Bem vindo " + nome + ". Ola mundo!");
    scan.next();
    
    out.print("\033[H\033[2J");
    out.flush();
    out.println("\n\nFIM\n\n");
  }
  
}
