import java.util.Scanner;

public class Prova02 {
    /**
     * Função que conta quantos carcateres tem entre o intervalo de inicio e fim
     * @param codigo
     * @param inicio
     * @param fim
     * @return
     */
    private int contarCaracter (String codigo, char inicio, char fim) {
        //inicializar para contar os caracteres
        int quantidade = 0;
        //percorrer o string
        for (int i = 0; i < codigo.length(); i++) {
            //ver se o codigo na posição atual está entre inicio e fim
            if (codigo.charAt(i) >= inicio && codigo.charAt(i) <= fim) {
                //contar
                quantidade++;
            }
        }
        return quantidade;
    }

    /**
     * Método que retorna se o código é valido
     * O código é válido quando tem mais do que duas letras e dois números
     * @param codigo
     * @return true ou false
     */
    private boolean codigoValido (String codigo) {
        //retornar se tem mais do que duas letras e dois números
        return (contarCaracter(codigo, 'A', 'Z') >= 2 &&
                contarCaracter(codigo, '0', '9') >= 2);
    }


    private String codigoInvertido (String codigo)  {
        //variável que vai receber o código invertido
        String invertido = "";
        //percorre o código de trás para frente
        for (int i = codigo.length() - 1; i >= 0; i--) {
            //pegar o caracter atual do código
            char caracter = codigo.charAt(i);
            //se for número
            if (caracter >= '0' && caracter <= '8') {
                caracter++; //passa para o próximo caracter
            } else {
                if (caracter == '9') {
                    caracter = '0';
                }
            }
            //colocar o caracter no codigo invertido
            invertido+= caracter;
        }
        return invertido;
    }

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        Prova02 prova02 = new Prova02();
        // inicializar as quantidades
        int qtdCodigos = 0;
        int qtdValidos = 0;
        // ler o codigo até o usuário digitar ""
        System.out.println("Digite o código");
        String codigo = tec.nextLine();
        while (!codigo.isEmpty()) {
            System.out.println("Quantidade de letras = " + 
                                   prova02.contarCaracter (codigo, 'A', 'Z'));
            System.out.println("Código invertido = " + 
                                    prova02.codigoInvertido (codigo));
            if (prova02.codigoValido(codigo)) {
                System.out.println("Código válido");
                qtdValidos++;
            } else {
                System.out.println("Código Inválido");
            }
            qtdCodigos++;
            // ler o codigo até o usuário digitar ""
            System.out.println("Digite o código");
            codigo = tec.nextLine();
        }
        System.out.println("Codigos analisados = " + qtdCodigos);
        if (qtdCodigos > 0) {
            System.out.println("% de códigos validos = " +
                                    (qtdValidos * 100) / qtdCodigos);
        }
    }

}
