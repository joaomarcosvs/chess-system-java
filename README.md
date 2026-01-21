# ♟️ Chess System Java

Uma implementação didática de xadrez em Java, organizada com separação clara entre regras do jogo, peças e apresentação no console. Ideal para estudar orientação a objetos, encapsulamento e regras de movimentação.

## ✨ Destaques

- Modelagem em camadas: `boardgame`, `chess` e `application`
- Regras essenciais do xadrez implementadas
- Peças com comportamento polimórfico
- Interface de console simples para jogar

## 🗂️ Estrutura do projeto

```
src/
	apllication/
		Program.java
		UI.java
	boardgame/
		Board.java
		BoardException.java
		Piece.java
		Position.java
	chess/
		ChessException.java
		ChessMatch.java
		ChessPiece.java
		ChessPosition.java
		Color.java
		pieces/
			Bishop.java
			King.java
			Knight.java
			Pawn.java
			Queen.java
			Rook.java
```

> Observação: a pasta `apllication` mantém o nome original do projeto.

## 🧩 Principais classes

- `ChessMatch`: orquestra o estado da partida
- `ChessPiece`: base para as peças do xadrez
- `Board` e `Position`: infraestrutura do tabuleiro
- `UI`: renderização do tabuleiro no console

## ▶️ Como executar

### Pré-requisitos

- Java 11+ (ou compatível)

### Compilar e rodar (linha de comando)

Na raiz do projeto:

```bash
javac -d out $(find src -name "*.java")
java -cp out apllication.Program
```

## 🎮 Como jogar

1. Inicie a aplicação.
2. Informe a origem e o destino das peças quando solicitado.
3. A partida evolui conforme os movimentos válidos.

## 🧠 Conceitos praticados

- Orientação a objetos (OO)
- Herança e polimorfismo
- Tratamento de exceções
- Encapsulamento de regras

## 📌 Próximos passos (ideias)

- Interface gráfica

