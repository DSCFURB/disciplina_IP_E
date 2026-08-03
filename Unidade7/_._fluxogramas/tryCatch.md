# Try Catch

Um bloco *try* é chamado de bloco protegido porque, caso ocorra algum problema com os comandos dentro do bloco, a execução desviará para os blocos *catch* correspondentes.  

Necessitamos usar *try*, porque estamos fazendo operação de conversão, é uma maneira mais robusta de tratar possíveis erros no momento da conversão, por exemplo, não é possível converter um caractere ? por um número, porém como a entrada de dados é liberada o usuário final poderá digitar algo inadequado, resultando em erro e quebra da execução do programa por falha, com o *try* podemos evitar esta queda brusca e então tratar o erro da melhor forma.  

```java
try {
  // código que inclui comandos/invocações de métodos
  // que podem gerar uma situação de exceção.
} catch (XException ex) {
  // bloco de tratamento associado à condição de
  // exceção XException ou a qualquer uma de suas
  // subclasses, identificada aqui pelo objeto
  // com referência ex
} catch (YException ey) {
  // bloco de tratamento para a situação de exceção
  // YException ou a qualquer uma de suas subclasses
} finally {
  // bloco de código que sempre será executado após
  // o bloco try, independentemente de sua conclusão
  // ter ocorrido normalmente ou ter sido interrompida
}
```

Onde *XException* e *YException* deveriam ser substituídos pelo nome do tipo de exceção. Os blocos não podem ser separados por outros comandos — um erro de sintaxe seria detectado pelo compilador Java neste caso. Cada bloco *try* pode ser seguido por zero ou mais blocos *catch*, onde cada bloco *catch* refere-se a uma única exceção.  
O bloco *finally*, quando presente, é sempre executado. Em geral, ele inclui comandos que liberam recursos que eventualmente possam ter sido alocados durante o processamento do bloco *try* e que podem ser liberados, independentemente de a execução ter encerrado com sucesso ou ter sido interrompida por uma condição de exceção. A presença desse bloco é opcional.  

Alguns exemplos de exceções já definidas no pacote java.lang incluem:  

- *ArithmeticException*: indica situações de erros em processamento aritmético, tal como uma divisão inteira por 0. A divisão de um valor real por 0 não gera uma exceção (o resultado é o valor infinito);  
- *NumberFormatException*: indica que tentou-se a conversão de uma *string* para um formato numérico, mas seu conteúdo não representava adequadamente um número para aquele formato. É uma subclasse de *IllegalArgumentException*;  
- *IndexOutOfBounds*: indica a tentativa de acesso a um elemento de um agregado aquém ou além dos limites válidos. É a superclasse de *ArrayIndexOutOfBoundsException*, para arranjos, e de *StringIndexOutOfBounds*, para *strings*;  
- *NullPointerException*: indica que a aplicação tentou usar uma referência a um objeto que não foi ainda definida;  
- *ClassNotFoundException*: indica que a máquina virtual Java tentou carregar uma classe mas não foi possível encontrá-la durante a execução da aplicação.  

Além disso, outros pacotes especificam suas exceções, referentes às suas funcionalidades. Por exemplo, no pacote *java.io* define-se *IOException*, que indica a ocorrência de algum tipo de erro em operações de entrada e saída. É a superclasse para condições de exceção mais específicas desse pacote, tais como *EOFException* (fim de arquivo ou stream), *FileNotFoundException* (arquivo especificado não foi encontrado) e *InterruptedIOException* (operação de entrada ou saída foi interrompida).  
Uma exceção contém pelo menos uma string que a descreve, que pode ser obtida pela aplicação do método *getMessage()*, mas pode eventualmente conter outras informações. Por exemplo, *InterruptedIOException* inclui um atributo público do tipo inteiro, *bytesTransferred*, para indicar quantos bytes foram transferidos antes da interrupção da operação ocorrer. Outra informação que pode sempre ser obtida de uma exceção é a sequência de métodos no momento da exceção, obtenível a partir do método *printStackTrace()*.  
Como exceções fazem parte de uma hierarquia de classes, exceções mais genéricas (mais próximas do topo da hierarquia) englobam aquelas que são mais específicas. Assim, a forma mais genérica de um bloco *try-catch* é:  

```java
try { ... }

catch (Exception e) { ... }
```

Pois todas as exceções são derivadas de *Exception*. Se dois blocos *catch* especificam exceções em um mesmo ramo da hierarquia, a especificação do tratamento da exceção derivada deve preceder aquela da mais genérica. Veja um exemplo mais claro:  

```java
void saveNetDevices() {
  try {
    FileOutputStream fos = new FileOutputStream("NetDevices.txt");
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    oos.writeObject(mNetDevices);
    oos.close();
    fos.close();
  } catch (NullPointerException nexc) {
    JOptionPane.showMessageDialog(null, "NetDevices list is null - No devices saved", "Saving NetDevices", JOptionPane.INFORMATION_MESSAGE);
  } catch (InvalidClassException nexc) {
    JOptionPane.showMessageDialog(null, "NetDevices list is invalid - No devices saved", "Saving NetDevices", JOptionPane.INFORMATION_MESSAGE);
  } catch (NotSerializableException nexc) {
    JOptionPane.showMessageDialog(null, "NetDevices list is not serializable - No devices saved", "Saving NetDevices", JOptionPane.INFORMATION_MESSAGE);
  } catch (IOException nexc) {
    JOptionPane.showMessageDialog(null, "IO Exception saving NetDevices list - No devices saved", "Saving NetDevices", JOptionPane.INFORMATION_MESSAGE);
  }
}
```

Neste exemplo o bloco protegido pode gerar vários tipos de exceptions. Caso ocorra uma *InvalidClassException*, a execução será desviada para o segundo bloco *catch* e, após executar o seu código, sairá para o fim do método.  
A ordem em que colocamos os blocos *catch* é muito importante: deve ser da mais específica para a mais genérica. Exemplo:  

```java
try {
  comando(s);
} catch (Exception e) {
  comando(s);
} catch (FileNotFoundException f) {
  comando(s);
}
```

Supondo que ocorreu uma *FileNotFoundException* dentro do bloco tr*y*, a execução vai procurar o primeiro bloco *catch* que seja compatível com o tipo de *Exception* ocorrida. O primeiro bloco será analisado e, como *Exception* é superclasse de *FileNotFoundException*, a execução entrará no primeiro bloco *catch*. O segundo sequer será testado.  
Para que tudo funcione temos que trocar a ordem dos blocos *catch*:  

```java
try {
  comando(s);
} catch (FileNotFoundException f) {
  comando(s);
} catch (Exception e) {
  comando(s);
}
```

Assim, caso ocorra uma *FileNotFoundException* o primeiro bloco será acionado. Se ocorrer uma outra classe de *Exception*, por exemplo: *InterrupedIOException*, ele entrará no segundo bloco *catch*.  
Se você usa algum método que lança *Checked Exceptions* você deve, obrigatoriamente, tratar esta *Exception*. Ou seja, tem que haver um *catch* correspondente à *Exception* que você está lançando ou que seja superclasse desta. Veja um exemplo:  

```java
try {
  FileReader fin = new FileReader("oids.txt");
  BufferedReader br = new BufferedReader(fin);
  while ((mOID = br.readLine()) != null) {
    oidsList.add(new String(mOID));
  }
  br.close();
  fin.close();
} catch (FileNotFoundException fnf) {
  JOptionPane.showMessageDialog(null, "Extra OIDS file not found", "Loading Extra OIDs", JOptionPane.INFORMATION_MESSAGE);
}
```

O construtor da classe *FileReader* pode lançar *FileNotFoundException* caso o arquivo não exista. Logo, se utilizar esta classe, você tem que tratar esta *exception*. Por isto o comando está dentro de um bloco *try*/*catch*.  

## Bloco finally

As vezes é necessário executar um código mesmo que tenha havido uma *Exception*. É para isto que servem os blocos *finally*. Sua sintaxe é:  

```java
try {
  comando(s);
} finally {
  comando(s);
}\ou
try {
  comando(s);
} catch (ClasseDeException VarException) {
  comando(s);
} finally {
  comando(s);
}
```

Os comandos dentro de um bloco finally serão executados de qualquer maneira, mesmo que a execução tenha passado por um bloco *catch*. Ao contrário dos blocos *catch* você só pode ter um bloco finally por cada bloco *try*.

Fonte: <https://www.devmedia.com.br/blocos-try-catch/7339>
