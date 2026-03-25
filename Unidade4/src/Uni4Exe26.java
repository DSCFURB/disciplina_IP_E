import java.util.Scanner;

public class Uni4Exe26 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //ler a opção
        System.out.println("Digite a opção");
        System.out.println("T - Triângulo");
        System.out.println("Q - Quadrado");
        System.out.println("R - Retângulo");
        System.out.println("C - Círculo");
        char opcao = teclado.next().charAt(0);
        //converter a letra para maiúscula
        opcao = Character.toUpperCase(opcao);
        //definir a variável para calculo da área
        float area = 0;
        //escolher a opção
        switch (opcao) {
            case 'T' : {
                System.out.println("Digite a base e a altura");
                float base = teclado.nextFloat();
                float altura = teclado.nextFloat();
                //calcular a área
                area = base * altura / 2;
                break;
            }
            case 'Q' : {
                System.out.println("Digite o lado");
                float lado = teclado.nextFloat();
                //calcular a área
                area = lado * lado;
                break;
            }
            case 'R' : {
                System.out.println("Digite a base e a altura");
                float base = teclado.nextFloat();
                float altura = teclado.nextFloat();
                //calcular a área
                area = base * altura;
                break;
            }
            case 'C' : {
                System.out.println("Digite o raio");
                float raio = teclado.nextFloat();
                //calcular a área
                area = (float) Math.PI * raio * raio;
                break;
            }           
        }
        System.out.printf ("Área = %f", area);
        teclado.close();
    }
}
