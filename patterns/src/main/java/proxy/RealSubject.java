package proxy;

public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("真实业务处理");
    }
}