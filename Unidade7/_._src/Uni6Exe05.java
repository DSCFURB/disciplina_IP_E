import java.util.Scanner;

public class Uni6Exe05 {

  private Uni6Exe05() {
    Scanner teclado = new Scanner(System.in);

    String respostasRapaz[] = new String[5];
    String respostasMoca[] = new String[5];
    String perguntas[] = { "Gosta de música sertaneja?", "Gosta de futebol?", "Gosta de seriados?",
        "Gosta de redes sociais?", "Gosta da Oktoberfest?" };

    lerRespostas(respostasRapaz, perguntas, "do Rapaz __", teclado);
    lerRespostas(respostasMoca, perguntas, "da Moça __", teclado);

    int afinidade = calcularAfinidade(respostasRapaz, respostasMoca);

    System.out.println(" __ Afinidade entre o Rapaz e a Moça ___");
    if (afinidade == 15) {
      System.out.println("Casem!");
    } else {
      if (afinidade >= 10 && afinidade <= 14) {
        System.out.println("Vocês têm muita coisa em comum!");
      } else {
        if (afinidade >= 5 && afinidade <= 9) {
          System.out.println("Talvez não dê certo :(");
        } else {
          if (afinidade >= 0 && afinidade <= 4) {
            System.out.println("Vale um encontro.");
          } else {
            if (afinidade >= -9 && afinidade <= -1) {
              System.out.println("Melhor não perder tempo");
            } else {
              if (afinidade == -10) {
                System.out.println("Vocês se odeiam!");
              }
            }
          }
        }
      }
    }

    teclado.close();
  }

  private void lerRespostas(String respostas[], String perguntas[], String texto, Scanner teclado) {
    System.out.println(" __ Informe as respostas (SIM, NÃO, IND) " + texto);
    for (int i = 0; i < perguntas.length; i++) {
      System.out.print(perguntas[i] + ": ");
      respostas[i] = teclado.next();
    }
  }

  private int calcularAfinidade(String rapaz[], String moca[]) {
    int afinidade = 0;
    for (int i = 0; i < rapaz.length; i++) {
      if (rapaz[i].equals(moca[i])) {
        afinidade += 3;
      } else {
        if ((rapaz[i].equals("IND") && (moca[i].equals("SIM") || moca[i].equals("NãO")))
            || (moca[i].equals("IND") && (rapaz[i].equals("SIM") || rapaz[i].equals("NãO")))) {
          afinidade += 1;
        } else {
          if ((rapaz[i].equals("SIM") && moca[i].equals("NÃO")) || (moca[i].equals("SIM") && rapaz[i].equals("NÃO"))) {
            afinidade -= 2;
          }
        }
      }

    }
    return afinidade;
  }

  public static void main(String[] args) {
    new Uni6Exe05();
  }

}
