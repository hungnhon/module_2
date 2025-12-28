package ss6_Point2D_Point3D;

public class Point2D {

/*
UML:
Point2D
- x: float
- y: float
+ Point2D()
+ Point2D(x,y)
+ getX()
+ getY()
+ toString()
*/

private float x= 0.0f;
private float y= 0.0f;
public Point2D(){
}
public Point2D(float x,float y){
    this.x= x;
    this.y=y;
}
public float getX(){
    return x;
}
public void setX(float x){
    this.x=x;
}
public float getY(){
    return y;
}
public void setY(float y){
    this.y=y;
}
public void setXY(float x,float y){
    this.x=x;
    this.y=y;
}
public float[] getXY() {
    return new float[] {x,y};
}
@Override
    public String toString(){
    return "(" + x + "," + y + ")";
}


}
