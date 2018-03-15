package prototype;

public class Client {
    public void operation(Prototype example){
        Prototype p = example.clone();
        System.out.println(p.name==example.name);
    }

}
