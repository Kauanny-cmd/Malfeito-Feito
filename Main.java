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
  }
}