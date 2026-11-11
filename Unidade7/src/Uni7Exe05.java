import java.util.Scanner;

public class Uni7Exe05 {

    private Scanner tec = new Scanner(System.in);   

    private void lerVetor (String[] respostas) {
        //ler as respostas
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite a resposta da pergunta " + i);
            respostas[i] = tec.next();
        }
    }

    private String calcularAfinidade (String[] r, String[] m) {
        //soma dos pontos
        int pontos = 0;
        //percorrer os dois vetores
        for (int i = 0; i < 5; i++ ) {
            if (r[i].equalsIgnoreCase(m[i])) {
                pontos += 3; //respostas iguais, soma 3 pontos
            } else {
                if (r[i].equalsIgnoreCase("ind") || m[i].equalsIgnoreCase("ind")) {
                    pontos += 1; //se pelo menos uma for ind, soma 1
                } else {
                    pontos -= 2; // diminui 2
                 }
             }
        }
        if (pontos == 15) {
            return "Casem!";
        } else {
            if (pontos >= 10 && pontos <= 14) {
                return "Vocês têm muita coisa em comum!";
            } else {
                if (pontos >= 5 && pontos <= 9) {
                   return "Talvez não dê certo :(";
                } else {
                    if (pontos >= 0 && pontos <= 4) {
                        return "Vale um encontro.";
                    } else {
                        if (pontos >= -9 && pontos <= -1) {
                            return "Melhor não perder tempo";
                        } else {
                            return "Vocês se odeiam!";
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Uni7Exe05 exe05 = new Uni7Exe05();
        String[] rapaz = new String[5]; //vetor para o rapaz
        String[] moca = new String[5]; //vetor para a moça
        System.out.println("Respostas do rapaz");
        exe05.lerVetor (rapaz);
        System.out.println("Respostas da moça");
        exe05.lerVetor (moca);
        String afinidade = exe05.calcularAfinidade (rapaz, moca);
        System.out.println(afinidade);
    }

}
