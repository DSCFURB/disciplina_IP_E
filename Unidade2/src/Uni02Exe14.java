import java.util.Scanner;

public class Uni02Exe14 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);

        //ler o valor inteiro        
        System.out.println("Digite um numero inteiro");
        int numero = teclado.nextInt();
        //guardar o valor original
        int numeroOriginal = numero;
        //quantidade de notas de 100
        int notas100 = numero / 100;
        numero = numero % 100;
        //quantidade de notas de 50
        int notas50 = numero / 50;
        numero = numero % 50;
        //quantidade de notas de 20
        int notas20 = numero / 20;
        numero = numero % 20;
        //quantidade de notas de 10
        int notas10 = numero / 10;
        numero = numero % 10;
        //quantidade de notas de 5
        int notas5 = numero / 5;
        numero = numero % 5;
        //quantidade de notas de 2
        int notas2 = numero / 2;
        //quantidade de notas de 1
        int notas1 = numero % 2;

        System.out.println("Notas de 100: " + notas100);
        System.out.println("Notas de 50: " + notas50);
        System.out.println("Notas de 20: " + notas20);
        System.out.println("Notas de 10: " + notas10);
        System.out.println("Notas de 5: " + notas5);    
        System.out.println("Notas de 2: " + notas2);
        System.out.println("Notas de 1: " + notas1);
        System.out.println("Valor original: " + numeroOriginal);
        teclado.close();
    }
}
