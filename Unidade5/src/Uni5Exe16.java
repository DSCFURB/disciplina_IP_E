import java.util.Scanner;

public class Uni5Exe16 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        //inicializar variavies
        double somaAltura = 0; //soma das alturas de todas as pessoas
        double somaFeminino = 0; //soma da altura das mulheres
        int contPessoas = 0; //quantidade de pessoas digitadas
        int contFeminino = 0; // quantidade de mulheres
        //ler a altura
        System.out.println("Digite a altura");
        double altura = teclado.nextDouble();
        // repetição com flag 0 para a altura
        while (altura != 0) {
            //ler gênero
            System.out.println("Digite o gênero");
            char genero = teclado.next().charAt(0);
            // somar as alturas e contar as pessoas
            somaAltura += altura;
            contPessoas++; //acrescenta uma unidade na variável
            //testar se é mulher
            if (genero == 'F' || genero == 'f') {
                //somar as alturas e comtar as mulheres
                somaFeminino += altura;
                contFeminino++;
            }
            System.out.println("Digite a altura");
            altura = teclado.nextDouble();
        }
        if (contPessoas > 0) {
            System.out.println("Média da altura das pessoas = " +
                     (somaAltura / contPessoas));
        } else {
            System.out.println("Não foram digitados dados");
        }

        if (contFeminino > 0) {
            System.out.println("Média de altura das mulheres = " +
                (somaFeminino / contFeminino));
        } else {
            System.out.println("Não foram digitados dados de mulheres");
        }
    }
}
