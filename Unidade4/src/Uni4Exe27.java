import java.util.Scanner;

public class Uni4Exe27 {

    public static void main(String[] args) {
        Scanner tec = new Scanner (System.in);

        //ler os horários
        System.out.println("Digite a hora de entrada");
        int horaInicio = tec.nextInt();
        System.out.println("Digite os minutos de entrada");
        int minutosInicio = tec.nextInt();
        System.out.println("Digite a hora de saída");
        int horaFim = tec.nextInt();
        System.out.println("Digite os minutos da saída");
        int minutosFim = tec.nextInt();

        //converter para o tempo total em minutos
        int minutosTotalInicio = horaInicio* 60 + minutosInicio;
        int minutosTotalFim = horaFim * 60 + minutosFim;
        double aCobrar = 0;
        //testar se o horário e válido
        if (minutosInicio >= 0 && minutosInicio <= 59 &&
            minutosFim >= 0 && minutosFim <= 59 &&
            horaInicio >= 0 && horaInicio <= 23 &&
            horaFim >= 0 && horaFim <= 23 &&
            minutosTotalFim > minutosTotalInicio) {
                //calcular o tempo total em minutos 
                int tempoMinutos = minutosTotalFim - minutosTotalInicio;
                if (tempoMinutos <= 89) {
                    aCobrar = 5;
                } else {
                    if (tempoMinutos >= 90 && tempoMinutos <= 149) {
                        aCobrar = 10;
                    } else {
                        if (tempoMinutos >= 150 && tempoMinutos <= 209) {
                            aCobrar = 17.5;
                        } else {
                            if (tempoMinutos >= 210 && tempoMinutos <= 269) {
                                aCobrar = 25;
                            } else {
                                aCobrar = 25 + (tempoMinutos / 60 - 4) * 10;
                                if (tempoMinutos % 60 >= 30) {
                                    aCobrar = aCobrar + 10;
                                }
                            }
                        }
                    }
                }
                System.out.println("A cobrar = " + aCobrar);
                System.out.printf ("Tempo Total: %d:%d\n", tempoMinutos/60, tempoMinutos%60);
        } else {
            System.out.println("Dados incorretos");
        } 
        



        
    }
}
