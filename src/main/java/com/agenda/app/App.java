package com.agenda.app;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.agenda.app.ui.AgendaApp;

@SpringBootApplication
public class App implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... args) throws IOException {
        Scanner scan = new Scanner(System.in);
        PrintStream out = System.out;
        
        new AgendaApp(scan, out).execute();
        
        scan.close();
    }
}