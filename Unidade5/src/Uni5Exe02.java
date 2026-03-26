public class Uni5Exe02 {

    public static void main(String[] args) {
        //inicializar variáveis para soma
        int somaPar = 0;
        int somaImpar = 0;
        //repetir para cem números
        for (int cont = 1; cont <= 100; cont++) {
            if (cont % 2 != 0) {
                somaImpar += cont; //equivale a somaImpar = somaImpar + cont
            } else {
                somaPar += cont;
            }
        }
        System.out.println("Soma dos pares = " + somaPar);
        System.out.println("Soma dos ímpares = " + somaImpar);
    }
}
