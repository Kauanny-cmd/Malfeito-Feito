import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
// Variantes de desenvolvimento
    Scanner leitor = new Scanner(System.in);

    String usuario;
    int tarefaDomingo = 0;
    int tarefaSegunda = 0;
    int tarefaTerca = 0;
    int tarefaQuarta = 0;
    int tarefaQuinta = 0;
    int tarefaSexta = 0;
    int tarefaSabado = 0;

    // String MaisTarefa = "sim";
    // int tarefas = 1;


// Boas vindas
  System.out.println("Seja bem vindo ao Malfeito, feito!");
  System.out.println("Por favor, digite o seu nome: ");
  usuario = leitor.next();
  System.out.println("\nOlá " + usuario + "!\n");

// Add tarefas
  System.out.println("Quantas tarefas você deseja adicionar para Domingo?");
  tarefaDomingo = leitor.nextInt();

  System.out.println("Perfeito!");
  System.out.println("Agora, escreva, quais são elas:");

  String [] listaDomingo = new String[tarefaDomingo];

  int i = 0;
  
    for(i = 0; i < tarefaDomingo; i++){
      listaDomingo [i] = leitor.next();
    }
  
  
  // for(i = 0; i < tarefaDomingo; i++){
  //   System.out.println(listaDomingo[i]);
  // }
  

// Contagem de tarefas semanais
    int tarefaSemanal = tarefaDomingo + tarefaSegunda + tarefaTerca + tarefaQuarta + tarefaQuinta + tarefaSexta + tarefaSabado;

    boolean comTarefa = (tarefaSemanal > 0);
  //boolean semTarefa = (!comTarefa);

// Observando tarefas
    // if(comTarefa == true){
    //   System.out.println("Você tem um total de " + tarefaSemanal + " tarefas nesta semana!");
    //   System.out.println("Veja a quantidade de tarefas ao longo da semana: ");
    //   System.out.println("Domingo: " + tarefaDomingo);
    //   System.out.println("Segunda: " + tarefaSegunda);
    //   System.out.println("Terça: " + tarefaTerca);
    //   System.out.println("Quarta: " + tarefaQuarta);
    //   System.out.println("Quinta: " + tarefaQuinta);
    //   System.out.println("Sexta: " + tarefaSexta);
    //   System.out.println("Sábado: " + tarefaSabado); 
    // }else{
    //   System.out.println("Olá " + usuario + "!");
    //   System.out.println("Você não tem nenhuma tarefa essa semana!");
    // }

// // Pergunta sobre a opção de mais tarefas
//   do{
//     System.out.println("Vamos adicionar mais tarefas?");
//     switch(MaisTarefa){
//       case "sim": System.out.println("Vamos lá então");
//       break;
//       case "Sim": System.out.println("Vamos lá então");
//       break;
//       case "s": System.out.println("Vamos lá então");
//       break;
//       case "não": System.out.println("Ok, sem mais tarefas");
//       break;
//       case "Não": System.out.println("Ok, sem mais tarefas");
//       break;
//       case "nao": System.out.println("Ok, sem mais tarefas");
//       break;
//       case "n": System.out.println("Ok, sem mais tarefas");
//       break;
//       default: System.out.println("Responda com 'sim' ou 'não'");
//       tarefas--;
//     }
//   }
//   while(tarefas==0);

// Semana
    // int DiasSemana = 0;
    // int dia = 0;
  //Exemplo com while 
    // while(DiasSemana < 7){
    //   dia++;
    //   DiasSemana++;
    // }
  //Exemplo com for
    // for(dia = 0; DiasSemana < 7; dia++){
    //   DiasSemana++;
    // }
    // System.out.println(dia);
    // System.out.println(DiasSemana);
  }
}