package DecoratorPattern;

public class BlackBorderDecorator extends ComponentDecorator {
    public BlackBorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        //先调用被装饰对象的显示方法
        super.display();
        //再添加黑色边框装饰
        addBlackBorder();
    }

    //添加黑色边框
    private void addBlackBorder() {
        System.out.println("为组件添加黑色边框");
    }
}
