import java.util.Scanner;

public class Uni6Exe10A {    
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    
        int vetor[] = new int [50];
        int menu = 0;

        while (menu != 8) {
            menu = menuDeSelecao(teclado);
            switch (menu) {
                case 1:
                    incluirValor(teclado, vetor);
                    break;
                case 2:
                    pesquisarValor(teclado, vetor);
                    break;
                case 3:
                    alterarValor(teclado, vetor);
                    break;
                case 4:
                    excluirValor(teclado, vetor);
                    break;
                case 5:
                    mostrarValores(vetor);
                    break;
                case 6:
                    ordenarValores(vetor);
                    break;
                case 7:
                    inverterValores(vetor);
                    break;
            }
        }

        teclado.close();
    }
    
    public static int menuDeSelecao(Scanner teclado) { 
    
        System.out.println();
        System.out.println("Informe o número do menu desejado: \n1: Incluir valor \n2: Pesquisar valor \n3: Alterar valor \n4: Excluir valor \n5: Mostrar valores \n6: Ordenar valores \n7: Inverter valores \n8: Sair do sistema ");
        System.out.println();
        System.out.print("Selecione a opção: ");
        int menu = teclado.nextInt();

        while (menu < 1 || menu > 8) {
            System.out.println("Opção inexistente. Selecione uma das opçõesdo menu: ");
            menu = teclado.nextInt();
        }
        
        return menu;
    }

    public static void incluirValor(Scanner teclado, int vetor[]) {
        System.out.print("Informe o valor que deseja incluir: ");
        int incluir = teclado.nextInt();

        int i = 0;
        while (i < vetor.length) {
            if (vetor[i] == 0) {
                vetor[i] = incluir;
                System.out.println("Valor " + incluir + " colocado no vetor na posição " + i);
                return;
            }
            else i++;
        }
        System.out.println("O vetor está sem espaços, o valor não foi adicionado");
    }
    
    public static void pesquisarValor(Scanner teclado, int vetor[]) {
        System.out.print("Informe o valor que deseja pesquisar: ");
        int pesquisar = teclado.nextInt();
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == pesquisar) {
                System.out.println("Valor " + pesquisar + " encontrado na posição [" + i + "]");
                return;
            }
        }

        System.out.println("Valor " + pesquisar + " não encontrado");
    }

    public static void alterarValor(Scanner teclado, int vetor[]) {
        System.out.print("Informe o valor a ser alterado: ");
        int alterar = teclado.nextInt();

        int posicao = 0;
        boolean encontrado = false;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == alterar) {
                encontrado = true;
                posicao = i;
            }
        }

        if (!encontrado) {
            System.out.println("Valor não encontrado");
            return;
        }
        System.out.print("Informe o novo valor a ser inserido: ");
        int inserir = teclado.nextInt();

        vetor[posicao] = inserir;
        System.out.println("Valor " + alterar + " substituido por "+ inserir);
    }
    
    public static void excluirValor(Scanner teclado, int vetor[]) {
       System.out.print("Informe o valor a ser excluído: ");
        int excluir = teclado.nextInt();

        int posicao = 0;
        boolean encontrado = false;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == excluir) {
                encontrado = true;
                posicao = i;
            }
        }
        if (!encontrado) {
            System.out.println("O valor não foi encontrado");
            return;
        }

        vetor[posicao] = 0;
        System.out.println("O valor "+ excluir +" foi excluído");
    }

    public static void mostrarValores(int vetor[]) {
        System.out.print("Valores: [ ");
        for (int i = 0; i < vetor.length; i++) {
            if (i != vetor.length - 1) {
            System.out.print(vetor[i] + ", "); }
            else {
                System.out.println(vetor[i] + " ]"); }
        }
    }

    public static void ordenarValores(int vetor[]) {
     
        int armazenar = 0, i = 0;

        while (i < vetor.length - 1) {    
            if (vetor[i] > vetor[i+1]) {
                armazenar = vetor[i];
                vetor[i] = vetor[i+1];
                vetor[i+1] = armazenar;
                i = 0; }
            else {
                i += 1;
            }
        }

        System.out.println("O vetor foi ordenado");
    }

    public static void inverterValores(int vetor[]) {
        int armazenar = 0;
        int j = vetor.length-1;

        for (int i = 0; i < vetor.length/2; i++) {
            armazenar = vetor[j];
            vetor[j] = vetor[i];
            vetor[i] = armazenar;
            j--;
        }

        System.out.println("O vetor foi invertido");
    }

    public static void sairDoSistema(int menu) {
        new Uni6Exe10();
    }
}