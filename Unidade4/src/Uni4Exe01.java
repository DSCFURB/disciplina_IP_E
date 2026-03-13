import java.util.Scanner;

public class Uni4Exe01 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        //leitura dos dados
        System.out.println ("Digite o número de horas trabalhadas");
        double horasTrabalhadas = teclado.nextDouble();
        System.out.println ("Valor pago por hora");
        double valorPorHora = teclado.nextDouble();
        //definir o salario total
        double salarioTotal = 0.0;

        //ver se tem que pagar hora extra
        if (horasTrabalhadas > 160) {
            //calcular hora extra
            double horaExtra = (horasTrabalhadas - 160) *
                               valorPorHora * 1.5;
            //calcular salário com hora extra
            salarioTotal = 160 * valorPorHora + 
                                  horaExtra;
        } else {
            //calculat salário sem hora extra
            salarioTotal = horasTrabalhadas * valorPorHora;
        }
        //escrever o salário
        System.out.println ("Salário Total = " +
                            salarioTotal);  
        teclado.close();
    }

}
