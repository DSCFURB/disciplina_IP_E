import java.util.*;

public class Prova01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int idade, anos, meses, experiencia;
        char formação;
        System.out.println("Digite a idade");
        idade = input.nextInt();
        System.out.println("Digite os anos de experiência");
        anos = input.nextInt();
        System.out.println("Digite os meses de experiência");
        meses = input.nextInt();
        System.out.println("Digite a formação (S/N)");
        formação = Character.toUpperCase(input.next().charAt(0));
        if (idade >= 16 && idade <= 60 && anos >= 0 && meses >= 0 && meses <= 11 && (formação == 'S' || formação == 'N')) {
            experiencia = anos * 12 + meses;
            if (idade >= 21 && idade <= 30 && experiencia >= 18 && formação == 'S') {
                System.out.println("APROVADO PARA ENTREVISTA");
            } else {
                if (idade >= 31 && idade <= 40 && experiencia >= 60 && formação == 'S') {
                    System.out.println("APROVADO PARA ENTREVISTA");
                } else {
                    if (idade >= 40 && experiencia >= 120) {
                        System.out.println("LISTA DE ESPERA");
                    } else {
                        if (idade < 21 && experiencia >= 1 && formação == 'S') {
                            System.out.println("LISTA DE ESPERA");
                        } else {
                            System.out.println("NÂO APROVADO PARA ENTREVISTA");
                        }
                    }
                }
            }
        } else {
            System.out.println("DADOS de ENTRADA INVÁLIDOS");
        }
    }
}
