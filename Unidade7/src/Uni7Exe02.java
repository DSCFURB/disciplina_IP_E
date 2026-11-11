import java.util.Scanner;

public class Uni7Exe02 {

    private Scanner tec = new Scanner(System.in);
    
    /**
     * Método que le os valores do teclado e armazena em um vetor
     * @param x - por ser vetor, no java qualquer alteração do vetor no método
     * reflete em quem o chama
     */
    private void lerVetor (float[] x) {
        for (int i = 0; i < 12; i++) {
            System.out.println("Digite o valor da posição " + i);
            x[i] = tec.nextFloat();
        }
    }
    
    /**
     * Método para calcular a média dos valores do vetor
     * @param x - vetor
     * @return - média
     */
    private float calcularMedia (float[] x) {
        //inicializar a soma
        float soma = 0;
        //percorrer o vetor
        for (int i = 0; i < 12; i++) {
            //soma o valor da posição i
            soma += x[i];
        }
        //retornar a média
        return soma / 12;
    }

    private void maioresQueMedia (float[] x, float media) {
        System.out.println("VALORES DO VETOR MAIORES QUE A MÉDIA");
        //percorrer o vetor
        for (int i = 0; i < 12; i++) {
            //testar se o valor da posição i é maior que a média
            if (x[i] > media) {
                System.out.println(x[i]);
            }
        }
    }

    public static void main(String[] args) {
        Uni7Exe02 exe02 = new Uni7Exe02(); //para usar os métodos sem static
        //declarar o vetor
        float[] x = new float[12];
        //ler os valores e armazená-los no vetor
        exe02.lerVetor (x);
        //calcular a media dos valores do vetor
        float media = exe02.calcularMedia (x);
        //informar os valores maiores que a média
        exe02.maioresQueMedia (x, media);
    }

}
