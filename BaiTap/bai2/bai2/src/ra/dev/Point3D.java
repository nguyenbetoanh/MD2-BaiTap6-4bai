package ra.dev;

public class Point3D extends Point2D{
    private float z;

    public Point3D() {
        this.z=0.0f;
    }

    public Point3D(float x,float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public float [] getXYZ(){
        float[] arr2={super.getX(),super.getY(),z};
        return arr2;
    }
    public void setXYZ(float x,float y,float z){
       super.setXY(x,y);
       this.z=z;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + super.getX() +
                ", y=" + super.getY() +
                "z=" + z +
                '}';
    }
}
