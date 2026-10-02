import java.util.Scanner;

public class Uni5Exe34 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        //contar contas encerradas
        int contasEncerradas = 0;
        int opcao; //variável para a opção do menu

        do {
            System.out.println("Escolha a opção");
            System.out.println(" 1 - Encerrar conta");
            System.out.println(" 2 - Número de Contas Encerradas");
            System.out.println(" 3 - Sair");
            //ler a opção desejada
            opcao = tec.nextInt();
            //escolher a opcao
            switch (opcao) {
                case 1 : 
                    System.out.println("Digite o nome do hóspede");
                    String nome = tec.next();
                    System.out.println("Número de diárias");
                    int diarias = tec.nextInt();
                    //calcular o valor a pagar
                    if (diarias < 15) {
                        System.out.println("Valor a pagar = " + diarias * 57.5);
                    } else {
                        if (diarias == 15) {
                            System.out.println("Valor a pagar = " + diarias * 56.5);
                        } else {
                            System.out.println("Valor a pagar = " + diarias * 55);
                        }
                    }
                    //contar contas encerradas
                    contasEncerradas++;
                    break;
                case 2 : 
                    System.out.println("Contas Encerradas = " + contasEncerradas);
                    break;    
            }
        } while (opcao != 3);
        System.out.println("Obrigado por usar Luxury Hotels.com");
    }
}
