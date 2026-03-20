import java.util.Scanner;

public class Uni4Exe11 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite os anos de nascimento dos três irmãos: ");
    int anoUm = teclado.nextInt();
    int anoDois = teclado.nextInt();
    int anoTres = teclado.nextInt();

    // if ((anoUm == anoDois) && (anoUm == anoTres) && (anoDois == anoTres)) { //otimização
    // fluxogramas/Uni4Exe11.drawio.svg
    if ((anoUm == anoDois) && (anoUm == anoTres)) {
      System.out.println("TRIGÊMEOS");
    } else {
      if (anoUm == anoDois || anoUm == anoTres || anoDois == anoTres) {
        System.out.println("GÊMEOS");
      } else {
        System.out.println("APENAS IRMÃOS");
      }
    }

    teclado.close();
  }
}

/* 
TRIGÊMEOS ___
idadeIrmao1 = 23
idadeIrmao2 = 23
idadeIrmao3 = 23

GÊMEOS ____
idadeIrmao1 = 10  ->
idadeIrmao2 = 45
idadeIrmao3 = 10  -> 

idadeIrmao1 = 10  -> 
idadeIrmao2 = 10  ->
idadeIrmao3 = 45

idadeIrmao1 = 45   
idadeIrmao2 = 10  ->
idadeIrmao3 = 10  ->

APENAS IRMÃOS ___
idadeIrmao1 = 23
idadeIrmao2 = 12
idadeIrmao3 =  5
*/