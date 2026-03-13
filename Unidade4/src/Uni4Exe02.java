import java.util.Scanner;

public class Uni4Exe02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //ler o valor inteiro
        System.out.println ("Digite um número");
        int valor = teclado.nextInt();

        //testar se é par ou ímpar
        if (valor % 2 == 0) {
            System.out.println ("O valor é par");
        } else {
            System.out.println ("O valor é ímpar");
        }

        teclado.close();
    }
}
