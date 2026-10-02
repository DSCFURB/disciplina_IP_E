import java.util.Scanner;

public class Uni5Exe33 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        //inicializar os contadores de votos
        int contC1 = 0, contC2 = 0, contC3 = 0, contC4 = 0;
        int contB = 0, contN = 0;
        int voto;
        do {
            System.out.println("Escolha a opção");
            System.out.println(" 1 - Chapa 1");
            System.out.println(" 2 - Chapa 2");
            System.out.println(" 3 - Chapa 3");
            System.out.println(" 4 - Chapa 4");
            System.out.println(" 5 - Branco");
            System.out.println(" 6 - Nulo");
            System.out.println(" 0 - Encerrar a votação");
            voto = tec.nextInt();
            //contabilizar o voto
            switch (voto) {
                case 1 : contC1++; break;
                case 2 : contC2++; break;
                case 3 : contC3++; break;
                case 4 : contC4++; break;
                case 5 : contB++; break;
                case 6 : contN++; break;
                default :
                    if (voto != 0) {
                        System.out.println("Opção Inválida");
                    }
            } 
        } while (voto != 0);
        System.out.println("Votos da Chapa 1 = " + contC1);
        System.out.println("Votos da Chapa 2 = " + contC2);
        System.out.println("Votos da Chapa 3 = " + contC3);
        System.out.println("Votos da Chapa 4 = " + contC4);
        System.out.println("Votos em Branco  = " + contB);
        System.out.println("Votos Nulos      = " + contN);
        int totalVotos = contC1+contC2+contC3+contC4+contB+contN;
        System.out.printf("%% brancos e nulos = %.2f%%",  
                    ((double) (contB+contN)/totalVotos*100));

    }

}
