import java.util.Scanner;

public class Uni4Exe22 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //ler a opção
        System.out.println("Digite a opção entre 1 e 4: ");
        int opcao = teclado.nextInt();
        //selecionar a opção
        switch (opcao) {
            case 1 : System.out.println("Bacharel em Ciência da Computação");
            break;
            case 2 : System.out.println("Licenciado em Computação");
            break;
            case 3 : System.out.println("Bacharel em Sistemas de Informação");
            break;
            case 4 : System.out.println("Bacharel em Ciência de Dados");
            break;
            default : System.out.println("Opção inválida");
        }
        teclado.close();
    }

}
