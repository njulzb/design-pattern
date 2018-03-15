package proxy;

public class ProxySubject implements Subject {
    private Subject realSubject = null;

    public ProxySubject(Subject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void request() {
        this.beforeRequest();
        this.realSubject.request();
        this.afterRequest();
    }

    public void beforeRequest(){
        System.out.println("before request");
    }

    public void afterRequest(){
        System.out.println("after request");
    }

}
