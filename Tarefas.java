import java.util.Scanner;
import java.util.ArrayList;

public class Tarefas {

    private final Scanner leitor = new Scanner(System.in);
    private ArrayList<String> listaDeTarefas = new ArrayList<String>();
    private static int QuantidadeTarefa;


    public static void BoasVindas(String usuario) {
        System.out.println("\nOlá " + usuario + "!\n");
    }

    public void AdicionaTarefas() {

        System.out.println("\n Quantas tarefas você deseja adicionar?");
        QuantidadeTarefa = leitor.nextInt();

        System.out.println("Perfeito!");
        System.out.println("\nAgora, escreva, quais são elas:");

        for (int i = 0; i <= QuantidadeTarefa; i++) {
            listaDeTarefas.add(leitor.nextLine());
        }
    }

    public void MostrarTarefas(String usuario) {
        System.out.println("\n As tarefas são:");
        if(listaDeTarefas.size() > 0){
            for (String tarefa : listaDeTarefas) {
                System.out.println(tarefa);
            }
        }else if(listaDeTarefas.size() == 0){
            System.out.println(usuario + ", você não tem nenhuma tarefa");
        }
    }


    public int getQuantidadeTarefas(){
        return this.QuantidadeTarefa;
    }

    public int setQuantidadeTarefas(int QuantidadeTarefa){
        return this.QuantidadeTarefa;
    }
}
