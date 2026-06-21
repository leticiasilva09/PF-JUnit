# Prática Final - Maven + JUnit (Java)

## Descrição

Projeto desenvolvido como atividade prática da disciplina, com o objetivo de aplicar conceitos de testes unitários usando JUnit em Java. A atividade consiste na implementação de casos de teste para a classe `MyStack`, uma estrutura de dados do tipo pilha.

## Tecnologias Utilizadas

- Java 17
- JUnit 5
- Maven
- Visual Studio Code

## Estrutura do Projeto

```text
src
├── main
│   └── java
│       └── com
│           └── example
│               └── MyStack.java
└── test
    └── java
        └── com
            └── example
                └── MyStackTest.java
```

## Casos de Teste Implementados

Os testes desenvolvidos verificam:

- Criação de uma pilha vazia;
- Inserção de elementos com `push`;
- Remoção de elementos com `pop`;
- Consulta do elemento do topo com `peek`;
- Comportamento da pilha vazia;
- Retorno de `null` em operações inválidas;
- Validação do comportamento LIFO (*Last In, First Out*);
- Inserção e remoção de valores `null`;
- Sequências completas de operações;
- Verificação do estado da pilha após inserções e remoções.

## Executando os Testes

Na raiz do projeto, execute:

```bash
mvn test
```

Para limpar e executar novamente todos os testes:

```bash
mvn clean test
```

---

Desenvolvido como atividade acadêmica da disciplina de Teste e Qualidade de Software.