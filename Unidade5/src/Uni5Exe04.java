public class Uni5Exe04 {

    public static void main(String[] args) {
        
        double soma = 0;
        //inicializar o numerador
        double numerador = 1;
        //repetir 20 vezes
        for (double i = 1; i <= 20; i++) {
            //atualizar o numerador
            numerador += 2;
            //calcular a soma
            soma += numerador / (i * (i + 1));
        }
        System.out.println("Soma = " + soma);
    }

}
