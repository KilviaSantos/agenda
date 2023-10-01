package com.agenda.app.ui;

import java.io.PrintStream;
import java.util.Scanner;

public class UI {
  private PrintStream out;
  private Scanner scan;

  public UI() {
    this.out = System.out;
    this.scan = new Scanner(System.in);
  }

  public UI(Scanner scan, PrintStream out) {
    this.scan = scan;
    this.out = out;
  }

  public void clean() {
    out.print("\033[H\033[2J");
    out.flush();
  }

  public void print(String message) {
    out.println(message);
  }

  public String input(String message) {
    out.println(message);
    String res = scan.nextLine();
    out.println();
    return res;
  }

  public char inputChar(String message) {
    out.println(message);
    char res = scan.next().charAt(0);
    out.println();

    return res;
  }

  public int inputInt(String message) {
    out.println(message);
    int result = scan.nextInt();
    scan.nextLine(); // workaround for avoid skkiping nextLine: https://stackoverflow.com/a/13102066/815478 
    out.println();

    return result;
  }

}
