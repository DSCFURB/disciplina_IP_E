import java.util.Scanner;

public class Uni5Exe17 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        //declarar e inicializar as variáveis
        int inscricao, inscricaoMaisAlto = 0, inscricaoMaisBaixo = 0;
        int contaAtletas = 0; //conta a quantidade de atletas informados
        double altura;
        double maisBaixo = Double.MAX_VALUE; //inicia com o maior double possível
        double maisAlto = Double.MIN_VALUE; //inicia com o menor double possível
        double somaAlturas = 0; //soma a altura de todos os atletas
        //ler a inscrição do primeiro atleta
        System.out.println("Informe a inscrição");
        inscricao = tec.nextInt();
        //repetir até inscrição igual a zero
        while (inscricao != 0) {
            //ler a altura
            System.out.println("Digite a altura");
            altura = tec.nextDouble();
            //contar a quantidade de atletas
            contaAtletas++;
            //somar a altura dos atletas
            somaAlturas += altura;
            //ver se é o atleta mais baixo
            if (altura < maisBaixo) {
                //guardar a inscricao e a altura
                maisBaixo = altura;
                inscricaoMaisBaixo = inscricao;
            }
            //ver se é o atleta mais alto
            if (altura > maisAlto) {
                //guardar a inscrição e a altura
                maisAlto = altura;
                inscricaoMaisAlto = inscricao;
            }
            //ler a inscrição do próximo atleta
            System.out.println("Digite a inscrição");
            inscricao = tec.nextInt();
        }
        //escrever os resultados
        System.out.printf("O atleta mais baixo tem %.2f e o seu número de inscrição é %d\n",
            maisBaixo, inscricaoMaisBaixo);
        System.out.printf("O atleta mais alto tem %.2f e o seu número de inscrição é %d\n",
            maisAlto, inscricaoMaisAlto);
        System.out.printf("A altura média do grupo de atletas é: %.2f", somaAlturas/contaAtletas);
       
    }

}
