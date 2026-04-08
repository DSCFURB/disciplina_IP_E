import java.util.Scanner;

public class Uni5Exe13 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //ler a quantidade de abastecimentos
        System.out.println("Informe o número de abastecimentos");
        int abastecimentos = teclado.nextInt();
        //inicializar a soma do combustivel e quilometragem
        float somaQuilometragem = 0;
        float somaCombustivel = 0;
        //repetir para cada abastecimento
        for (int cont = 0; cont < abastecimentos; cont++) {
            //informar a quilometragem e o combustivel do abastecimento
            System.out.println("informe a quilometragem");
            float quilometragem = teclado.nextFloat();
            System.out.println("Informe a quantidade de combustivel");
            float combustivel = teclado.nextFloat();
            //informar o consumo
            System.out.printf("Consumo = %.2f\n", quilometragem / combustivel);
            //somar a quilometragem e o combustivel total da viagem
            somaQuilometragem += quilometragem;
            somaCombustivel += combustivel;
        }
        System.out.printf ("Consumo total = %.2f\n", 
                                      somaQuilometragem / somaCombustivel);
    }
}
