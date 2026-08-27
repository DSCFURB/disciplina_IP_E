import java.util.Scanner;

public class Uni4Exe12 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        // leitura dos dados
        System.out.println("Digite o primeiro lado");
        int lado1 = tec.nextInt();
        System.out.println("Digite o segundo lado");
        int lado2 = tec.nextInt();
        System.out.println("Digite o terceiro lado");
        int lado3 = tec.nextInt();

        // testar se é um triângulo
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            // tester se é equilátero
            if (lado1 == lado2 && lado1 == lado3) {
                System.out.println("Triãngulo Equilátero");
            } else {
                //testar se é isósceles
                if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                    System.out.println("Triângulo Isósceles");
                } else {
                    System.out.println("Triângulo escaleno");
                }
            }
        } else {
            System.out.println("Não é triângulo");
        }
    }

}
