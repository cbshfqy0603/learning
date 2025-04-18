package DecoratorPattern;

public abstract class ComponentDecorator implements Component {
    protected Component component;

    //构造函数，注入被装饰的组件
    public ComponentDecorator(Component component) {
        this.component = component;
    }

    @Override
    public void display() {
        //默认调用被装饰对象的display方法
        if (component != null) {
            component.display();
        }
    }
}
