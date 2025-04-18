package FlyweightPattern;

public class ChessBoard {
    public void placeChessPiece(String color, int x, int y, boolean isCaptured) {
        ChessPiece piece = ChessPieceFactory.getChessPiece(color);
        piece.display(x, y, isCaptured);
    }
}