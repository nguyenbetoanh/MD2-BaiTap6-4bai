package ra.dev;

public class Circle {
    private String color;
    private double radius;

    public Circle() {
    }

    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI*Math.pow(radius,2);
    }

    public String toString(){
        return
                "A Shape with color of "
                        + getColor()
                        + " and dien tich hinh tron la"
                        + getArea();
    }
    }
