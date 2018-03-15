package adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdapterTest {
    @Test
    void targetOperation() {
        Target target = new Adapter();
        target.targetOperation();
    }

}