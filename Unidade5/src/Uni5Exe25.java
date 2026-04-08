import java.util.Scanner;

public class Uni5Exe25 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //inicializar os pontos de cada jogador
        byte pontosD = 0;
        byte pontosE = 0;
        //controla se o jogo teve vencedor
        boolean vencedor = false;
        //repetir a leitura das jogadas
        do {
            //ler o ponto
            char ponto = teclado.next().charAt(0);
            //transformar para maiúsculo 
            ponto = Character.toUpperCase(ponto);
            //marcar o ponto
            switch (ponto) {
                case 'D': pontosD++; break;
                case 'E': pontosE++; break;
            }
            //informar o placar parcial
            System.out.printf("D %d x %d E\n", pontosD, pontosE);
            if ((pontosD >= 7) && (pontosD - pontosE >= 2)) {
                System.out.println("Jogador da direita venceu!");
                vencedor = true;
            } else 
                if ((pontosE >= 7) && (pontosE - pontosD >= 2)) {
                    System.out.println("Jogador da esquerda venceu!");
                    vencedor = true;
                }
        } while (!vencedor); 
    }
}
