# Introdução à Programação - Unidade 7

Algumas anotações feitas em aula: [aulaAnotacoes.md](./aulaAnotacoes.md "aulaAnotacoes.md")

## COMANDOS DE CONTROLE DE FLUXO: SUB-ROTINAS

São rotinas (pequenos programas) que realizam uma determinada função específica.

- Permitem modularizar os programas.

- Permitem reutilização de código;

São ativadas por um programa principal ou outros subprogramas, causando um desvio.

<img width="~794" height="472" alt="image" src="https://github.com/user-attachments/assets/54257f38-525d-4e38-8e67-42c5af52ecb0" />

### Tipo de Subprogramas em Java

- Funções pré-definidas
- Funções definidas pelo programador


### Definição de Subrotinas

Uma sub-rotina tem:
- Tipo: define o tipo da informação que terá o resultado da sub-rotina (saída)
- Nome: define o nome da sub-rotina (identificador)
- Parâmetros: definem os dados que serão trocados entre a sub-rotina e a rotina que a ativou

### O que são parâmetros

Em uma linguagem de programação os parâmetros são denominados de:
- Formais (Declaração)
- Atuais (Ativação)

- **PARÂMETROS FORMAIS:** devem ter a definição do tipo antes do nome da variável.
- **PARÂMETROS ATUAIS:** não devem ter a definição do tipo antes do nome da variável.
- **TRANSFERÊNCIA DE PARÂMETROS**
    - Número de Parâmetros Formais = Número de Parâmetros Atuais.
    - O Argumento Formal e seu correspondente Argumento Atual devem ser do mesmo tipo.

### PASSAGEM DE PARÂMETRO POR VALOR:
Na passagem de parâmetro por valor, o parâmetro formal recebe o conteúdo do parâmetro atual.
Exemplo:
int troca (int a, int b)

### PASSAGEM DE PARÂMETRO POR REFERÊNCIA:
Na passagem de parâmetro por referência, o parâmetro formal e o parâmetro atual tem o mesmo endereço de memória.
Ao alterar a variável relacionada ao parâmetro formal, a variável do parâmetro atual também é alterada
Não podem ser utilizadas expressões como parâmetros atuais na ativação (chamada) da sub-rotina.

### Funções definidas pelo programador:
O programador pode definir e implementar suas próprias funções
As funções podem retornar um resultado, devendo, portanto, ter um tipo. Funções sem retorno devem ser definidas como do tipo void
As funções podem (e devem) ter PARÂMETROS que são utilizados para a entrada e saída de dados das funções
O resultado de uma função deve ser retornado a partir da cláusula return

Sintaxe (definição):

tipo identificador ([tipo parâmetros]);
{
	[declarações]
	< Bloco >
	return <expressão>;
}

As funções podem ser ativadas em atribuições, condições ou em parâmetros de outras funções

A chamada de uma função deve seguir a sintaxe de ativação

Sintaxe (ativação):

variavel = função (parâmetros);
ou
System.out.printl (“formato” + função (parâmetros));
ou
if (função (parâmetros))


----------

### Principais Referências Bibliográficas​

DEITEL, Paul J; DEITEL, Harvey M. **[Java: como programar](https://bu.furb.br/consulta/portalConsulta/recuperaMfnCompleto.php?menu=rapida&CdMFN=341002)**. 8. ed. São Paulo: Pearson, 2010. xxix, 1144 p, il.​

HORSTMANN, Cay S. **[Big Java](https://bu.furb.br/consulta/portalConsulta/recuperaMfnCompleto.php?menu=rapida&CdMFN=271388)**. Porto Alegre : Bookman, 2004. xi, 1125 p, il. , 1 CD-ROM.​

SCHILDT, Herbert; HOLMES, James. **[A arte do Java](https://bu.furb.br/consulta/portalConsulta/recuperaMfnCompleto.php?menu=rapida&CdMFN=257427)**. Rio de Janeiro : Elsevier : Campus, c2003. xvi, 382 p, il.​

----------

## ⏭ [Voltar)](../README.md "Voltar")  
