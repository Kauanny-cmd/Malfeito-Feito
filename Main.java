import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Variantes de desenvolvimento
    Scanner leitor = new Scanner(System.in);

    // String MaisTarefa = "sim";
    boolean verTarefas = true;

    // Boas vindas
    System.out.println("Seja bem vindo ao Malfeito, feito!");
    System.out.println("\n Por favor, digite o seu nome: ");
    String usuario = leitor.nextLine();
    Tarefas.BoasVindas(usuario);

    // Add tarefas
    Tarefas t1 = new Tarefas();

    while(verTarefas){
      
      System.out.print("|-------------------  MENU  ----------------|\n");
      System.out.print("| Opção 1 - Criar                         |\n");
      System.out.print("| Opção 2 - Vizualizar                    |\n");
      ///System.out.print("| Opção 3 - Limpar a lista de tarefas     |\n");
      System.out.print("| Opção 3 - Sair                          |\n");
      System.out.print("|-------------------------------------------|\n");
      int opcao = leitor.nextInt();
      if(opcao == 1){
        t1.AdicionaTarefas();
      }else if(opcao == 2){
        t1.MostrarTarefas(usuario);
      }else if(opcao == 3){
        verTarefas = false;
      }
      else{
        System.out.println("Opção inválida!");
      }
      
    }
    

    // Contagem de tarefas semanais
     /* int tarefaSemanal = tarefaDomingo + tarefaSegunda + tarefaTerca + tarefaQuarta + tarefaQuinta + tarefaSexta + tarefaSabado;

    boolean comTarefa = (tarefaSemanal > 0); */ 
    // boolean semTarefa = (!comTarefa);

    // Observando tarefas
    // if(comTarefa == true){
    // System.out.println("Você tem um total de " + tarefaSemanal + " tarefas nesta
    // semana!");
    // System.out.println("Veja a quantidade de tarefas ao longo da semana: ");
    // System.out.println("Domingo: " + tarefaDomingo);
    // System.out.println("Segunda: " + tarefaSegunda);
    // System.out.println("Terça: " + tarefaTerca);
    // System.out.println("Quarta: " + tarefaQuarta);
    // System.out.println("Quinta: " + tarefaQuinta);
    // System.out.println("Sexta: " + tarefaSexta);
    // System.out.println("Sábado: " + tarefaSabado);
    // }else{
    // System.out.println("Olá " + usuario + "!");
    // System.out.println("Você não tem nenhuma tarefa essa semana!");
    // }

    // // Pergunta sobre a opção de mais tarefas
    // do{
    // System.out.println("Vamos adicionar mais tarefas?");
    // switch(MaisTarefa){
    // case "sim": System.out.println("Vamos lá então");
    // break;
    // case "Sim": System.out.println("Vamos lá então");
    // break;
    // case "s": System.out.println("Vamos lá então");
    // break;
    // case "não": System.out.println("Ok, sem mais tarefas");
    // break;
    // case "Não": System.out.println("Ok, sem mais tarefas");
    // break;
    // case "nao": System.out.println("Ok, sem mais tarefas");
    // break;
    // case "n": System.out.println("Ok, sem mais tarefas");
    // break;
    // default: System.out.println("Responda com 'sim' ou 'não'");
    // tarefas--;
    // }
    // }
    // while(tarefas==0);

    // Semana
    // int DiasSemana = 0;
    // int dia = 0;
    // Exemplo com while
    // while(DiasSemana < 7){
    // dia++;
    // DiasSemana++;
    // }
    // Exemplo com for
    // for(dia = 0; DiasSemana < 7; dia++){
    // DiasSemana++;
    // }
    // System.out.println(dia);
    // System.out.println(DiasSemana);
  }
}
