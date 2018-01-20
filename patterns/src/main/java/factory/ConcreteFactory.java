package factory;



public class ConcreteFactory implements Factory{



    public ConcreteFactory() {
    }

    @Override
    public Product createProduct(int i) {
        if (i==1){
            return new ConcreteProduct1();
        }
        if (i==2){
            return  new ConcreteProduct2();
        }
        return null;
    }
}
