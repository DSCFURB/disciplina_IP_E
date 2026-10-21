import java.util.Scanner;

public class Exemplo01 {

    private int soma (int a, int b) {
        int total = a + b;
        return total;
    } 

    private int subtrai (int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        //criando um objeto da própria classe para evitar o uso de método static (construtor)
        Exemplo01 exe = new Exemplo01();

        System.out.println("Digite o primeiro numero");
        int numero1 = tec.nextInt();
        System.out.println("Digite o segundo numero");
        int numero2 = tec.nextInt();
        int resultado = exe.soma (numero1, numero2);
        System.out.println("Soma = " + resultado);
        System.out.println("Subtração = " + exe.subtrai(numero2, numero1));        
    }

}
