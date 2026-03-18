import java.util.Scanner;

public class Uni4Exe08 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //ler a letra
        System.out.println("Digite a letra");
        char letra = teclado.next().charAt(0);
        //converter a letra para maiúscula
        letra = Character.toUpperCase(letra);
        //testar se é vogal
        if (letra == 'A' || letra == 'E' || letra == 'I' || 
            letra == 'O' || letra == 'U') {
                System.out.println("Vogal");
            } else {
                System.out.println("Não é vogal");
            }
    }

}
