import java.util.Scanner;

public class Uni4Exe27 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //leitura dos dados
        System.out.println("Digite hora e minutos de chegada");
        int horasChegada = teclado.nextInt();
        int minutosChegada = teclado.nextInt();
        System.out.println("Digite horas e minutos de partida");
        int horasPartida = teclado.nextInt();
        int minutosPartida = teclado.nextInt();
        //calcular minutos de permanencia no estacionamento
        int minutosTotais = (horasPartida * 60 + minutosPartida) - 
                            (horasChegada * 60 + minutosChegada);
        //calcular horas e minutos de estacionamento
        int minutos = minutosTotais % 60;
        int horas = minutosTotais / 60;
        //testar quantas horas devem ser pagas
        int horasApagar = 0;
        if (horas == 00) {
            horasApagar = 1;
        } else {
            if (minutos < 30) {
                horasApagar = horas;
            } else {
                horasApagar = horas + 1;
            }
        }
        //verificar valor a pagar
        switch (horasApagar) {
            case 1 :
            case 2 : System.out.printf("Valor a pagar = %.2f\n",
                horasApagar * 5.0);
                break;
            case 3 :
            case 4 : System.out.printf("Valor a pagar = %.2f\n",
                10 + (horasApagar - 2) * 7.5);
                break;
            default :
                System.out.printf("Valor a pagar = %.2f\n", 
                25 + (horasApagar - 4 ) * 10.0);
        }
        System.out.printf("Ficou estacionado %d horas e %d minutos", 
                                    horas, minutos);




    }
}
