import java.util.Scanner;

public class Simulado {

public static void main(String[] args) {
    
    Scanner teclado = new Scanner (System.in);
    //ler a quantidade de situações
    System.out.println("Digite a quantidade de situações");
    int n = teclado.nextInt();

    int somarTempo = 0; //soma a quantidade de tempo da porta aberta
    int maiorTempoAberta = 0; //guarda o maior tempo da porta aberta
    int vezesAberta = 0; //conta quantas vezes a porta foi aberta
    int situacao = 0; //define a situação atual da porta - começa fechada

    //repetir para n situações
    for (int cont = 1; cont <= n; cont++) {
        int antes = situacao; //guardar a situação anterior da porta
        System.out.println("Digite a situação atual da porta");
        situacao = teclado.nextInt(); //ler a situação atual da porta
        //verificar se a porta foi aberta
        if (situacao == 1 && antes == 0) {
            vezesAberta++;
        }
        //verificar se a porta está aberta para contar o tempo
        if (situacao == 1) {
            somarTempo+=5; // aumentar 5 segundos no tempo
            //testar se supera o maior tempo
            if (somarTempo > maiorTempoAberta) {
                maiorTempoAberta = somarTempo;
            }
        } else {
            somarTempo = 0; //voltar o tempo para zero - porta foi fechada
        }
    }
    System.out.println("Porta foi aberta " + vezesAberta);
    System.out.println("Maior periodo aberta " + maiorTempoAberta);

}
}
