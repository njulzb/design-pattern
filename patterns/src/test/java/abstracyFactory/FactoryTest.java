package abstracyFactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactoryTest {
    @Test
    void createProductA1() {
        Factory fac = new ConcreteFactory1();
        fac.createProductA().play();
    }

    @Test
    void createProductB1() {
        Factory fac = new ConcreteFactory1();
        fac.createProductB().play();
    }

    @Test
    void createProductA2() {
        Factory fac = new ConcreteFactory2();
        fac.createProductA().play();
    }

    @Test
    void createProductB2() {
        Factory fac = new ConcreteFactory2();
        fac.createProductB().play();
    }


}