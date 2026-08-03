import java.util.Scanner;

public class Contar {

    // Subprograma sem static
    public int contarLetra(char letra, String frase) {

        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {

            if (frase.charAt(i) == letra) {
                contador++;
            }
        }

        return contador;
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        char letra;
        String frase;

        System.out.print("Digite uma letra minúscula: ");
        letra = teclado.next().charAt(0);

        teclado.nextLine();

        System.out.print("Digite uma frase em letras minúsculas: ");
        frase = teclado.nextLine();

        // Criar objeto da classe
        Contar obj = new Contar();

        // Chamar método pelo objeto
        int quantidade = obj.contarLetra(letra, frase);

        System.out.println("A letra aparece " + quantidade + " vezes.");

        teclado.close();
    }
}
