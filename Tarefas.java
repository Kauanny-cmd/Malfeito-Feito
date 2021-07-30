import java.util.Scanner;
import java.util.ArrayList;

public class Tarefas {

    public static void BoasVindas() {
        Scanner leitor = new Scanner(System.in);
        String usuario;

        System.out.println("Seja bem vindo ao Malfeito, feito!");
        System.out.println("Por favor, digite o seu nome: ");
        usuario = leitor.nextLine();
        System.out.println("\nOlá " + usuario + "!\n");
    }

    public static void AdicionaTarefas() {
        Scanner leitor = new Scanner(System.in);
        int tarefaDomingo = 0;

        ArrayList<String> listaDomingo = new ArrayList<String>();

        System.out.println("Quantas tarefas você deseja adicionar para Domingo?");
        tarefaDomingo = leitor.nextInt();

        System.out.println("Perfeito!");
        System.out.println("\nAgora, escreva, quais são elas:");

        for (int i = 0; i <= tarefaDomingo; i++) {
            listaDomingo.add(leitor.nextLine());
        }
    }
}
