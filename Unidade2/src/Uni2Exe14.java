import java.util.Scanner;

public class Uni2Exe14 {

    public static void main(String[] args) {
        
        //declarar as variáves
        int valor, notas100, notas50, notas20, notas10, notas5, notas2, notas1;

        //definir o teclado
        Scanner tec = new Scanner (System.in);
        
        //leitura
        System.out.println("Digite o valor");
        valor = tec.nextInt();

        // calcular a quantidade de notas
        notas100 = valor / 100;
        notas50 = valor % 100 / 50;
        notas20 = valor % 100 % 50 / 20;
        notas10 = valor % 100 % 50 % 20 / 10;
        notas5 = valor % 100 % 50 % 20 % 10 / 5;
        notas2 = valor % 100 % 50 % 20 % 10 % 5 / 2;
        notas1 = valor % 100 % 50 % 20 % 10 % 5 % 2;

        // escrever os resultados
        System.out.println("notas de 100 = " + notas100);
        System.out.println("notas de  50 = " + notas50);
        System.out.println("notas de  20 = " + notas20);
        System.out.println("notas de  10 = " + notas10);
        System.out.println("notas de   5 = " + notas5);
        System.out.println("notas de   2 = " + notas2);
        System.out.println("notas de   1 = " + notas1);
   
    }

}
