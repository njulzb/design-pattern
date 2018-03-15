package bridge;

public class Circle extends AbstractShape {
    public Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        String format = "use %s to draw circle";
        System.out.println(String.format(format, this.color.getColor()));
    }
}
