🎲 Descubra o Número

Projeto desenvolvido em Java com o objetivo de praticar os fundamentos da Programação Orientada a Objetos (POO).

> Objetivos de aprendizagem

Durante o desenvolvimento deste projeto foram praticados os seguintes conceitos:

- Criação de classes e objetos
- Atributos e métodos
- Instanciação de objetos com `new`
- Encapsulamento básico da lógica do programa
- Uso de variáveis e tipos primitivos
- Estruturas condicionais (`if`)
- Estruturas de repetição (`while`)
- Geração de números aleatórios com `Math.random()`
- Manipulação de valores booleanos (`true` e `false`)
- Comunicação entre objetos
- Organização de código em múltiplas classes

## Estrutura do projeto

- `GameLauncher.java` → ponto de entrada da aplicação.
- `GuessGame.java` → contém a lógica principal do jogo.
- `Player.java` → representa os jogadores e seus palpites.

## Como funciona

A máquina escolhe aleatoriamente um número entre 0 e 9.

Três jogadores geram palpites aleatórios até que um deles acerte o número escolhido.

O jogo continua em execução até que exista pelo menos um vencedor.

## Exemplo de saída

```text
I'm thinking of a number between 0 and 9...

Number to guess is 7

Player one guessed 3
Player two guessed 7
Player three guessed 1

We have a winner!

Player one got it right? false
Player two got it right? true
Player three got it right? false

Game is over.
// VOCÊ PODERÁ VER A COMPILAÇÃO NO ARQUIVO CAPTURA DE TELA ACIMA.
