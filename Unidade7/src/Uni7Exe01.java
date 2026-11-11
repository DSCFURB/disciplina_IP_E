import java.util.Scanner;

public class Uni7Exe01 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        //criar o vetor
        int numeros[] = new int[10];
        //ler os valores e armazenar no vetor
        for (int i = 0; i <= 9; i++) {
            System.out.println("Digite o número da posição " + i + " do vetor");
            numeros[i] = tec.nextInt();
        }
        //escrever o vetir
        for (int i = 9; i >= 0; i--) {
            System.out.println("Vetor[" + i + "] = " + numeros[i]);
        }
    }
}
