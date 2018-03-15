package proxy;

public class ClientProxy {
    public void launcher(){
        Subject real = new RealSubject();
        Subject proxy = new ProxySubject(real);
        proxy.request();
    }
}
