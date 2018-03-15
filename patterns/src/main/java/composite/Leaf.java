package composite;

public class Leaf implements Component {
    @Override
    public void componentOperation() {
        System.out.println("this is a leaf operation");
    }
}
