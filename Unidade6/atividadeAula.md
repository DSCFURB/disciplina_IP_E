# Lista de Exercícios - Unidade 6 - Subprogramas

Implemente  os exercícios a seguir utilizando o VSCode. Faça a análise do problema identificando as entradas, saídas e testes. Utilize  somente  os  comandos  que  você  aprendeu  na  disciplina  até  o  momento  para  a resolução das atividades.

Utilize o nome do arquivo Java e da Classe de acordo com o indicado no inicio de cada enunciado.

----------

**Uni6Exe01.java** Dada uma letra minúscula e uma frase em letras minúsculas faça um programa que, com base em um subprograma, informe quantas vezes a letra aparece na frase.


**Uni6Exe02.java** Dada uma frase e uma palavra faça um programa que, com base em um subprograma, informe quantas vezes a palavra aparece na frase. Desconsidere o uso de pontuação na frase.

   
**Uni6Exe03.java** Dada uma frase, onde cada palavra é separada por no mínimo um espaço em branco, faça um programa que, com base em um subprograma, imprima a frase e cada palavra da frase juntamente com o número de caracteres da palavra (veja exemplo a seguir):

ISTO É UM TESTE

ISTO	4

É	1

UM	2

TESTE	5


**Uni6Exe04.java** Dado um texto qualquer faça um programa que, através de subprogramas:

a)	forneça o número de vogais do texto.        

b)	informe o valor numérico que aparece no início do texto. Informe 0 (zero) se no início não há valor numérico (ver exemplos abaixo):

"27C1"	- valor numérico = 27

"134"	- valor numérico = 134

"XYZ"	- valor numérico = 0

"B21"	- valor numérico = 0

c)	forneça a posição de início de uma palavra dentro do texto. 

**Uni6Exe05.java** Um palíndromo é uma sequencia de caracteres que tem o mesmo signiﬁcado quando lida da esquerda para a direita ou da direita para a esquerda, isto é, de trás para frente. Exemplos de palíndromos são: radar, reviver e arara. Escreva um programa que solicite ao usuário diversas sequencias de caracteres. Para cada sequência de caracteres fornecida, o programa deverá informar se tal sequência é ou não um palíndromo. O programa deve permanecer solicitando sequencias de caracteres enquanto a sequencia contiver caracteres, isto é, a partir do momento que o usuário informar uma string vazia, o programa deverá interromper este procedimento e exibir a quantidade de palavras informadas que eram palíndromos. A verificação se a palavra é ou não um palíndromo deve ser feita em um subprograma.

**Uni6Exe06.java** Suponha que uma pessoa que escreva uma mensagem não quer que suas mensagens sejam entendidas. Para tanto ela irá criptografar as mensagens usando a seguinte tabela de conversão:
A	é substituído por	Z
B	por	Y
C	por	X
.	.	.
Z	por	A
1	por	9
.	.	.
9	por	1
Qualquer outro caracter continua o mesmo. Faça um programa que leia N mensagens e imprima-a juntamente com a mensagem codificada. A mensagem deve ser codificada dentro de um subprograma.

**Uni6Exe07.java** Faça um programa que leia várias expressões aritméticas e, com base em subprogramas, escreva:

a)	informe se cada expressão aritmética está correta sintaticamente em relação ao número de parênteses utilizados;

b)	para cada expressão aritmética informe o número de divisões e multiplicações utilizadas;

c)	informe a posição do primeiro operador aritmético de cada expressão.

**Uni6Exe08.java** Uma técnica simples de compressão consiste em substituir sequências de caracteres iguais e consecutivos pelo caractere seguido da quantidade de repetições. Por exemplo, a sequência AAAABCCCCC pode ser representada como A4B1C5.

Faça um programa que leia um texto e utilize subprogramas para:

a) comprimir o texto, substituindo sequências de caracteres repetidos por suas representações compactadas;

b) descomprimir o resultado, reconstruindo o texto original;

c) informar a quantidade de caracteres do texto original e do texto comprimido e calcular a redução percentual obtida.

Considere, para este exercício, que o texto de entrada contém apenas letras maiúsculas e que a representação comprimida utiliza um número após cada caractere, inclusive quando ele aparece uma única vez.

O programa deverá demonstrar que a descompressão recupera exatamente o texto original.

**Uni6Exe09.java** Faça um programa para calcular a combinação de n elementos tomados p a p. A combinação e o fatorial devem ser calculados em subprogramas.
Combinação = n! / ( p! * (n-p)!) ).

**Uni6Exe10.java** Faça um programa que, com base em subprogramas, transforme:
a)	um valor hexadecimal em decimal e vice-versa;
b)	um valor hexadecimal em binário e vice-versa;
c)	um valor binário em decimal e vice-versa.

**Uni6Exe11.java** Faça um programa que, com base em subprogramas, calcule e informe:
a)	o Máximo Divisor Comum entre dois números;
b)	o Mínimo Múltiplo Comum entre dois números.

**Uni6Exe12.java** O Cadastro de Pessoas Físicas (CPF) é composto por 11 algarismos. Os dois últimos são chamados de dígitos verificadores, pois são calculados a partir dos nove primeiros algarismos e utilizados para verificar se o número informado atende às regras de validação do CPF.

Faça um programa em Java que leia um CPF, informado como uma sequência de 11 algarismos, e utilize subprogramas para realizar as seguintes operações:

a) Verificar se a entrada contém exatamente 11 algarismos.

b) Calcular o primeiro dígito verificador, utilizando os nove primeiros algarismos do CPF, conforme o procedimento descrito a seguir:

Multiplique o primeiro algarismo por 10, o segundo por 9, o terceiro por 8 e assim sucessivamente, até multiplicar o nono algarismo por 2.

Some os resultados das nove multiplicações e calcule o resto da divisão dessa soma por 11.

Se o resto for menor que 2, o primeiro dígito verificador será 0. Caso contrário, será igual a 11 menos o resto.

c) Calcular o segundo dígito verificador, utilizando os nove primeiros algarismos e o primeiro dígito verificador calculado anteriormente:

Multiplique o primeiro algarismo por 11, o segundo por 10, o terceiro por 9 e assim sucessivamente, até multiplicar o décimo algarismo por 2.

Some os resultados das dez multiplicações e calcule o resto da divisão dessa soma por 11.

Se o resto for menor que 2, o segundo dígito verificador será 0. Caso contrário, será igual a 11 menos o resto.

d) Comparar os dois dígitos verificadores calculados com os dois últimos algarismos do CPF informado.

e) Informar se o CPF é válido segundo o algoritmo de verificação. Para isso, os dois dígitos calculados devem ser iguais aos dois últimos algarismos informados. Considere também inválidas as entradas que contenham caracteres diferentes de algarismos ou cujos 11 algarismos sejam todos iguais.

O programa deverá ser organizado em subprogramas, de modo que o método responsável pela validação do CPF utilize os métodos desenvolvidos para calcular os dois dígitos verificadores.

**Uni6Exe13.java** Faça um programa que apresente repetidamente um menu com as seguintes opções:
MENU DE CONVERSÕES

1 — Converter Celsius para Fahrenheit

2 — Converter Fahrenheit para Celsius

0 — Encerrar o programa

O programa deverá solicitar a opção desejada e chamar um método específico para executar a operação selecionada.

As operações deverão ser implementadas conforme as seguintes especificações:

a) A conversão de Celsius para Fahrenheit deverá utilizar a fórmula \(F = \frac{9}{5}C + 32\).

b) A conversão de Fahrenheit para Celsius deverá utilizar a fórmula \(C = \frac{5}{9}(F - 32)\).

O menu deverá permanecer em execução até que o usuário escolha a opção zero. Para opções inválidas, o programa deverá exibir uma mensagem e solicitar uma nova escolha.

**Uni6Exe14.java** Faça um programa que apresente repetidamente um menu para simular operações financeiras:
SIMULADOR FINANCEIRO

1 — Calcular juros simples

2 — Calcular montante com juros compostos

0 — Encerrar o programa

O programa deverá solicitar a opção escolhida, ler os dados necessários e chamar o subprograma correspondente. Cada operação deverá ser implementada em um método próprio, que receberá os parâmetros necessários e retornará o resultado.

Utilize as seguintes especificações:

a) Juros simples: receber o capital inicial \(C\), a taxa de juros \(i\) por período e o número de períodos \(t\), calculando o montante pela fórmula \(M=C(1+it)\).

b) Juros compostos: receber o capital inicial, a taxa por período e o número de períodos, calculando o montante pela fórmula \(M=C(1+i)^t\).

O programa deverá apresentar os resultados com duas casas decimais, validar os dados necessários para cada operação e retornar ao menu após cada cálculo. A opção zero deverá encerrar o programa.

Para os cálculos de juros, considere a taxa expressa em formato decimal: por exemplo, 5% corresponde a \(0{,}05\). Na variação percentual, o valor inicial deverá ser diferente de zero.

**Uni6Exe15.java** Faça um programa que apresente repetidamente o seguinte menu:
SIMULADOR DE FINANCIAMENTO

1 — Calcular o valor da prestação mensal

2 — Calcular o custo total do financiamento

3 — Simular a amortização de uma dívida

4 — Comparar dois financiamentos

0 — Encerrar o programa

O programa deverá solicitar a opção desejada e chamar o método correspondente. Cada operação deverá ser implementada em um subprograma específico, com parâmetros e valores de retorno adequados.

Considere as seguintes especificações:

a) Valor da prestação mensal: receber o valor financiado, a taxa de juros mensal e a quantidade de prestações, calculando o valor da prestação fixa pela fórmula:
\[
P = \frac{C \cdot i(1+i)^n}{(1+i)^n-1}
\]

Em que \(C\) representa o capital financiado, \(i\) a taxa de juros mensal em formato decimal e \(n\) a quantidade de prestações. Se a taxa for zero, a prestação será \(C/n\).

b) Custo total do financiamento: receber o valor da prestação e a quantidade de prestações, retornando o valor total pago e permitindo calcular a diferença entre esse total e o capital originalmente financiado.

c) Simulação da amortização: receber o valor financiado, a taxa de juros mensal, a quantidade de prestações e o valor da prestação. Utilizando uma estrutura de repetição, apresentar para cada mês:
- número da prestação;
- saldo devedor no início do mês;
- juros calculados sobre o saldo devedor;
- valor amortizado;
- saldo devedor após o pagamento.
A amortização mensal será calculada pela diferença entre a prestação e os juros do período. O saldo devedor será reduzido pelo valor amortizado.

d) Comparação de financiamentos: receber os dados de dois financiamentos e calcular o valor das prestações e o custo total de cada um. Ao final, informar qual alternativa apresenta o menor custo total e qual a diferença entre os custos.

O menu deverá permanecer em execução até que o usuário escolha a opção zero. O programa deverá validar os dados de entrada e tratar situações como valores não positivos para o capital ou para a quantidade de prestações.

**Uni6Exe16.java** Faça um programa que apresente repetidamente o seguinte menu:
PLANEJAMENTO DE VIAGENS

1 — Calcular o custo de combustível de um percurso

2 — Calcular o custo de hospedagem

3 — Calcular o custo total de uma viagem

4 — Comparar duas opções de viagem

0 — Encerrar o programa

O programa deverá solicitar a opção desejada e chamar o método correspondente. O menu deverá ser apresentado novamente após cada operação, até que o usuário escolha a opção zero.

Implemente os métodos conforme as especificações:

a) Custo de combustível: receber a distância do percurso, o consumo médio do veículo em quilômetros por litro e o preço do litro de combustível. Retornar o custo estimado de combustível para percorrer a distância informada.

b) Custo de hospedagem: receber o preço da diária e a quantidade de noites. Retornar o custo total da hospedagem.

c) Custo total da viagem: receber os dados relativos ao transporte e à hospedagem, chamar os métodos desenvolvidos nos itens anteriores e retornar o custo total da viagem, incluindo combustível e hospedagem.

d) Comparação de viagens: receber os dados de duas opções de viagem e chamar o método de cálculo do custo total para cada uma delas. Apresentar os custos calculados, informar qual opção é mais econômica e indicar a diferença entre os valores.

O programa deverá validar os dados informados, evitando valores negativos ou inválidos para distância, consumo, preço do combustível, diária e quantidade de noites.
Requisito de implementação
O método do item c deverá chamar os métodos dos itens a e b. Da mesma forma, o método do item d deverá chamar o método do item c para calcular os custos das duas alternativas.

Não duplique os cálculos já implementados nos outros métodos. Cada método deverá ter uma responsabilidade específica, e o programa principal deverá controlar o menu e apresentar os resultados.
