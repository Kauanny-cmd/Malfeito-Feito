class Main {
  public static void main(String[] args) {
// Variantes de desenvolvimento
    String usuario = "Kauanny";
    int tarefaDomingo = 4;
    int tarefaSegunda = 5;
    int tarefaTerca = 3;
    int tarefaQuarta = 5;
    int tarefaQuinta = 4;
    int tarefaSexta = 1;
    int tarefaSabado = 0;
    String MaisTarefa = "sim";

// Contagem de tarefas semanais
    int tarefaSemanal = tarefaDomingo + tarefaSegunda + tarefaTerca + tarefaQuarta + tarefaQuinta + tarefaSexta + tarefaSabado;

    boolean comTarefa = (tarefaSemanal > 0);
  //boolean semTarefa = (!comTarefa);

// Observando tarefas
    if(comTarefa == true){
      System.out.println("Olá " + usuario + "!");
      System.out.println("Você tem um total de " + tarefaSemanal + " tarefas nesta semana!");
      System.out.println("Veja a quantidade de tarefas ao longo da semana: ");
      System.out.println("Domingo: " + tarefaDomingo);
      System.out.println("Segunda: " + tarefaSegunda);
      System.out.println("Terça: " + tarefaTerca);
      System.out.println("Quarta: " + tarefaQuarta);
      System.out.println("Quinta: " + tarefaQuinta);
      System.out.println("Sexta: " + tarefaSexta);
      System.out.println("Sábado: " + tarefaSabado); 
    }else{
      System.out.println("Olá " + usuario + "!");
      System.out.println("Você não tem nenhuma tarefa essa semana!");
    }

// Pergunta sobre a opção de mais tarefas
    System.out.println("Vamos adicionar mais tarefas?");
    switch(MaisTarefa){
      case "sim": System.out.println("Vamos lá então");
      break;
      case "Sim": System.out.println("Vamos lá então");
      break;
      case "s": System.out.println("Vamos lá então");
      break;
      case "não": System.out.println("Ok, sem mais tarefas");
      break;
      case "Não": System.out.println("Ok, sem mais tarefas");
      break;
      case "nao": System.out.println("Ok, sem mais tarefas");
      break;
      case "n": System.out.println("Ok, sem mais tarefas");
      break;
      default: System.out.println("Responda com 'sim' ou 'não'");
    }

// Semana
    // int DiasSemana = 0;
    // int dia = 0;
  //Exemplo com do while
    // do{
    //   dia++;
    //   DiasSemana++;
    // }
    // while(DiasSemana<=7);
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