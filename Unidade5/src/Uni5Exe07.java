import java.util.Scanner;

public class Uni5Exe07 {

    public static void main(String[] args) {
        Scanner tec = new Scanner (System.in);

        //inicializar o maior valor possível
        float maior = Float.MIN_VALUE;
        //inicializar o menor possível
        float menor = Float.MAX_VALUE;

        //ler a quantidade de valores
        System.out.println("Digite a quantidade de números");
        int n = tec.nextInt();

        //para n numeros faça
        for (int i = 1; i <= n; i++) {
            //ler o número
            System.out.println("Digite um número decimal");
            float numero = tec.nextFloat();
            //testar se é o maior
            if (numero > maior) {
                maior = numero;
            }
            //testar se é o menor
            if (numero < menor) {
                menor = numero;
            }
        }
        //escrever o resultado
        System.out.println("Maior = " + maior);
        System.out.println("Menor = " + menor);
    }

}
