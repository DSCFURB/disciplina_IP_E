import java.util.Scanner;

public class Uni5Exe33 {

    public static void main(String[] args)  {
        Scanner teclado = new Scanner (System.in);
        //inicializar as variáveis para contar os votos
        long voto1 = 0, voto2 = 0, voto3 = 0, voto4 = 0;
        long votoNulo = 0, votoBranco = 0;
        byte voto;
        //repetir os comandos
        do {
            System.out.println("Informe o candidato (de 1 a 4)");
            System.out.println("5 - Nulo");
            System.out.println("6 - Branco");
            voto = teclado.nextByte();
            //contar de acordo com o voto
            switch (voto) {
                case 1 : voto1++; break;
                case 2 : voto2++; break;
                case 3 : voto3++; break;
                case 4 : voto4++; break;
                case 5 : votoNulo++; break;
                case 6 : votoBranco++; break;
                default :
                    if (voto > 6) 
                        System.out.println("Opção Inválida");
            }

        } while (voto > 0);
        System.out.println("Votos Candidato 1 " + voto1);
        System.out.println("Votos Candidato 2 " + voto2);
        System.out.println("Votos Candidato 3 " + voto3);
        System.out.println("Votos Candidato 4 " + voto4);
        System.out.println("Votos Nulos " + votoNulo);
        System.out.println("Votos Brancos " + votoBranco);
        long totalVotos = voto1 + voto2 + voto3 + voto4 + 
                          votoNulo + votoBranco;
        //(float) força a divisão a aceitar números decimais 
        System.out.printf("Percentual de brancos e nulos %.2f", 
                              (float)(votoNulo + votoBranco) / totalVotos * 100.0);
        teclado.close();
    }
}
