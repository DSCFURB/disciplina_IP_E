import java.util.Scanner;

public class Uni6Exe09 {

    /**
     * Calcula o fatorial de um número
     * @param numero
     * @return long
     */
    private long fatorial (long numero) {
        //inicializar variável para multiplicação
        long produto = 1;
        //repetir para numero até 1
        for (long i = numero; i > 1; i--) {
            //multiplicar o i e guardar no produto 
            produto*= i; //equivale a produto = produto * i
        }
        return produto;
    }

    /**
     * Calcula a combinação de n elemetos tomados p a p
     * @param long n, p
     * @return long
     */
    private long combinacao (long n, long p) {
        return fatorial (n) / (fatorial(p) * fatorial (n-p));
    }

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        //criar o objeto da classe para poder usar os métodos
        Uni6Exe09 exe09 = new Uni6Exe09();
        //ler as entradas
        System.out.println("Digite o n");
        long n = tec.nextLong();
        System.out.println("Digite o p");
        long p = tec.nextLong();
        System.out.println("Combinação = " + exe09.combinacao(n,p));
    }

}
