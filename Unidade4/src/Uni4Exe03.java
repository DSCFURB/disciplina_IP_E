import java.util.Scanner;

public class Uni4Exe03 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // entrada de dois números
        System.out.println ("Digite o primeiro valor");
        int valor1 = teclado.nextInt();
        System.out.println ("Digite o segundo valor");
        int valor2 = teclado.nextInt();

        //descobrir o maior entre os dois
        if (valor1 > valor2) {
             System.out.println (valor1 + " maior que " + valor2);
        } else {
            if (valor2 > valor1) {
             System.out.println (valor2 + " maior que " + valor1); 
            } else {
                System.out.println ("Os valores são iguais");
            }          
        }

        teclado.close();

    }
}
