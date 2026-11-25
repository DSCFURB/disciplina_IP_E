import java.util.Scanner;

public class Uni7Exe20 {

    private static Scanner tec = new Scanner(System.in);

    private int lerPontos (int[] pontosEq, int[] pontosAd, int[] setsEq, int[] setsAd) {
        //contar as partidas
        int partidas = 0;
        int contSetsEq = 0;  //contar os sets vencidos pela equipe
        int contSetsAd = 0;  //contar os sets vencidos pelo adversário
        //percorrer o vetor
        for (int i = 0; i < pontosAd.length; i++) {
            System.out.println("Digite os pontos da equipe");
            pontosEq[i] = tec.nextInt();
            System.out.println("Digite os pontos do adversário ");
            pontosAd[i] = tec.nextInt();
            //verificar quem ganhou o set e contar os pontos
            if (pontosEq[i] > pontosAd[i]) {
                contSetsEq++;
            } else {
                contSetsAd++;
            }
            //verificar se alguém chegou a três pontos
            if (contSetsEq == 3 || contSetsAd == 3) {
                //guardar os sets ganhos por cada equipe
                setsEq[partidas] = contSetsEq;
                setsAd[partidas] = contSetsAd;
                //contar a partida
                partidas++;
                //zerar os sets
                contSetsEq = 0;
                contSetsAd = 0;
            }
        }
        return partidas;
    }

    private int informarPartidasVencidas (int[] setsEq, int partidas) {
        //contar as vencidas
        int partidasVencidas = 0;
        //percorrer as partidas 
        for (int i = 0; i < partidas; i++) {
            //ver se ganhou três sets
            if (setsEq[i] == 3) {
                partidasVencidas++;
            }
        }
        return partidasVencidas;
    } 

    private String resultados (int[] setsEq, int[] setsAd, int partidas) {
        //inicializar o texto para saída
        String texto = "";
        //percorrer os vetores
        for (int i = 0; i < partidas; i++) {
            //colocar os resultados nos textos
            texto += setsEq[i] + "x" + setsAd[i] + " ";
        }
        return texto;
    }

    private int verMaiorPontuacao (int[] pontosEq, int[] pontosAd) {
        //contar a partida
        int partidaMaior = 0;
        int partidas = 0;
        //variável para a maior pontuação
        int maior = 0;
        //variável para somar os pontos
        int soma = 0;
        int contSetsEq = 0;
        int contSetsAd = 0;
        //percorrer o vetor de pontos
        for (int i = 0; i < pontosEq.length; i++) {
            //somar os pontos do set
            soma += pontosEq[i];
            //ver o vencedor do set
            if (pontosEq[i] > pontosAd[i]) {
                contSetsEq++;
            } else {
                contSetsAd++;
            }
            //se o jogo acabou
            if (contSetsEq == 3 || contSetsAd == 3) {
                //se a soma é a maior
                if (soma > maior) {
                    maior = soma; //guardar maior soma
                    partidaMaior = partidas;
                }
                //reiniciar a soma
                soma = 0;
                //contar a partida
                partidas++;
                //reiniciar os sets
                contSetsAd = 0;
                contSetsEq = 0;
            }
        }
        return partidaMaior+1;
    }

    public static void main(String[] args) {
        Uni7Exe20 exe20 = new Uni7Exe20();
        //ler os sets disputados
        System.out.println("informe o número de sets disputados");
        int sets = tec.nextInt();
        //criar os vetores dos pontos
        int[] pontosEq = new int[sets];
        int[] pontosAd = new int[sets];
        int[] setsEq = new int[sets / 3]; //pior caso: todas as partidas terminarem 3x0
        int[] setsAd = new int[sets / 3];
        //ler os pontos
        int partidas = exe20.lerPontos (pontosEq, pontosAd, setsEq, setsAd);
        System.out.println("Partidas disputadas = " + partidas);    
        int partidasVencidas = exe20.informarPartidasVencidas (setsEq, partidas); 
        System.out.println("Partidas vencidas = " + partidasVencidas);
        System.out.println(exe20.resultados(setsEq, setsAd, partidas));
        System.out.println("Partida com mais pontos marcados = " +
                            exe20.verMaiorPontuacao(pontosEq, pontosAd));
    }
}
