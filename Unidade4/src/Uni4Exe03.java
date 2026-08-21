import java.util.Scanner;

public class Uni4Exe03 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        // ler as entradas
        System.out.println("Digite o valor de A");
        int A = tec.nextInt();
        System.out.println("Digite o valor de B");
        int B = tec.nextInt();
        // testar quem é o maior
        if (A > B) {
            System.out.println("Maior = " + A);
        } else {
            if (B > A) {
                System.out.println("Maior = " + B);
            } else {
                System.out.println("A e B são iguais");
            }
        }

    }

}
