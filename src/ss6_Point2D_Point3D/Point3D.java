package ss6_Point2D_Point3D;

public class Point3D extends Point2D{

//    Kế thừa Point2D
//
//    Thuộc tính:
//
//    z : float = 0.0f
//
//    Constructor:
//
//    Point3D()
//
//    Point3D(x, y, z)
//
//    Method:
//
//    getZ()
//
//    setZ(z)
//
//    setXYZ(x, y, z)
//
//    getXYZ() : float[3]
//
//    toString() → "(x,y,z)"


private float z=0.0f;

public Point3D(){
}
public Point3D(float x,float y,float z){
    super(x,y);
    this.z=z;
}
    public void setXYZ(float x, float y, float z) {
        setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[]{getX(), getY(), z};
    }

    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + "," + z + ")";
    }
}















