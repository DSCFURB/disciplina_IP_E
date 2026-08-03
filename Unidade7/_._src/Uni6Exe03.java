import java.util.Scanner;

public class Uni6Exe03 {

  private Uni6Exe03() {
    double vetor[] = new double[12];

    vetorLer(vetor);
    vetorAjustar(vetor);
    vetorImprimir(vetor);
  }

  private void vetorLer(double vetor[]) {
    Scanner teclado = new Scanner(System.in);
    for (int i = 0; i < vetor.length; i++) {
      System.out.println("vetor[" + i + "]: ");
      vetor[i] = teclado.nextDouble();
    }
    teclado.close();
  }

  private void vetorAjustar(double vetor[]) {
    for (int i = 1; i < vetor.length; i += 2) { // posições ímpares 1,3,5,..,9,11
      vetor[i] += vetor[i] * 0.05;
    }
    for (int i = 0; i < vetor.length; i += 2) { // posições pares 0,2,4,..,10,12
      vetor[i] += vetor[i] * 0.02;
    }
  }

  private void vetorImprimir(double vetor[]) {
    for (int i = 0; i < vetor.length; i++) {
      System.out.println(" vetor[" + i + "]: " + vetor[i]);
    }
  }

  public static void main(String[] args) {
    new Uni6Exe03();
  }

}
