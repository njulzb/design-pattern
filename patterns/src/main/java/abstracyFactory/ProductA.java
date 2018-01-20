package abstracyFactory;

public abstract class ProductA {
    public String name ;

    public ProductA() {
        this.name = "A.";
    }

    public void play(){
        System.out.println(this.name);
    }
}
