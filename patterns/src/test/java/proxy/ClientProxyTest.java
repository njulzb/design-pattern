package proxy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientProxyTest {
    @Test
    void launcher() {
        ClientProxy proxy = new ClientProxy();
        proxy.launcher();
    }

}