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


**Uni6Exe05.java** Faça um programa que leia várias expressões aritméticas e, com base em subprogramas, escreva:

a)	informe se cada expressão aritmética está correta sintaticamente em relação ao número de parênteses utilizados;

b)	para cada expressão aritmética informe o número de divisões e multiplicações utilizadas;

c)	informe a posição do primeiro operador aritmético de cada expressão.


**Uni6Exe06.java** Uma startup precisa medir a previsibilidade e a estabilidade do seu negócio. Para isso, a empresa monitora o faturamento diário durante um período de 7 dias para descobrir a média semanal e o desvio padrão da receita. Como estagiário de Ciência de Dados, você ficou encarregado de criar duas sub-rotinas para automatizar essa análise: 

a) double calcularMedia(double[] dados): Deve calcular e retornar a média aritmética dos valores. 

b) double calcularDesvioPadrao(double[] dados, double media): Deve calcular e retornar o desvio padrão dos dados. 

Obs.: desvio padrão é uma medida que indica o quanto os valores de um conjunto de dados se afastam da média, indicando a consistência dos resultados. Para calcular o desvio padrão siga os seguintes passos: calcule a média dos valores; realize a seguinte operação para cada valor do conjunto (n-média) ²; some os resultados obtidos na última conta; divida o resulta da soma pelo número de elementos; por último, faça a raiz quadrada do último valor. 


**Uni6Exe07.java** O sensor de presença de uma loja de conveniência registrou o número de clientes a cada duas horas durante um dia inteiro. No entanto, houve uma falha no sistema e algumas leituras foram corrompidas, gerando valores negativos. Crie uma sub-rotina para realizar o tratamento desses dados corrompidos. A função deve receber o vetor original, gerar e retornar um novo vetor totalmente íntegro, ou seja, um vetor que mantenha os dados corretos e substitua todos os valores negativos por 0. 


**Uni6Exe08.java** m grupo de cinéfilos está organizando uma ação de Dia dos Namorados para avaliar a compatibilidade de casais com base nas preferências de filmes. PO programa deve receber, de forma individual, uma nota de 1 a 5 para cinco filmes. Escreva uma sub-rotina que receba o vetor de notas da pessoa A e o vetor de notas da pessoa B. A função deve calcular a diferença absoluta (sem sinal negativo) entre as notas de cada filme e gerenciar um medidor de afinidade (que começa em 0) seguindo as regras abaixo:

- Se a diferença for igual a 0 (mesma nota): Adicione 3 pontos ao medidor.

- Se a diferença for de 1 ou 2 (notas próximas): Adicione 1 ponto ao medidor.

- Se a diferença for igual ou maior que 3 (gostos muito distantes): Subtraia 2 pontos do medidor.

Se a diferença for igual ou maior que 3 (gostos muito distantes): Subtraia 2 pontos do medidor. 


**Uni6Exe09.java** Em uma turma de Ciência de Dados, o professor solicitou que os alunos desenvolvessem um conversor decimal para binário. Em suas especificações o professor informou que: 

- O usuário deve digitar um número inteiro no formato decimal que deseja transformar.

- A sub-rotina valorConvertido realizará a conversão e retornará um vetor de inteiros contendo a representação do número em binário.

- O programa principal deve receber esse vetor retornado e imprimir o resultado final formatado na tela.

**Uni6Exe10.java** Bancos de dados e tabelas precisam permitir que novos dados entrem, sejam encontrados e também deletados quando um cliente cancela o serviço. Você deve permitir que o usuário armazene até 10 IDs (valores inteiros) em um vetor, onde o valor 0 representa uma posição vazia. Com base nisso, crie uma sub-rotina para cada uma das situações abaixo: 

- Verificar a existência de um ID.
  
- Remover um ID.
  
- Adicionar um ID, caso ainda haja espaço disponível.

**Uni6Exe11.java** Em empresas de tecnologia e e-commerce, o controle de estoque é automatizado por sistemas que atualizam bases de dados em tempo real. Para facilitar a operação, os produtos são identificados diretamente por seus nomes, e o sistema deve ser capaz de localizar as quantidades em estoque correspondentes. Crie um programa que gerencie um estoque de 5 itens, armazenando o nome dos itens e a quantidade em estoque. O programa principal deverá conter um menu com as seguintes opções: 

1 – Procurar item. 

2 – Adicionar item. 

3 – Retirar item. 

4 – Sair.	 

Para cada opção do menu, com exceção da opção 4, uma sub-rotina diferente deverá ser acionada, e o usuário deverá ser informado sobre o resultado da ação realizada. 

**Uni6Exe12.java** Em segurança de dados, antes de liberar o acesso a um relatório ou banco de dados confidencial, o sistema precisa verificar se o usuário que está tentando logar possui permissão ativa na empresa. Com base nos usuários armazenados que possuem acesso autorizado ao sistema, você deverá criar a sub-rotina booleana verificarPermissao(String[] lista, String usuarioTentandoAcesso), que deve retornar:  

- True, para “Acesso Autorizado”; 

- False para “Acesso Negado”.  

Após a verificação, o usuário que está tentando acessar deverá receber a seguinte mensagem: “Olá, usuário y. Seu acesso foi permitido/negado.” 

**Uni6Exe13.java** Um laboratório de biomedicina recebe diariamente lotes de insumos refrigerados (como vacinas, amostras de sangue e reagentes) vindos de fornecedores globais. Como cada fornecedor utiliza uma unidade de medida diferente — Celsius (°C), Fahrenheit (°F) ou Kelvin (K) —, o laboratório precisa padronizar todas as temperaturas de um lote em uma única unidade escolhida pelo biomédico para conseguir gerar os relatórios de controle de qualidade. Desenvolva um programa em Java que armazene em um vetor 5 temperaturas em Celsius vindas do relatório de um fornecedor. No programa principal, o sistema deve perguntar ao usuário para qual unidade ele deseja converter o lote atual, exibindo as seguintes opções: 

- Digite 1 para converter para Fahrenheit (°F) 

- Digite 2 para converter para Kelvin (K) 

Com base na escolha do usuário, o programa principal deve acionar a sub-rotina correspondente, passar o vetor original como parâmetro e, por fim, imprimir o novo vetor com as temperaturas já convertidas e formatadas 

- Fórmula 1: F = (Celsius * 1.8) + 32  

- Fórmula 2: K = Celsius + 273.15

**Uni6Exe14.java** Em sistemas de design, edição de imagens e análise de dados visuais, as cores secundárias são geradas a partir da combinação de cores primárias. Crie um sistema que simule a mistura de tintas com base nas três cores primárias tradicionais: Azul, Amarelo e Vermelho. Desenvolva um programa em Java que armazene em um vetor de String com duas posições as cores informadas pelo usuário. No programa principal, o sistema deve pedir para o usuário digitar duas cores primárias diferentes e guardá-las nesse vetor. Com base nas cores informadas, o programa principal deve acionar a sub-rotina correspondente, passar o vetor original como parâmetro e, por fim, imprimir na tela o nome da cor resultante obtida com a mistura.

- String descobrirMistura(String[] cores): deve receber o vetor com as duas cores digitadas, analisar a combinação e retornar uma única String com o nome da cor gerada. 

- Azul e Vermelho deve retornar "Roxo". 

- Azul e Amarelo deve retornar "Verde". 

- Amarelo e Vermelho deve retornar "Laranja".

- Se o usuário digitar alguma cor que não seja primária ou repetir a mesma cor nas duas posições, a função deve retornar a mensagem "Combinação inválida".

**Uni6Exe15.java** A equipe de veterinários e nutricionistas de um zoológico precisa monitorar de perto a alimentação dos animais para garantir que todos recebam os nutrientes adequados. Cada espécie possui uma quantidade diária recomendada de ração (em quilos). Porém, dependendo do comportamento ou do estado de saúde do animal, os tratadores precisam atualizar esses valores no sistema de forma rápida. Desenvolva um programa que armazene os nomes das espécies e a quantidade diária de ração de cinco animais do zoológico. Com base no animal informado pelo usuário, crie sub-rotinas para: 

- Verificar se o animal está cadastrado. 

- Caso o animal esteja cadastrado, atualizar a quantidade de ração diária conforme informado pelo usuário. 

Ao final, o programa deverá imprimir o nome de cada animal e a respectiva quantidade de ração em kg. 
