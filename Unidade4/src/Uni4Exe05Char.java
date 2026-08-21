import java.util.Scanner;

public class Uni4Exe05Char {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("A cor é azul? (S/N");
        char resposta = tec.next().charAt(0); //ler um caracter
        //testar a resposta
        if (resposta == 'S') { //só funciona para o S maiúsculo
            System.out.println("Sim");
        } else {
            System.out.println("Não");
        }
    }

}
