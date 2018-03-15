package decorator;

public class ConcreteDecorator2 extends Decorator {
    public ConcreteDecorator2(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        this.modify();
        super.operation();
    }

    public void modify(){
        System.out.println("another modification way");
    }
}
