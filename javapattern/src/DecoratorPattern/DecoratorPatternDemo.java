package DecoratorPattern;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        System.out.println("测试1：基础文本框");
        Component textBox = new TextBox();
        textBox.display();
        System.out.println("----------");


        System.out.println("测试2：带滚动条的文本框");
        Component textBoxWithScroll = new ScrollBarDecorator(textBox);
        textBoxWithScroll.display();
        System.out.println("----------");

        System.out.println("测试3：带滚动条和黑色边框的文本框");
        Component textBoxWithScrollAndBorder = new BlackBorderDecorator(new ScrollBarDecorator(textBox));
        textBoxWithScrollAndBorder.display();
        System.out.println("----------");

        System.out.println("测试4：基础窗口");
        Component window = new Window();
        window.display();
        System.out.println("----------");

        System.out.println("测试5：带黑色边框的窗口");
        Component windowWithBorder = new BlackBorderDecorator(window);
        windowWithBorder.display();
        System.out.println("----------");
    }
}
