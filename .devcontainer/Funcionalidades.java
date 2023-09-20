import java.util.Scanner;

public class Funcionalidades {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        Menu.printMenu();

        do {
            System.out.println("Digite uma opção (0, 1, 2, 3, 4 ou 5):");
            opcao = scanner.nextInt();
            if (opcao < 0 || opcao > 5) {
                System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        } while (opcao < 0 || opcao > 5);
        System.out.println("Você escolheu a opção " + opcao);

       
    }
}
