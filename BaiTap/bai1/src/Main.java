import ra.dev.Circle;
import ra.dev.Cylinder;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle("red",3.5);
        System.out.println(circle);

        Cylinder cylinder = new Cylinder("red",3.5,215);
        System.out.println("cylinder la "+ cylinder);
    }
}