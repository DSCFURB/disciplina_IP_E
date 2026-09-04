import java.util.Scanner;

public class Uni4Exe13 {

    public static void main(String[] args) {
        Scanner tec = new Scanner (System.in);
        // ler as cartas
        System.out.println("Carta 1");
        int carta1 = tec.nextInt();
        System.out.println("Carta 2");
        int carta2 = tec.nextInt();
        System.out.println("Carta 3");
        int carta3 = tec.nextInt();
        //inicializar uma variável para contar a quantidade de cartas
        int qtd = 0;
        //testar se a carta 1 é 1 2 ou 3
        if (carta1 <= 3) {
            qtd++; //equivale a qtd = qtd + 1
        }
        //testar se a carta 2 é 1 2 ou 3
        if (carta2 <= 3) {
            qtd++; //equivale a qtd = qtd + 1
        }
        //testar se a carta 3 é 1 2 ou 3
        if (carta3 <= 3) {
            qtd++; //equivale a qtd = qtd + 1
        }
        //escrever o resultado
        switch (qtd) {
            case 1 : System.out.println("Truco");
            break;
            case 2 : System.out.println("SEIS");
            break;
            case 3 : System.out.println("NOVEEEE");
            break;
        }

    }
}
