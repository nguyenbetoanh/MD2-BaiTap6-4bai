import ra.dev.Shape;
import ra.dev.Triangle;

public class Main {
    public static void main(String[] args) {

        Shape shape= new Shape("red",true);
        System.out.println("shape là !"+shape);

        Triangle triangle =new Triangle("red",true,13,0,14);
        System.out.println("day la triangle: "+triangle);

        System.out.println("chu vi triangle: "+ triangle.getPerimeter());
        System.out.println("dien tich triangle: "+ triangle.areaTriangle());
    }
}