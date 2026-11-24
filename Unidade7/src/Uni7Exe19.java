import java.util.Scanner;

public class Uni7Exe19 {

    private static Scanner tec = new Scanner (System.in);

    /**
     * Método que lê as temperaturas e armazenas nos respectivos vetores
     * @param miniminas
     * @param maximas
     */
    private void lerTemperaturas (float[] minimas, float[] maximas) {
        //percorrer o vetor
        for (int i = 0; i < minimas.length; i++) {
            System.out.println("Digita a mínima do dia " + i);
            minimas[i] = tec.nextFloat();
            System.out.println("Digite a máxima do dia " + i);
            maximas[i] = tec.nextFloat();
        }
    }

    /**
     *  Método que calculas as amplitudes térmicas de cada dia
     * @param minimas
     * @param maximas
     * @return
     */
    private float[] calcularAmplitudes (float[] minimas, float[] maximas) {
        //criar o vetor
        float[] amplitudes = new float[minimas.length];
        //percorrer o vetor
        for (int i = 0; i < minimas.length; i++) {
            amplitudes[i] = maximas[i] - minimas[i];
        }
        return amplitudes;

    }

    /**
     * Calcular a quantidade de dias que a amplitude de um dia foi maior que do outro
     * @param amplitudes
     * @return
     */
    private int calcularDias(float[] amplitudes) {
        //variável para contar a quantidade de dias
        int quantidade = 0;
        //percorrer o vetor a partir da segunda posição
        for (int i = 1; i < amplitudes.length; i++) {
            //comparar a amplitude do dia atual com do dia anterior
            if (amplitudes[i] > amplitudes[i - 1]) {
                //contar o dia
                quantidade++;
            }
        }
        return quantidade;
    }


    private int diaMaiorAmplitude (float[] amplitudes) {
        //considerar que o primeiro dia é o maior
        int diaMaior = 0;
        //percorrer o vetor
        for (int i = 1; i < amplitudes.length; i++) {
            //se o valor da amplitude do dia atual é maior que o dia maior
            if (amplitudes[i] > amplitudes[diaMaior]) {
                //guardar a posição do maior
                diaMaior = i;
            } 
        }
        return diaMaior;
    } 


    public static void main(String[] args) {
        Uni7Exe19 exe19 = new Uni7Exe19();

        //ler os dias monitorados
        System.out.println("Informe os dias monitorados");
        int dias = tec.nextInt();
        //definir os vetores
        float[] minimas = new float[dias];
        float[] maximas = new float[dias];
        float[] amplitudes = new float[dias];
        //ler temperaturas e guardar nos vetores
        exe19.lerTemperaturas(minimas, maximas);
        //calcular as amplitudes
        amplitudes = exe19.calcularAmplitudes (minimas, maximas);
        //informar quantidade de dias com ampitude maior que o anterior
        System.out.println("Dias com amplitude térmica maior que a anterior = " +
                            exe19.calcularDias(amplitudes));
        //informar o dia com maior amplitude térmica
        System.out.println("Dia com maior amplitude térmica = " +
                            exe19.diaMaiorAmplitude(amplitudes));       
    }

}
