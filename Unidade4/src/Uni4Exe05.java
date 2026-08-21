import java.util.Scanner;

public class Uni4Exe05 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("A cor é azul? (responda true ou false)");
        boolean resposta = tec.nextBoolean();
        //testar a resposta - como a variável resposta é lógica
        //não precisa de comparação
        if (resposta) {
            System.out.println("Sim");
        } else {
            System.out.println("Não");
        }
    }

}
