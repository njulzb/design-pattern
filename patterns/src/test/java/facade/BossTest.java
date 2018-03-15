package facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BossTest {
    @Test
    void business() {
        Boss boss = new Boss();
        boss.business("nanjing","beijing",10);
    }

}