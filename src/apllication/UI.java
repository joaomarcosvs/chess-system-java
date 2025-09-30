package apllication;

import chess.ChessPiece;

public class UI {

    public static void printBoard(ChessPiece[][] pieces) {
        for (int i = 0; i < pieces.length; i++) {
            System.out.print((8 - i) + " "); // imprimi o numero da linha e o espaço que vem após
            for ( int j = 0; j < pieces.length; j++) {
                printPieces(pieces[i][j]); // imprimi as peças
            }
            System.out.println(); // \n
        }
        System.out.println("  a b c d e f g h"); // linha final
    }

    private static void printPieces(ChessPiece piece){
        if (piece == null ) {
            System.out.print("-");
        } else {
            System.out.print(piece);
        }
        System.out.print(" ");
    }
}
