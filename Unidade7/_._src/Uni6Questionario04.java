public class Uni6Questionario04 {
  public static void main(String[] args) {
    int[] v1 = { 1, 2, 3 };
    int[] v2 = { 1, 2, 3 };

    String s = "";
    for (int i = 0; i < 3; i++) {
      s += v1[i] + " " + v2[2 - i] + " ";
    }
    System.out.println(s);
  }
}

// Resposta: 1 3 2 2 3 1