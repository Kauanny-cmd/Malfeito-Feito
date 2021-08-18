import java.util.Scanner;
import java.util.ArrayList;

public class Tarefas extends User {

    private ArrayList<String> listaDeTarefas = new ArrayList<String>();
    private static int QuantidadeTarefa;

    public static void BoasVindas(String usuario) {
        System.out.println("\nOlá " + usuario + "!\n");
    }

    public void AdicionaTarefas() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("\n Quantas tarefas você deseja adicionar?");
        QuantidadeTarefa = leitor.nextInt();

        System.out.println("Perfeito!");
        System.out.println("\nAgora, escreva, quais são elas:");

        for (int i = 0; i < QuantidadeTarefa; i++) {
            Scanner scan = new Scanner(System.in);
            listaDeTarefas.add(scan.nextLine());
        }
    }

    public void EditarTarefas() {
        Scanner leitor = new Scanner(System.in);

        if (listaDeTarefas.size() == 0) {
            System.out.println("Primeiro, adicione uma tarefa para editá-la");
        } else {

            int cont = 1;
            System.out.println("\n As tarefas são:");
            for (String tarefa : listaDeTarefas) {
                System.out.println(cont + " " + tarefa);
                cont++;
            }

            System.out.println("\n Insira o número da tarefa para ser modificado: ");
            int indice = leitor.nextInt();

            if (indice < listaDeTarefas.size() || indice > listaDeTarefas.size()) {
                System.out.println("Por favor, insira um número de tarefa que tenha na lista! Tente novamente");
            } else {
                System.out.println("E agora, insira o que deseja mudar: ");
                Scanner scan = new Scanner(System.in);
                String mudanca = scan.nextLine();

                listaDeTarefas.set((indice - 1), mudanca);
                System.out.println("\n A tarefa foi editada com sucesso!\n");
            }
        }
    }

    public void MostrarTarefas(String usuario) {
        int cont = 1;
        if (listaDeTarefas.size() > 0) {
            System.out.println("\n As tarefas são:");
            for (String tarefa : listaDeTarefas) {
                System.out.println(cont + " " + tarefa);
                cont++;
            }
        } else if (listaDeTarefas.size() == 0) {
            System.out.println(usuario + ", você não tem nenhuma tarefa");
        }
    }

    public int getQuantidadeTarefas() {
        return this.QuantidadeTarefa;
    }

    public int setQuantidadeTarefas(int QuantidadeTarefa) {
        return this.QuantidadeTarefa;
    }

    public Tarefas() {
        super();
    }

    @Override
    public void User() {
        super.User();
    }
}
