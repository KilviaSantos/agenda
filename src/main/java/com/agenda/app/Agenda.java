package com.agenda.app;
import java.util.Scanner;

public class Agenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o id do contato:");
        String id = scanner.nextLine();

        System.out.println("Digite o nome do contato:");
        String nome = scanner.nextLine();

        System.out.println("Digite o endereço do contato:");
        String endereco = scanner.nextLine();

        System.out.println("Digite o telefone do contato:");
        String telefone = scanner.nextLine();

        System.out.println("Digite o email do contato:");
        String email = scanner.nextLine();

        Contato contato = new Contato(id, nome, endereco, telefone, email);

        System.out.println("Contato criado com sucesso!");
        System.out.println(contato.toString());
    }
}