import java.util.Scanner;

public class Uni5Exe15 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //ler o nome que é um "flag" - 
        // uma variável que sinaliza uma condição de fim de letura
        System.out.println("Digite o nome"); 
        String nome = teclado.next();
        //enquanto o flag (nome) não for "Fim"
        while (!nome.equalsIgnoreCase("fim")) {
            //ler as notas
            System.out.println("Digite a primeira nota");
            float nota1 = teclado.nextFloat();
            System.out.println("Digite a segunda nota");
            float nota2 = teclado.nextFloat();
            //calcular a média
            float media = (nota1 + nota2) / 2;
            //escrever o nome e a média
            System.out.printf ("A média do(a) %s é %.1f\n", 
                               nome, media);
            //ler o próximo nome
            System.out.println("Digite o nome");
            nome = teclado.next();                   
        }
    }
}
