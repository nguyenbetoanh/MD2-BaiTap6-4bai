package ra.dev;

public class Cylinder extends Circle{
    private double height;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(String color, double radius, double height) {
        super(color, radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getTheTich(){
        return super.getArea()*height;
    }
    public String toString(){
        return
                "A Shape with color of "
                        + getColor()
                        + " va the tich hinh tron la"
                        + getTheTich();
    }
}
