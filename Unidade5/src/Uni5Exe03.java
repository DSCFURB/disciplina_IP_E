public class Uni5Exe03 {

    public static void main(String[] args) {
        
        //inicializar uma variável para a soma
        float soma = 0;

        //repetir para 100 termos
        for (int i = 1; i <= 100; i++) {
            //somar o termo - o float está forçando a divisão a ter casas decimais
            soma += (float) 1 / i;
        }

        //escrever a soma
        System.out.println("Soma = " + soma);
    }
}
