package FlyweightPattern;

public class Main {
    public static void main(String[] args) {
        ChessBoard board = new ChessBoard();

        board.placeChessPiece("黑色", 1, 1, false);
        board.placeChessPiece("白色", 2, 2, false);
        board.placeChessPiece("黑色", 3, 3, true);
        board.placeChessPiece("白色", 4, 4, false);
        board.placeChessPiece("黑色", 5, 5, false);

        System.out.println("总共创建的棋子实例数: " + ChessPieceFactory.getTotalPieces());
    }
}