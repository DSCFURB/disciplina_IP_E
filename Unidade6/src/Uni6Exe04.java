import java.util.Scanner;

public class Uni6Exe04 {

    private int contarVogais (String texto) {
        //variável para contar as vogais
        int qtdVogais = 0;
        //percorrer o texto
        for (int i = 0; i < texto.length(); i++) {
            //verificar se a letra na posição i é vogal
            switch (texto.charAt(i)) {
                case 'a' :
                    case 'e' :
                        case 'i' :
                            case 'o' :
                                case 'u': qtdVogais++;
            }
        }
        return qtdVogais;
    }

    private int informarNumero (String texto) {
        int i = 0; //define a posição do caracter no texto
        String numero = ""; // recebe os números do início do texto
        //percorrer o texto enquanto tiver caracter e for entre 0 e 9
        while (i < texto.length() && texto.charAt(i) >= '0' && texto.charAt(i) <= '9') {
            //concatena o carcater no numero
            numero += texto.charAt(i);
            //atualiza a posição do i
            i++;
        }
        if (i == 0) {
            return 0;
        } else {
            //converte o string do numero para um valor numérico
            return Integer.parseInt(numero); 
        }
    }

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        Uni6Exe04 exe04 = new Uni6Exe04();
        //ler o texto
        System.out.println("Informe o texto");
        String texto = tec.nextLine();
        //chamar o método que conta as vogais
        System.out.println(" O texto tem " + exe04.contarVogais (texto) + " vogais");
        //informar o número do início
        System.out.println("O número do inicio é " + exe04.informarNumero(texto));
    }

}
