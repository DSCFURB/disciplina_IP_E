import java.util.Scanner;

public class Uni4Exe24 {

    public static void main(String[] args) {
        Scanner tec = new Scanner (System.in);

        //ler os valores
        System.out.println("Digite o primeiro valor");
        int valor1 = tec.nextInt();
        System.out.println("Digite o segundo valor:");
        int valor2 = tec.nextInt();
        System.out.println("digite o terceiro valor");
        int valor3 = tec.nextInt();
        int aux; //variável auxiliar para trocar os valores de posição
        //ordenar os valores nas variáveis
        //verificar se precisa trocar os dois primeiros
        if (valor1 > valor2) {
            //trocar a posição do 1 pelo 2
            aux = valor1;
            valor1 = valor2;
            valor2 = aux;
        }
        //verificar se precisa trocar o primeiro e o último
        //lembrando que, pelo teste anterior, os dois primeiros estão ordenados
        if (valor1 > valor3) {
            //colocar o 3 como primeiro mantendo a ordenação dos outros dois
            aux = valor3;
            valor3 = valor2;
            valor2 = valor1;
            valor1 = aux;
        }
        //verificar se precisa trocar o segundo e o terceiro
        if (valor2 > valor3) {
            aux = valor2;
            valor2 = valor3;
            valor3 = aux;
        }
        //escrever de acordo com a opção
        System.out.println("Informe a opção");
        System.out.println("1 - Valores em ordem crescente");
        System.out.println("2 - valores em ordem decrescente");
        System.out.println("3 - Valores com o maior no meio");
        int opcao = tec.nextInt();
        switch (opcao) {
            case 1: System.out.printf("%d - %d - %d\n", valor1, valor2, valor3);             
                break;
            case 2: System.out.printf("%d - %d - %d\n", valor3, valor2, valor1);             
                break;
            case 3: System.out.printf("%d - %d - %d\n", valor1, valor3, valor2);             
                break;
        }
        
    }
}
