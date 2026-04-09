import java.util.Scanner;

public class Uni5Exe07 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //ler a quantidade de valores
        System.out.println("Digite a quantidade de valores");
        int n = teclado.nextInt();
        //inicializar com o menor valor possível
        float maior = Float.MIN_VALUE;
        //inicializar com o maior valor possível
        float menor = Float.MAX_VALUE;
        //repetir para os n valores
        for (int cont = 1; cont <=n; cont++) {
            //ler o valor
            System.out.printf("Digite o valor %d\n", cont);
            float numero = teclado.nextFloat();
            //verificar se é o maior número
            if (numero > maior) {
                maior = numero;
            }
            //verificar se é o menor numero
            if (numero < menor) {
                menor = numero;
            }
        }
        System.out.println("Maior valor = " + maior);
        System.out.println("Menor valor = " + menor);
    }
}
