class Main {
  public static void main(String[] args) {
    String usuario = "Kauanny";
    int tarefaDomingo = 4;
    int tarefaSegunda = 5;
    int tarefaTerca = 3;
    int tarefaQuarta = 5;
    int tarefaQuinta = 4;
    int tarefaSexta = 1;
    int tarefaSabado = 0;

    int tarefaSemanal = tarefaDomingo + tarefaSegunda + tarefaTerca + tarefaQuarta + tarefaQuinta + tarefaSexta + tarefaSabado;

    boolean comTarefa = (tarefaSemanal > 0);
    boolean semTarefa = (!comTarefa);

    System.out.println("Olá " + usuario + "!");
    System.out.println("Você tem um total de " + tarefaSemanal + " tarefas nessa semana");
    System.out.println("Veja a quantia em um único dia: ");
    System.out.println("Domingo: " + tarefaDomingo);
    System.out.println("Segunda: " + tarefaSegunda);
    System.out.println("Terça: " + tarefaTerca);
    System.out.println("Quarta: " + tarefaQuarta);
    System.out.println("Quinta: " + tarefaQuinta);
    System.out.println("Sexta: " + tarefaSexta);
    System.out.println("Sábado: " + tarefaSabado);
  }
}