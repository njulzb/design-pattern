package adapter;

public class Adapter extends Adaptee implements Target {
    @Override
    public void targetOperation() {
        this.adapterOperation();
        super.formerOperation();
    }

    public void adapterOperation(){
        System.out.println("make some adjustment");
    }
}
