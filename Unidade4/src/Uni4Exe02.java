import java.util.Scanner;

public class Uni4Exe02 {
 
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        //ler o número
        System.out.println("Digite um valor");
        int valor = tec.nextInt();
        //testar se é par ou ímpar
        if (valor % 2 == 0) {
            System.out.println("O número é par");
        } else {
            System.out.println("O valor é ímpar");
        }


    }

}
