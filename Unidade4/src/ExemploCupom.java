import java.util.Scanner;

public class ExemploCupom {

    public static void main(String[] args) {
        //entrada de dados
        Scanner scanner = new Scanner(System.in);
        scanner.
        System.out.print("Digite o valor do produto: ");
        double valorProduto = scanner.nextDouble();
        System.out.println ("Tem cupom?");
        boolean temCupom = scanner.nextBoolean();
        //definindo o desconto incial
        double desconto = 0.0;
        //verificando se tem cupom
        if (temCupom) {
           // calcular o desconto de 10%
           desconto = valorProduto * 0.10;
           //testar o limite do desconto
           if (desconto > 15.0) {
                desconto = 15.0;
              }
        }
        //calcular o valor final
        System.out.printf ("Valor a pagar: %.2f\n", (valorProduto - desconto));
        //fechar o scanner  
        scanner.close();
    }
}
