package ss6_ke_thua;

public class Circle {
//
//UML
//  circle
//
//_ radius:double
//_color:String
//    ___________________________
//+circle()
//+circle(radius:double)
//+circle(radius:double,color:String)
//+getradius():double
//+setradius(radius:double):void
//+getcolor();String
//+setcolor(color:String):void
//+getArea():String
//+toString:String
//_____________________

private double radius=1.0;
private String color= "red";
public Circle() {
this.radius=1.0;
 this.color="red"    ;
}
public Circle(double radius){
    this.radius=radius;
    }

public Circle(double radius ,String color ){
    this.radius=radius;
    this.color=color;
}
public double getRadius(){
    return radius;
}
public void setRadius(double radius){
    this.radius=radius;
}
    public String getColor() {
        return color;
}
public void setColor(String color){
    this.color=color ;
}
public double getArea(){
    return Math.PI*radius*radius;
}


    @Override
    public String toString(){
    return "Cylinder:" + "radius=" + this.radius + ", color=" + this.color + ", Area=" + getArea() ;
}
}
