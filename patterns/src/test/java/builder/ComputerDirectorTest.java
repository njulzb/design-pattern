package builder;

import org.junit.jupiter.api.Test;

class ComputerDirectorTest {
    @Test
    void constructT410() {
        ComputerDirector director = new ComputerDirector();
        Computer T410 = director.constructT410();
        Computer X201 = director.constructX201();
        System.out.println(T410);
        System.out.println("-----------------");
        System.out.println(X201);
    }

    @Test
    void constructX201() {
        assert(true);
    }

}