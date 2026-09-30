import java.util.Scanner;

public class Uni5Exe15 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        //ler o nome - que é o flag
        System.out.println("Digite o nome do aluno");
        String nome = tec.next();
        //repetir até o flag "fim"
        while (!nome.equalsIgnoreCase("fim")) {
            //ler as notas do aluno
            System.out.println("Digite a nota 1");
            double nota1 = tec.nextDouble();
            System.out.println("Digite a nota 2");
            double nota2 = tec.nextDouble();
            //calcular a média
            double media = (nota1 + nota2) / 2;
            //escrever a media
            System.out.println("Media = " + media);
            //ler novamente o flag nome
            System.out.println("Digite o nome do aluno");
            nome = tec.next(); //não pode colocar o tipo de novo
        }
    }
}
