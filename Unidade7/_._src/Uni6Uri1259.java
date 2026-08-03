import java.util.Scanner;

public class Uni6Uri1259 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		final int qtd = teclado.nextInt();
		int vetEntrada[] = new int[10];
		for (int i = 0; i < vetEntrada.length; i++) {
			vetEntrada[i] = teclado.nextInt();
		}

		int vetPar[] = new int[10];
		int iPar = 0;
		int vetImpar[] = new int[10];
		int iImpar = 0;
		for (int i = 0; i < vetEntrada.length; i++) {
			if ((vetEntrada[i] % 2) == 0) {
				vetPar[iPar] = vetEntrada[i];
				iPar += 1;
			} else {
				vetImpar[iImpar] = vetEntrada[i];
				iImpar += 1;
			}
		}
		int temp;
		int ind = 0;
		while (ind < iPar - 1) {
			if (vetPar[ind] > vetPar[ind + 1]) {
				temp = vetPar[ind];
				vetPar[ind] = vetPar[ind + 1];
				vetPar[ind + 1] = temp;
				ind = 0;
			} else {
				ind++;
			}
		}
		ind = 0;
		while (ind < iImpar - 1) {
			if (vetImpar[ind] > vetImpar[ind + 1]) {
				temp = vetImpar[ind];
				vetImpar[ind] = vetImpar[ind + 1];
				vetImpar[ind + 1] = temp;
				ind = 0;
			} else {
				ind++;
			}
		}
		for (int i = 0; i < iPar; i++) {
			System.out.println(vetPar[i]);
		}
		for (int i = iImpar - 1; i >= 0; i--) {
			System.out.println(vetImpar[i]);
		}
		teclado.close();
	}
}
