import java.util.Scanner;

public class Uni4Exe09 {
	public static void main(String[] args) {
		int valor_1, valor_2;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o primeiro numero: ");
		valor_1 = teclado.nextInt();
		System.out.println("Digite o segundo valor: ");
		valor_2 = teclado.nextInt();
		if (valor_1 % valor_2 == 0 || valor_2 % valor_1 == 0) {
			System.out.println("São multiplos");
		} else {
			System.out.println("Nao são multiplos");
		}
		teclado.close();
	}
}
