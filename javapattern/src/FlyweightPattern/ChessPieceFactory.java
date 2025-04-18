package FlyweightPattern;

import java.util.HashMap;

public class ChessPieceFactory {
    private static HashMap pieces = new HashMap<>();

    public static ChessPiece getChessPiece(String color) {
        ChessPiece piece = (ChessPiece) pieces.get(color);
        if (piece == null) {
            piece = new ConcreteChessPiece(color);
            pieces.put(color, piece);
            System.out.println("创建新的棋子: " + color);
        } else {
            System.out.println("复用已有棋子: " + color);
        }
        return piece;
    }

    public static int getTotalPieces() {
        return pieces.size();
    }
}