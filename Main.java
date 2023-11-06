class Main {
  public static void main(String[] args) {
    System.out.println("Gott Mit Uns");
    teste.nome();
    calma();
  }

  private static void calma() {
    //Exemplo de metodo interno (function like)
    System.out.println("Calma");
  }
  
}

class teste {
  public static void nome () {
    //Como externo msm
    System.out.println("Nome");
  }
}