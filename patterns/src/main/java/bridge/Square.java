package bridge;

public class Square extends AbstractShape {
    public Square(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        String format = "use %s to draw square";
        System.out.println(String.format(format, this.color.getColor()));
    }
}
