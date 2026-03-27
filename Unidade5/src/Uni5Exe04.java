public class Uni5Exe04 {

    public static void main(String[] args) {

        float soma = 0;

        for (float cont = 1; cont <= 20; cont++) {
            soma += (cont * 2 + 1) / (cont * (cont + 1));
        } 
        
        System.out.printf("Soma = %.8f", soma);
    }
}
