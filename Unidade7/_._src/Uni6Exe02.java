import java.util.Scanner;

public class Uni6Exe02 {

  private Uni6Exe02() {
    double vetor[] = new double[12];
    vetorLer(vetor);
    double media = vetorCalcularMedia(vetor);
    vetorEscrever(vetor, media);
  }

  private void vetorLer(double vetor[]) {
    Scanner teclado = new Scanner(System.in);
    for (int i = 0; i < vetor.length; i++) {
      System.out.println("vetor[" + i + "]: ");
      vetor[i] = teclado.nextDouble();
    }
    teclado.close();
  }

  private double vetorCalcularMedia(double vetor[]) {
    double vetorSoma = 0;
    for (int i = 0; i < vetor.length; i++) {
      vetorSoma += vetor[i];
    }
    double vetorMedia = vetorSoma / vetor.length;
    return vetorMedia;
  }

  private void vetorEscrever(double vetor[], double media) {
    for (int i = 0; i < vetor.length; i++) {
      if (vetor[i] > media) {
        System.out.println("Vetor[" + i + "]: " + vetor[i]);
      }
    }
  }

  public static void main(String[] args) {
    new Uni6Exe02();
  }

}
