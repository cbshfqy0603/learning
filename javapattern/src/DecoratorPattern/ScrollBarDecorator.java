package DecoratorPattern;

public class ScrollBarDecorator extends ComponentDecorator {
    public ScrollBarDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        super.display(); // 先调用被装饰对象的显示方法
        addScrollBar();  // 再添加滚动条装饰
    }

    // 添加滚动条的实现
    private void addScrollBar() {
        System.out.println("为组件添加滚动条");
    }
}
