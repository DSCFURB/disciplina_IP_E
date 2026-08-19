import java.util.Scanner;

public class Uni4Exe01 {

    public static void main(String[] args) {
        //variáveis
        float horasTrabalhadas, valorHora, horaExtra, salario;

        //definir a leitura pelo teclado
        Scanner tec = new Scanner(System.in);
        //ler as variáveis
        System.out.println("Informe as horas trabalhadas");
        horasTrabalhadas = tec.nextFloat();
        System.out.println("Valor da hora");
        valorHora = tec.nextFloat();
        //inicializar a hora extra
        horaExtra = 0;
        //condição de hora extra
        if (horasTrabalhadas > 160) {
            horaExtra = horasTrabalhadas - 160;
        }
        //calcular o salario
        salario = (horasTrabalhadas - horaExtra) * valorHora +
                  horaExtra * valorHora * 1.5f;
        //escrever salario
        System.out.printf ("Salario - R$ %8.2f", salario);

    }

}
