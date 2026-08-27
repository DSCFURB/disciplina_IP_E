import java.util.Scanner;

public class Uni4Exe08 {

    public static void main(String[] args) {
        Scanner tec = new Scanner (System.in);

        //ler a letra
        System.out.println("Digite uma letra");
        char letra = tec.next().charAt (0);
        //converter a letra para minúscula
        letra = Character.toLowerCase(letra);
        //testar se é vogal
        if (letra == 'a' || letra == 'e' || letra == 'i' ||
            letra == 'o' || letra == 'u') {
                System.out.println("É vogal");
            } else {
                System.out.println("Não é vogal");
            }       
    }

}

