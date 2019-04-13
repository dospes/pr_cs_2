import java.awt.Color;

public class Rectangle {

    private Point position;
    private int length, width;
    private String label;
    private Color color;

    public Rectangle() {}
    public Rectangle(Point position, int width, int length, String label, Color color) throws Exception {
        this.position = position;
        this.width = width;
        this.length = length;
        this.label = label;
        if(color.equals(Color.WHITE)){
            throw new Exception("Color cannot be white!");
        } else {
            this.color = color;
        }
    }

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) throws Exception {
        if(color.equals(Color.WHITE)){
            throw new Exception("Color cannot be white!");
        } else {
            this.color = color;
        }
    }

    void moveBy(int dx, int dy) {
        position.moveBy(dx, dy);
    }
    void moveBy(Point point) {
        position.moveBy(point.getX(), point.getY());
    }

    void printAttributes() {
        System.out.println(position);
        System.out.println(length);
        System.out.println(width);
        System.out.println(label);
        System.out.println(color);
    }
}
