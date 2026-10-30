import java.util.Scanner;

public class Uni6Exe07 {

    private boolean parentesesOk (String expressao) {
        //variável para contar os parenteses
        int contarParenteses = 0;
        //percorrer a expressao
        for (int i = 0; i < expressao.length(); i++) {
            //se abre parenteses, soma 1 
            if (expressao.charAt(i) == '(') {
                contarParenteses++;
            } else {
                //se fecha parenteses diminui 1
                if (expressao.charAt(i) == ')') {
                    contarParenteses--;
                    //ver se ficou negativo, está errado
                    if (contarParenteses < 0) {
                        return false;
                    }
                }
            }
        }
        if (contarParenteses == 0) {
            return true;
        } else {
            return false;
        }

    }

    private int contarMultDiv (String expressao) {
        //variável para contar a quantidade de multiplicações e divisões
        int quantidade = 0;
        //percorrer a expressão
        for (int i = 0; i < expressao.length(); i++) {
            //testar se * ou /
            if (expressao.charAt(i) == '*' || expressao.charAt(i) == '/') {
                quantidade++;
            }
        }
        return quantidade;
    }

    private int primeiroOperador (String expressao) {
        //percorrer a expressao
        for (int i = 0; i < expressao.length(); i++) {
            //verificar se é um operador
            switch (expressao.charAt(i)) {
                case '+' :
                    case '-':
                        case '*' :
                            case '/' :
                                case '%' : return i; //retornar a posição
            }
        }
        return -1; //caso não encontre nenhum operador
    }

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        Uni6Exe07 exe07 = new Uni6Exe07();

        System.out.println("Digite a expressao");
        String expressao = tec.nextLine();
        //repetir até digitar a expressão vazia
        while (!expressao.equalsIgnoreCase("")) {
            //testar se está correta quanto aos parênteses
            if (exe07.parentesesOk(expressao)) {
                System.out.println("Os parênteses estão corretos");
            } else {
                System.out.println("Os parênteses estão incorretos");
            }
            //verificar a quantidade de multiplicações e divisões
            System.out.println("A expressao tem " + exe07.contarMultDiv(expressao) + 
                                " divisões e multiplicações");
            //verificar posição do primeiro operador
            int posicao = exe07.primeiroOperador (expressao);
            if (posicao == -1) {
                System.out.println("Não há operadores");
            } else {
                System.out.println("A posição do primeiro operador é " + posicao);
            }
             System.out.println("Digite a expressao");
             expressao = tec.nextLine();
        }
    }

}
