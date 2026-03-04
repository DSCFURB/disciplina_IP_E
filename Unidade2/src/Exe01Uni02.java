import java.util.Scanner;

public class Exe01Uni02 {


    public static void main(String[] args) {
              
        //classe para leitura dos dados
        Scanner teclado = new Scanner (System.in);
        
        //comando de leitura
        System.out.println ("Digite um numero inteiro");
        int valor1 = teclado.nextInt();
        System.out.println ("Digite outro numero inteiro");
        int valor2 = teclado.nextInt();

        //somar os valores
        int soma = valor1 + valor2;
        
        //escrever o resultado
        System.out.println ("Soma = " + soma); 

        //fechar o teclado
        teclado.close();
    }

}
