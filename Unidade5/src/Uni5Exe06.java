import java.util.Scanner;

public class Uni5Exe06 {

    public static void main(String[] args) {
        Scanner tec = new Scanner (System.in);
        //declarar uma variável para a soma
        double soma = 0;
        //repetir para 20 pessoas
        for (int i = 1; i <= 20; i++) {
            //ler a altura 
            System.out.println("Digite a altura");
            double altura = tec.nextDouble();
            //somar a altura
            soma += altura;
        }
        //calcular a média
        double media = soma / 20;
        //escrever
        System.out.printf("Altura média dos alunos = %.2f", media);
    }
}
