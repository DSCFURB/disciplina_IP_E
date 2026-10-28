import java.util.Scanner;

public class Uni6Exe05 {
    /**
     * Verifica se uma frase é palíndromo
     * @param frase
     * @return
     */
    private boolean palindromo (String frase) {
        int inicio = 0; //controla o caracter da esquerda da frase
        int fim = frase.length() - 1; //controla o caracter da direita da frase
        //repetir até chegar no meio da frase
        while (inicio < fim) {
            //comparar se o caracter da esquerda equivale ao da direita
            if (frase.charAt(inicio) == frase.charAt(fim)) {
                //atualizar os índices
                inicio++;
                fim--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        Uni6Exe05 exe05 = new Uni6Exe05();

        // inicializar a quantidade de palíndromos
        int quantidade = 0;

        // ler a frase
        System.out.println("Digite uma frase");
        String frase = tec.nextLine();
        // enquanto não digitar palavra vazia
        while (!frase.equalsIgnoreCase("")) {
            //verificar se a frase é palíndromo
            if (exe05.palindromo(frase)) {
                System.out.println("A frase é palíndromo");
                quantidade++;
            } else {
                System.out.println("A frase não é palíndromo");
            }
            // ler a frase
            System.out.println("Digite uma frase");
            frase = tec.nextLine();
        }
        System.out.println("Foram digitados " + quantidade + " palíndromos");
    }
}
