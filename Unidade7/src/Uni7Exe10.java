import java.util.Scanner;

public class Uni7Exe10 {

    private static Scanner tec = new Scanner (System.in);

    /** Mostra os valores do vetor até as q posições preenchidas */
    private void mostrarValores (int[] vetor, int q) {
        for (int i = 0; i < q; i++) {
            System.out.printf (" %5d", vetor[i]);
            if (i + 1 % 10 == 0) { //quebrar a linha a cada oito números
                System.out.printf("\n");
            }
        }
        System.out.printf("\n");
    }

    public static void main(String[] args) {
        Uni7Exe10 exe10 = new Uni7Exe10();

        //criar o vetor
        int vetor[] = new int[50];
        //variável para indicar quantos elementos estão no vetor
        int q = 0;

        //variável para controlar o menu
        int opcao;
        do {
            //montar o menu
            System.out.println("1 - Incluir valor");
            System.out.println("2 - Pesquisar valor");
            System.out.println("3 - Alterar valor");
            System.out.println("4 - Excluir valor");
            System.out.println("5 - Mostrar valores");
            System.out.println("6 - Ordenar valores");
            System.out.println("7 - Inverter valores");
            System.out.println("8 - Sair do sistema");
            opcao = tec.nextInt();
            switch (opcao) {
                case 1:   
                    //ver se ainda há espaço
                    if (q < 5) {
                        //ler o valor
                        System.out.println("Digite o valor a ser inserido");
                        vetor[q] = tec.nextInt();
                        //aumentar o tamanho do vetor
                        q++;
                        System.out.println("Valor inserido no vetor");
                    } else {
                        System.out.println("Não há mais espaço no vetor");
                    }                 
                    break;
                case 5 :
                    exe10.mostrarValores (vetor, q); //mostra o conteúdo do vetor
                    break;    
            }

        } while (opcao != 8); //controla o menu

        
    }

}
