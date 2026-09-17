import java.util.Scanner;

public class Uni5Exe01 {

    public static void main(String[] args) {
        Scanner tec = new Scanner (System.in);

        //repetir para 20 números
        for (int i = 1; i <= 20; i++) {
            //ler numero
            System.out.println("Digite um número");
            int numero = tec.nextInt();
            //testar se é par ou ímpar
            if (numero % 2 == 0) {
                System.out.println("Par");
            } else {
                System.out.println("Ímpar");
            }
        }
    }
}
