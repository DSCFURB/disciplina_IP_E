import java.util.Scanner;

public class Uni7Exe09 {

    private static final int qtd = 5; //valor constante


    private float calcularMedia (float[] nota) {
        //inicializar uma variável para a soma
        float soma = 0;
        //percorrer o vetor
        for (int i = 0; i < qtd; i++) {
            //somar o valor da posição i do vetor
            soma += nota[i];
        }
        return soma / qtd;
    }

    private int contar (int[] idade, float[] nota, char[] sexo, float media) {
        //inicializar uma variável para a contagem
        int contador = 0;
        //percorrer o vetor
        for (int i = 0; i < qtd; i++) {
            //verificar se atende as condições esperadas e contar
            if (sexo[i] == 'F' && idade[i] > 50 && nota[i] > media) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        Uni7Exe09 exe09 = new Uni7Exe09();

        //declarar os vetores
        char[] sexo = new char[qtd];
        float[] nota = new float[qtd];
        int[] idade = new int[qtd];

        //ler os valores
        for (int i = 0; i < qtd; i++) {
            System.out.println("Digite o sexo");
            sexo[i] = tec.next().charAt(0);
            System.out.println("Digite a idade");
            idade[i] = tec.nextInt();
            System.out.println("Digite a nota");
            nota[i] = tec.nextFloat();
        }
        //calcular a media das notas
        float media = exe09.calcularMedia (nota);
        //contar a quantidade de mulheres acima de 50 que deram nota acima da média
        System.out.println("Mulheres acima de 50 com nota acima da media = " +
                                exe09.contar (idade, nota, sexo, media));
      
    }
}
