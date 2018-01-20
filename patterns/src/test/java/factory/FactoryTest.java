package factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactoryTest {
    @Test
    void createProduct() {
        Factory fac = new ConcreteFactory();
        Product product1 = fac.createProduct(1);
        product1.play();
        Product product2 = fac.createProduct(2);
        product2.play();
    }

}