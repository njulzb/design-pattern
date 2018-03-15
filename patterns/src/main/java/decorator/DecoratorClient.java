package decorator;

public class DecoratorClient {
    public void launcher (){
        Component component = new ConcreteComponent();
        //一级装饰
        Component decorator = new ConcreteDecorator(component);
        decorator.operation();
        System.out.println("-------there is first grade above ----------");
        //二级装饰
        Component decorator2 = new ConcreteDecorator2(decorator);
        decorator2.operation();
    }
}
