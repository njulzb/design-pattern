package bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbstractShapeTest {
    @Test
    void draw() {
        Color green = new Green();
        AbstractShape square = new Square(green);
        square.draw();
    }

}