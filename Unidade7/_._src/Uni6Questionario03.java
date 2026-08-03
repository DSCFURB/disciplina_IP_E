public class Uni6Questionario03 {
  public static void main(String[] args) {
    float[] v1 = { 7f, 7.5f, 8f };
    float[] v2 = { 8.f, 7f, 9f };

    int sv1 = 0;
    int sv2 = 0;

    for (int i = 0; i < 3; i++) {
      sv1 += v1[i] / 3;
      sv2 += v2[i] / 3;
    }
    System.out.println(sv1 + ", " + sv2);

  }
}

// Resposta: 6, 7