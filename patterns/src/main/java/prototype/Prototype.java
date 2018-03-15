package prototype;

public class Prototype implements Cloneable{

    String name;

    public Prototype(String name) {
        this.name = name;
    }

    public Prototype clone(){
        try {
            Prototype prototype = (Prototype)super.clone();
            prototype.name = new String(this.name);
//            prototype.name = new String(this.name);
            return prototype;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return null;
    }

}
