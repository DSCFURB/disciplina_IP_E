public class Uni6Questionario06 {
  public static void main(String[] args) {

    final int NUM = 4;
    int X[] = { 1, 2, 3, 4 };
    int result = 0;
    for (int i = 0; i < NUM; i++) {
      result = 1;
      for (int j = 2; j <= i; j++) {
        result *= X[j];
      }
    }
    System.out.print(result + " ");
  }
}

// Resposta: 12