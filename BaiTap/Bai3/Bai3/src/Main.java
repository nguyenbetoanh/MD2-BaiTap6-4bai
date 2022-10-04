import ra.dev.MovablePoint;
import ra.dev.Point;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(5,6);


        MovablePoint movablePoint=new MovablePoint(point.getX(), point.getY(),5,5);
        System.out.println("-------------tich la____________"+ movablePoint.tich());
        System.out.println("MovablePoint la : "+movablePoint.getX()+"--------------"+movablePoint.getY());
        System.out.println("------------point cu truoc di chuyen-------------"+point);
        System.out.println("van toc la"+movablePoint.move());
        System.out.println("------------point cu sau di chuyen-------------"+point);

    }
}