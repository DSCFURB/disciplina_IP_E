import java.util.Scanner;

public class Uni4Exe07 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        double aPagar;
        //ler a entrada
        System.out.println("Digite o peso da carta");
        int peso = tec.nextInt();
        //testar o peso da carta
        if (peso <= 50) {
           aPagar = 0.45;
        } else {
            //verificar quantas vezes a carta excedeu
            aPagar = 0.45 + (peso - 50) /20 * 0.45;
            //verificar se tem resto de excedente
            if ((peso - 50) % 20 > 0) {
                aPagar = aPagar + 0.45;
            }
        }
        System.out.printf("Valor a pagar = %5.2f\n", aPagar);
        //%f é para escrever número com casa decimal. 
        //O 5 está representando o número total de casas
        //O 2 está respresentando as casas depois da vírgula
        //\n é para pular linha


    }
}
