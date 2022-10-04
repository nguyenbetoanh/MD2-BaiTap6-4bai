package ra.dev;

public class MovablePoint extends Point {
    private float xSpeed;
    private  float ySpeed;

    public MovablePoint() {
        this.xSpeed=0.0f;
        this.ySpeed=0.0f;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }


    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public float[] getSpeed(){
        float [] arr2={this.xSpeed,this.ySpeed};
        return arr2;
    }

    @Override
    public String toString() {
        return "MovablePoint  { \n" +
                " xSpeed = " + this.getX() +
                ", ySpeed =" + getY() +
                "     \n ("+"x , y"+")Speed"+"="+"( "+super.getX()+ ", "+super.getY()+" )\n"+
                '}';
    }
    public MovablePoint move(){
        this.setX(this.getX()+this.xSpeed);
        this.setY(this.getY()+this.ySpeed);
        return this;
    }
    public float tich(){
        return super.getX()*5;
    }
}
