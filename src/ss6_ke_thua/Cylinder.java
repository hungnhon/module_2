package ss6_ke_thua;

public class Cylinder extends Circle{

//UML      Cylinder
//
//_ height:double
//+Cylinder()
//+Cylinder(double radius,double heigh)
//+geghteight()
//+seghteight(double)
//+getvolume() :double
//+toString():String
private double height ;

public Cylinder(){
    super();
 this.height=1.0 ;

}
public Cylinder(double radius,double height){
    super(radius);
 this.height=height;
}
public double getheight(){
  return  height;
}
public void setheight(double height){
    this.height=height;
}
public double getvolume(){
    return getArea()*height;
}

@Override
    public String toString(){
    return "Cylinder:radius=" + getRadius() + ", height=" + height + ", volume=" + getvolume();
}

}
