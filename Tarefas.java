import java.util.Scanner;

public class Tarefas {
    public static void BoasVindas() {
        Scanner leitor = new Scanner(System.in);
        String usuario;
        System.out.println("Seja bem vindo ao Malfeito, feito!");
        System.out.println("Por favor, digite o seu nome: ");
        usuario = leitor.next();
        System.out.println("\nOlá " + usuario + "!\n");
    }
}
