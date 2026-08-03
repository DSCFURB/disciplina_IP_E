import java.util.Scanner;

public class Uni6Exe04 {

  private Uni6Exe04() {
    final int tamanho = 10;
    int vetor1[] = new int[tamanho];
    int vetor2[] = new int[tamanho];
    int vetorSoma[] = new int[tamanho];

    vetorLer(vetor1, vetor2);
    vetorSomar(vetor1, vetor2, vetorSoma);
    vetorEscrever(vetor1, vetor2, vetorSoma);
  }

  private void vetorLer(int vetor1[], int vetor2[]) {
    Scanner teclado = new Scanner(System.in);
    for (int i = 0; i < vetor1.length; i++) {
      System.out.println("Informe vetor1[" + i + "]: ");
      vetor1[i] = teclado.nextInt();
    }
    for (int i = 0; i < vetor2.length; i++) {
      System.out.println("Informe vetor2[" + i + "]: ");
      vetor2[i] = teclado.nextInt();
    }
    teclado.close();
  }

  private void vetorSomar(int vetor1[], int vetor2[], int vetorSoma[]) {
    for (int i = 0; i < vetorSoma.length; i++) {
      vetorSoma[i] = vetor1[i] + vetor2[i];
    }
  }

  private void vetorEscrever(int vetor1[], int vetor2[], int vetorSoma[]) {
    for (int i = 0; i < vetor1.length; i++) {
      System.out.println("vetor1[" + i + "]: " + vetor1[i]);
    }
    for (int i = 0; i < vetor2.length; i++) {
      System.out.println("vetor2[" + i + "]: " + vetor2[i]);
    }
    for (int i = 0; i < vetorSoma.length; i++) {
      System.out.println("vetorSoma[" + i + "]: " + vetorSoma[i]);
    }
  }

  public static void main(String[] args) {
    new Uni6Exe04();
  }

}
