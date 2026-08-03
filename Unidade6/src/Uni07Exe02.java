import java.util.Scanner;

public class Uni7Exe02 {

    private int contarPalavras (String palavra, String frase) {
    /* este método conta quantas vezes a palavras aparece na frase  */
    //acrescentar um espaço em branco no fim da frase para testar a útltima palavra
        frase+=" ";
        //contador das palavras
        int qtdadePalavras = 0;
        //inicializar palavra para retirar da frase
        String novaPalavra = "";
        //percorrer a frase
        for (int cont = 0; cont < frase.length(); cont++) {
            //ver se na posição cont tem uma letra e não um espaço em branco
            if (frase.charAt(cont) != ' ') {
                //acrescentar a letra na nova palavra
                novaPalavra += frase.charAt(cont);
            } else {
                //verificar se é a palavra pesquisada
                if (palavra.equalsIgnoreCase(novaPalavra)) {
                    //contar a palavra
                    qtdadePalavras++;
                }
                //reiniciar a palavra da frase
                novaPalavra = "";
            }
        }
        //retornar o resultado
        return qtdadePalavras;      
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        //criar um objeto para poder chamr o método
        Uni7Exe02 exercicio = new Uni7Exe02();

        //ler as entradas
        System.out.println("Digite uma frase");
        String frase = teclado.nextLine();
        System.out.println("Digite uma palavra");
        String palavra = teclado.next();

        //chamar a função que conta as plavras na frase
        int qtdadePalavras = exercicio.contarPalavras (palavra, frase);

        System.out.println("A palavra aparece " + qtdadePalavras + " vezes na frase.");



    }
}
