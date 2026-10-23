import java.util.Scanner;

public class Uni6Exe10 {

    private int hexaParaDec (String hexa) {
        //variável para somar os caracteres
        int soma = 0;
        int numero = 0;
        for (int i = 0; i < hexa.length(); i++) {
            if (hexa.charAt(i) >= '0' && hexa.charAt(i) <= '9') {
                numero = hexa.charAt(i) - '0';
            } else {
                numero = hexa.charAt(i) - 'A' + 10;
            }
            //calcular a potencia
            soma += numero * Math.pow(16, hexa.length()-i-1);
        }
        return soma;       
    }

    private String decParaHexa (int decimal) {
        //inicializar o string vazio para o hexadecimal
        String hexa = "";
        while (decimal > 0) {
            //calcular o resto para saber a qual caracter equivale
            int resto = decimal % 16;
            //ver a qual caracter corresponde o decimal
            switch (resto) {
                case 10: hexa = 'A' + hexa; break;
                case 11: hexa = 'B' + hexa; break;
                case 12: hexa = 'C' + hexa; break;
                case 13: hexa = 'D' + hexa; break;
                case 14: hexa = 'E' + hexa; break;
                case 15: hexa = 'F' + hexa; break;
                default:
                    hexa = resto + hexa;
                    break;
            }
            //pegar a divisão do decimal por 16
            decimal/=16;
        }
        return hexa;
    }

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        Uni6Exe10 exe10 = new Uni6Exe10(); //construtor da classe
        //declarar as variáveis
        String hexa;
        int dec, opcao;
        //repetir o menu
        do {
            System.out.println("ESCOLHA A CONVERSÃO");
            System.out.println("1 - Hexa para decimal");
            System.out.println("2 - Decimal para hexa");
            System.out.println("3 - Hexa para binário");
            System.out.println("4 - Binário para hexa");
            System.out.println("5 - Binário para decimal");
            System.out.println("6 - Decimal para binário");
            System.out.println("0 - Sair");
            opcao = tec.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor em hexa");
                    hexa = tec.next();
                    dec = exe10.hexaParaDec (hexa);
                    System.out.println("Decimal = " + dec);
                    break;
                case 2 :
                    System.out.println("Digite um decimal");
                    dec = tec.nextInt();
                    hexa = exe10.decParaHexa (dec);
                    System.out.println("Hexadecimal = " + hexa);
                default:
                    break;
            }

        } while (opcao != 0);

    }

  
}
