# Desafio Controle de Fluxo

Este projeto foi desenvolvido como parte do aprendizado de **Java**, com foco em estruturas de controle de fluxo, exceções personalizadas e boas práticas de entrada e validação de dados no console.

## 💡 Descrição

O programa solicita ao usuário dois números inteiros via terminal. Com esses números, ele calcula a quantidade de interações necessárias e imprime uma contagem no console.

Se o primeiro número for **maior** que o segundo, o sistema **lança uma exceção customizada** (`ParametrosInvalidosException`) e solicita novamente os valores até que estejam corretos.

Se o usuário digitar um valor que **não seja um número inteiro**, o sistema lança outra exceção customizada chamada `NumeroInvalidoException`, solicitando que a entrada seja repetida até que seja válida.


## 🛠️ Tecnologias

- Java 17+
- IntelliJ IDEA

## 📋 Funcionalidades

- Leitura de dados via `Scanner`
- Validação de entrada com estrutura de repetição
- Validação de tipo (somente inteiros são aceitos)
- Estrutura de repetição com tratamento de exceções
- Uso de `try-catch` e `throw`
- Mensagens de erro amigáveis ao usuário
- Lançamento de exceções personalizadas:
  - `ParametrosInvalidosException` (quando o segundo número não é maior que o primeiro)
  - `NumeroInvalidoException` (quando o valor digitado não é um inteiro)

