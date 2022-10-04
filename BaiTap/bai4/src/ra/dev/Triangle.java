package ra.dev;

public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double halfTriangle() {
        return (this.side1 + this.side2 + this.side3) / 2;
    }

    public double areaTriangle() {
        if (
                (this.side1 + this.side2) > this.side3 &&
                        (this.side1 + this.side3) > this.side2 &&
                        (this.side2 + this.side3) > this.side1
        ) {
            return Math.sqrt(halfTriangle() * (
                    (halfTriangle() - this.side1) *
                            (halfTriangle() - this.side2) *
                            (halfTriangle() - this.side3)
            ));
        } else
            return 0;


    }

    public double getPerimeter() {

        if (
                (this.side1 + this.side2) > this.side3 &&
                        (this.side1 + this.side3) > this.side2 &&
                        (this.side2 + this.side3) > this.side1
        ) {
            return this.side1 + this.side2 + this.side3;
        } else
            System.out.println("ko phai la 1 tam giac");
        return 0;

        }
    }

