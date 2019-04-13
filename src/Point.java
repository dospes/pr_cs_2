import java.lang.Math;

public class Point {

    private int x, y;

    Point() {
    }
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    int getX(){
        return x;
    }
    int getY(){
        return y;
    }
    void setX(int x){
        this.x = x;
    }
    void setY(int y){
        this.y = y;
    }
    public void printCurrentPosition() {
        System.out.println(getX());
        System.out.println(getY());
    }
    void moveBy(int dx, int dy) {
        setX(getX() + dx);
        setY(getY() + dy);
    }
    double getDistance(Point p) {
        int deltaX = p.getX() - getX();
        int deltaY = p.getY() - getY();

        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    /*
    public static void main(String [ ] args){

        Point point1 = new Point();
        point1.setX(2);
        point1.setY(12);

        Point point2 = new Point();
        point2.setX(3);
        point2.setY(5);

        point1.printCurrentPosition();
        System.out.println(point1.getDistance(point2));
    }
    */
}