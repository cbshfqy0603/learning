package FlyweightPattern;

public class ConcreteChessPiece implements ChessPiece {
    private String color;

    public ConcreteChessPiece(String color) {
        this.color = color;
    }

    @Override
    public void display(int x, int y, boolean isCaptured) {
        String status = isCaptured ? "已被吃掉" : "未被吃掉";
        System.out.println("棋子 - 颜色: " + color + ", 位置: (" + x + ", " + y + "), 状态: " + status);
    }
}
