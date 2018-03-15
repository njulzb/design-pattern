package decorator;

public class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        this.modify();
        super.operation();
    }

    public void modify(){
        System.out.println("do some modification");
    }

}
