import java.util.Scanner;

public class Uni07Exe01 {
    //private significa que só os métodos desta classe podem usar esse método
    private int contarLetras (char letra, String frase) {
        /* método que recebe uma letra e uma frase e
        retorna a quantidade de vezes que a letra está na frase */
        int contLetra = 0; //variável para armazenar a quantidade de vezes que a letra está na frase
        //percorrer a frase até o seu final, que é representado pela função length
        for (int cont = 0; cont < frase.length(); cont++) {
            //verificar se a letra pesquisada corresponde à letra da frase
            if (letra == frase.charAt(cont)) {
                //contar a letra
                contLetra++;
            } 
        }
        //retornar o resultado
        return contLetra;
    }


    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        //leitura d letra e da frase  
        System.out.println("Digite uma letra");
        char letra = teclado.next().charAt(0);

        teclado.nextLine(); // para não pular a leitura

        System.out.println("Digte uma frase");
        String frase = teclado.nextLine();

        //criar um objeto da classe Uni07Exe01
        Uni07Exe01 exercicio = new Uni07Exe01(); 

        //chamar a função que conta a quantidade de vezes 
        //que a letra está na frase
        int quantidade = exercicio.contarLetras (letra, frase);

        //escrever o resultado
        System.out.println("A letra " + letra + " aparece " +
                quantidade + " vezes na frase");
        
    }
}
