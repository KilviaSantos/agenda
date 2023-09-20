package com.agenda.app;
public class Operacao {
    
    public static void processarOpcao(int opcao) {
           

        switch (opcao) {
            case 0:
                System.out.println("Saindo da função.");
                break;
            case 1:
                System.out.println("Incluindo informações de contato.");
                // Adicione aqui o código para incluir informações de contato.
                break;
            case 2:
                System.out.println("Consultando informações de contato.");
                // Adicione aqui o código para consultar informações de contato.
                break;
            case 3:
                System.out.println("Alterando informações de contato.");
                // Adicione aqui o código para alterar informações de contato.
                break;
            case 4:
                System.out.println("Deletando informações de contato.");
                // Adicione aqui o código para deletar informações de contato.
                break;
            } while (opcao != 0);
        }
    }
    