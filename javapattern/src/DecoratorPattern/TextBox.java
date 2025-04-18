package DecoratorPattern;

public class TextBox implements Component {
    @Override
    public void display() {
        System.out.println("显示文本框内容");
    }
}
