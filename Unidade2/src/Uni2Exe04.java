import java.util.Scanner;
public class Uni2Exe04 {

    public static void main(String[] args) {
        System.out.println( "Meu primeiro programa em Java");

        //declarar as variáveis
        float A;
        float B;
        float media;

        //criar uma variável para o teclado
        Scanner tec = new Scanner (System.in);

        //entrada dos dados
        System.out.println("Digite a primeira nota");
        A = tec.nextFloat();
        System.out.println("Digite a segunda nota");
        B = tec.nextFloat();

        //calcular a média - f indica que é float
        media = (A * 3.5f + B * 7.5f) / 11;

        //escrever a média
        System.out.println("Media = " + media);




    }
}
