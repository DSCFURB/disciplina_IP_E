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

**Uni6Exe12.java** O Cadastro de Pessoas Físicas (CPF) possui 11 algarismos, sendo os dois últimos dígitos verificadores calculados a partir dos nove primeiros e dos dez primeiros algarismos, respectivamente.

Faça um programa que leia uma sequência de 11 algarismos e utilize subprogramas para:

a) verificar se a entrada possui exatamente 11 algarismos;

b) calcular o primeiro dígito verificador;

c) calcular o segundo dígito verificador;

d) verificar se os dígitos calculados correspondem aos informados;

e) informar se o CPF é válido segundo o algoritmo de verificação.

Para calcular cada dígito, multiplique os algarismos anteriores pelos pesos correspondentes, some os produtos e calcule o resto da divisão por 11. Se o resto for menor que 2, o dígito será 0; caso contrário, será igual a \(11 - \text{resto}\). No cálculo do segundo dígito, inclua também o primeiro dígito verificador.

**Uni6Exe32.java** Faça um programa que apresente repetidamente um menu com as seguintes opções:
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

3 — Calcular o valor final de uma compra com desconto

4 — Calcular a variação percentual entre dois valores

0 — Encerrar o programa

O programa deverá solicitar a opção escolhida, ler os dados necessários e chamar o subprograma correspondente. Cada operação deverá ser implementada em um método próprio, que receberá os parâmetros necessários e retornará o resultado.

Utilize as seguintes especificações:

a) Juros simples: receber o capital inicial \(C\), a taxa de juros \(i\) por período e o número de períodos \(t\), calculando o montante pela fórmula \(M=C(1+it)\).

b) Juros compostos: receber o capital inicial, a taxa por período e o número de períodos, calculando o montante pela fórmula \(M=C(1+i)^t\).

c) Compra com desconto: receber o preço original e a porcentagem de desconto, retornando o preço final.

d) Variação percentual: receber o valor inicial e o valor final e calcular a variação percentual pela fórmula:
\[
Variação = \frac{valor\ final-valor\ inicial}{valor\ inicial}\times100
\]

O programa deverá apresentar os resultados com duas casas decimais, validar os dados necessários para cada operação e retornar ao menu após cada cálculo. A opção zero deverá encerrar o programa.

Para os cálculos de juros, considere a taxa expressa em formato decimal: por exemplo, 5% corresponde a \(0{,}05\). Na variação percentual, o valor inicial deverá ser diferente de zero.


