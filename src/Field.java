import java.util.*;

public class Field {

    static int WIDTH = 1000;
    static int LENGTH = 1000;

    public Field() {
    }

    Point[] inputPoints() {

        Point origin = new Point(0, 0);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the number of points: ");
        Point[] coordinates = new Point[scanner.nextInt() + 1];
        coordinates[0] = origin;

        for (int i = 0; i < coordinates.length; i++){

            Point coordinate = new Point();

            System.out.print("Please enter the x-coordinate: ");
            coordinate.setX(scanner.nextInt());
            System.out.print("Please enter the y-coordinate: ");
            coordinate.setY(scanner.nextInt());

            if((coordinate.getX() >= 0)&&(coordinate.getX() <= 1000)&&(coordinate.getY() >= 0)&&(coordinate.getY() <= 1000)){
                coordinates[i] = coordinate;
            } else {
                System.out.println("Entered coordinate is not within range (1000*1000). Please try again.");
                i--;
            }
        }
        return coordinates;
    }

    void sortPOI(){

        Point[] coordinates = inputPoints();

        for(int i = 0; i < coordinates.length - 1; i++) {

            Point currentPoint = coordinates[i];
            int closestPointIndex = i + 1;

            for(int j = i; j < coordinates.length; j++) {
                if (currentPoint.getDistance(coordinates[j]) < currentPoint.getDistance(coordinates[closestPointIndex])) {
                    closestPointIndex = j;
                }
            }

            Point temp = coordinates[i + 1];
            coordinates[i + 1] = coordinates[closestPointIndex];
            coordinates[closestPointIndex] = temp;
        }

        //TODO: "Abschließendsollendie Punkte und diejeweiligen euklidischen Abständeauf der Konsole ausgegeben werden."
    }
}
