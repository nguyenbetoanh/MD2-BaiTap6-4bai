import ra.dev.Point2D;
import ra.dev.Point3D;

public class Main {
        public static void main(String[] args) {
            Point2D test1 = new Point2D(3,4);
            System.out.println(test1);
            System.out.println("x la"+test1.getX());
            System.out.println("y la"+test1.getY());
            Point3D test2;
            test2 = new Point3D(6, 5, 6);
            System.out.println(test2);
        }
    }

