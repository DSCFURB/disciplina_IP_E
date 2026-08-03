## Aula

Métodos -> Paradigma .. Orientação a Objeto (OO)  
- Escopo dos métodos: ![escopo](imgs/escopo.png "escopo")  

- explicar um "pouco" -> mais explicação na disciplina de Orientação à Objetos (próximo semestre)  
- Nome do arquivo Java define o nome Class  
  - todo arquivo java só tem uma classe  
- Métodos Main ->   public static void main(String[] args)  
- porta entrada para executar o código  
- só pode ter um método main no nosso código a ser executado  

Método Construtor _ método "especial"  

- se usa muito construtores em OO  
- usaremos também para evitar o uso do static  
- static: tenta não usar -> fugir :-(  
- não tem "void"  

Métodos _ os meus métodos  

```java
  private void testeAula(int a, double b) { /* ... */ }
```

- assinatura  
  - [ ] **private**: visibilidade -> private (sem usar private por enquanto)  
  - [ ] **void**: retorno void ou tipo -> saída (opcional)  
  - [ ] **testeAula**: nome (mesma ideia ao dar nomes das variáveis)  
  - [ ] **(int a, double b)**: parâmetros  
    - Entrada do método (opcional)  
      - passagem por valor: conteúdo da variável  
      - passagem por referência: ponteiro (endereço)  
  - [ ] **{ /* ... */ }**: bloco/escopo  
    - { todo o meu código} -> processo (opcional)  

- visibilidade da Classe ou Método: public, protected, private  
  - public é o valor default  
  - .. recomendação usar nesta ordem: private, protected, public  

