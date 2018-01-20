package abstracyFactory;

public abstract class ProductB {
    String name;

    public ProductB() {
        this.name = "B.";
    }

    public void play(){
        System.out.println(this.name);
    }
}
