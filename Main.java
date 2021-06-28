class Main {
  public static void main(String[] args) {
    String usuario = "Kauanny";
    int tarefaHoje = 4;
    int tarefaAmanha = 5;
    int tarefaSemanal = tarefaHoje + tarefaAmanha;

    boolean comTarefa = (tarefaSemanal > 0) ;
    boolean semTarefa = (!comTarefa);

    System.out.println("Olá " + usuario + "!");
    System.out.println("Você tem um total de " + tarefaSemanal + " tarefas nessa semana");
    System.out.println(comTarefa);
    System.out.println(semTarefa);
  }
}