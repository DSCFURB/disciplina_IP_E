import java.util.Scanner;

public class Uni4Exe24 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //ler os três valores
        System.out.println("Digite o valor 1");
        int valor1 = teclado.nextInt();
        System.out.println ("Digite o valor 2");
        int valor2 = teclado.nextInt();
        System.out.println ("Digite o valor 3");
        int valor3 = teclado.nextInt();

        //achar o maior, o menor e o médio
        int maior, menor, medio;

        //verificar se o 1 é o maior entre os três
        if (valor1 > valor2 && valor1 > valor3) {
            maior = valor1;
            //testar o menor entre o 2 e o 3
            if (valor2 < valor3) {
                menor = valor2;
                medio = valor3;
            } else {
                menor = valor3;
                medio = valor2;
            }
        } else {
            //testar se o 2 é o maior
            if (valor2 > valor3) {
                maior = valor2;
                //testar o menor
                if (valor1 < valor3) {
                    menor = valor1;
                    medio = valor3;
                } else {
                    menor = valor3;
                    medio = valor1;
                }
            } else {
                maior = valor3;
                //testar se o 1 é o menor
                if (valor1 < valor2) {
                    menor = valor1;
                    medio = valor2;
                } else {
                    menor = valor2;
                    medio = valor1;
                }
            }
        }

        //ler opção
        System.out.println("Digite a opção 1 (crescente), 2 (decrescente), 3 (maior no meio)");
        int opcao = teclado.nextInt();

        switch (opcao) {
            case 1:
                System.out.printf ("%d, %d, %d", menor, medio, maior); 
                break;
            case 2:     
                System.out.printf ("%d, %d, %d", maior, medio, menor); 
                break;
            case 3:     
                System.out.printf ("%d, %d, %d", menor, maior, medio); 
                break;
        }        
    }
}
