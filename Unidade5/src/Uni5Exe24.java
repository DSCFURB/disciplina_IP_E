import java.util.Scanner;

public class Uni5Exe24 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //ler o limite diário de pesca
        System.out.println("Informe o limite de pesca (em kg)");
        double limiteDiario = teclado.nextDouble();
        //inicializar a soma dos pesos
        double somaPeso = 0;
        //variável para opção de leitura
        char opcao;
        do {
            System.out.println("Informe o peso do peixe (em g)");
            double pesoPeixe = teclado.nextDouble();
            //contabilizar o peso total
            somaPeso += pesoPeixe;
            //informar o peso pescado até o momento
            System.out.println("Pescado até o momento = (em g) " + somaPeso);
            //testar se excedeu o limite
            if (somaPeso > limiteDiario * 1000) {
                System.out.println("Excedeu o limite diário. " + 
                                    "Devolva o último peixe!");
                //parar a repetição
                break;
            }
            System.out.println("Deseja informar outro peixe? (S/N)");
            opcao = teclado.next().charAt(0); 
        } while (opcao == 'S' || opcao == 's');


    }
}
