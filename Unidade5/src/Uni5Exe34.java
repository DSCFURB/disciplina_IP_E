import java.util.Scanner;

public class Uni5Exe34 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        //inicializar as contas encerradas
        int contasEncerradas = 0;
        //variável para a opção
        int opcao;
        // repetir até opcao 3
        do {
            System.out.println("(1) - Encerrar a conta");
            System.out.println("(2) - Contas Encerradas");
            System.out.println("(3) - Sair");
            opcao = teclado.nextInt();
            //escolher a opção
            switch (opcao) {
                case 1 : 
                    System.out.println("Digite o nome");
                    String nome = teclado.next();
                    System.out.println("Digite o número de diárias");
                    int diarias = teclado.nextInt();
                    //verificar a taxa de serviço de acordo com as diárias
                    float taxaServico;
                    if (diarias < 15) {
                        taxaServico = 7.5f;
                    } else {
                        if (diarias == 15) {
                            taxaServico = 6.5f;
                        } else {
                            taxaServico = 5.0f;
                        }
                    }
                    System.out.println( "Nome = " + nome);
                    System.out.printf( "Valor a pagar = %.2f\n",
                                        taxaServico * diarias + 50.0);
                    //contar as contas encerradas
                    contasEncerradas++;                    
                    break;
                case 2 : 
                    System.out.println("Contas encerradas = " + 
                                        contasEncerradas);    
            }
        } while (opcao != 3);
    }
}
