/*
Entradas: raio e PI
Saida: área

Inicio
    ler o raio
    calcular a área (PI * raio * raio)
    escrever a área
Fim
*/

import java.util.Scanner;

public class Uni02Exe03 {

    public static void main(String[] args) {
        // Leitura
        Scanner teclado = new Scanner (System.in);

        System.out.println("Informe o raio");
        double raio = teclado.nextDouble();

        //calcular a area
        double area = Math.PI * raio * raio; //ou Math.pow (raio, 2)

        //escrever área
        System.out.println("Area = " + area);

        //fechar o teclado
        teclado.close();

    }

}
