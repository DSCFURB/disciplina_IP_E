import java.util.Scanner;

public class Uni4Exe06 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //leitura de um caracter no Java: usar o método charAt (0)
        System.out.println ("Digite uma letra");
        char letra = teclado.next().charAt(0);
        //converter a letra para maiúscula
        letra = Character.toUpperCase(letra);
        //testar a variável
        if (letra == 'M') {
            System.out.println ("Masculino");
        } else {
            if (letra == 'F') {
                System.out.println ("Feminino");
            } else {
                if (letra == 'I') {
                    System.out.println ("Não Informado");
                } else {
                    System.out.println ("Entrada incorreta");
                }
            }
        }
        teclado.close();
    }

}
