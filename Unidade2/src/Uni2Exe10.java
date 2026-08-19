import java.util.Scanner;

public class Uni2Exe10 {

    public static void main(String[] args) {
        //declarar as variáveis
        int duracao, horas, minutos, segundos;

        //definir o teclado
        Scanner tec = new Scanner(System.in);
        //ler a duração
        System.out.println("Digite a duração (em segundos)");
        duracao = tec.nextInt();
        //calcular duração em horas, minutos e segundos
        horas = duracao / 3600;
        minutos = duracao % 3600 / 60;
        segundos = duracao % 3600 % 60;
        //escrever resultado
        System.out.println("Valor em horas, minutos e segundos");
        System.out.println(horas + ":" + minutos + "." + segundos);


    }

}
