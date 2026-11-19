import java.util.Scanner;

public class Uni7Exe10 {

    private static Scanner tec = new Scanner (System.in);

    /**
     *  Mostra os valores do vetor até as q posições preenchidas 
     * @param vetor
     * @param q
     */
    private void mostrarValores (int[] vetor, int q) {
        for (int i = 0; i < q; i++) {
            System.out.printf (" %5d", vetor[i]);
            if (i + 1 % 10 == 0) { //quebrar a linha a cada oito números
                System.out.printf(" \n");
            }
        }
        System.out.printf("\n");
    }

    /**
     *  Método que retorna a posição de um valor no vetor.
     *  Caso o valor não seja encontrado, retorna -1
     * @param vetor
     * @param q
     * @param valor
     * @return posição do elemento no vetor ou -1 se não achou
     */
    private int pesquisarValor (int[] vetor, int q, int valor) {
        //percorrer o vetor
        for (int i = 0; i < q; i++) {
            //se o elemento atual do vetor for igual ao valor pesquisado
            if (vetor[i] == valor) {
                return i; //retorna a posição onde encontrou o valor
            }
        }
        return -1; //retorna -1 pois não encontrou o valor no vetor
    }

    /**
     * Método que exclui o valor do vetor
     * @param vetor
     * @param q
     * @param valor
     * @return verdadeiro se excluiu e falso se não excluiu
     */
    private boolean excluirValor (int[] vetor, int q, int valor) {
        //procurar o valor no vetor
        int posicao = pesquisarValor(vetor, q, valor);
        //se encontrou o valor no vetor
        if (posicao >= 0) {
            //deslocar os valores da direita para a esquerda a partir da posição 
            //do valor encontrado
            for (int i = posicao; i <= q - 2; i++) {
                //deslocar o valor
                vetor[i] = vetor[i + 1];
            }
            return true;
        }
        return false;
    }


    private void inverterValores (int[] vetor, int q) {
        //percorrer o vetor até a metade dele
        for (int i = 0; i <= (q - 1) / 2; i++) {
            //trocar o prim1eiro valor com o último, o segundo com o 
            //penúltimo e assim por diante
            int aux = vetor[i];
            vetor[i] = vetor[q - 1 - i];
            vetor[q - 1 - i] = aux;
        }
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
                    if (q < 50) {
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
                case 2 : 
                    System.out.println("Digite o valor a ser pesquisado");
                    int valor = tec.nextInt();
                    if (exe10.pesquisarValor (vetor, q, valor) >= 0) {
                        System.out.println("Valor cadastrado");
                    } else {
                        System.out.println("Valor não cadastrado");
                    }
                    break;    
                case 3 :
                    //solicitar o valor antigo e o novo
                    System.out.println("Digite o valor a ser trocado");
                    int valorATrocar = tec.nextInt();
                    System.out.println("Digite o novo valor");
                    int novoValor = tec.nextInt();
                    //pesquisar a posição do valor antigo no vetor
                    int posicao = exe10.pesquisarValor(vetor, q, valorATrocar);
                    //se o valor está no vetor
                    if (posicao >= 0) {
                        //colocar o novo valor na posição do antigo
                        vetor[posicao] = novoValor;
                        System.out.println("O valor foi trocado");
                    } else {
                        System.out.println("O valor não existe no vetor para ser trocado");
                    }
                    break;
                case 4 :
                    System.out.println("Digite o valor a excluir");
                    int valorAExcluir = tec.nextInt();
                    if (exe10.excluirValor (vetor, q, valorAExcluir)) {
                        //diminuir o valor de elementos do vetor
                        q--;
                        System.out.println("Valor excluído");
                    } else {
                        System.out.println("Valor não encontrado");
                    }
                    break;
                case 5 :
                    exe10.mostrarValores (vetor, q); //mostra o conteúdo do vetor
                    break; 
                case 7 :
                    exe10.inverterValores (vetor, q); //inverte os valores do vetor
                    System.out.println("Os valores foram trocados de posição.");
                    break;   
            }

        } while (opcao != 8); //controla o menu
       
    }

}
