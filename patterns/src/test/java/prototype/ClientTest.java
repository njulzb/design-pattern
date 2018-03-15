package prototype;

import org.junit.jupiter.api.Test;



class ClientTest {
    @Test
    void operation() {
        Prototype prototype = new Prototype("hello");
        Client client = new Client();
        client.operation(prototype);
    }

}