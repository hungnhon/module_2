
package ss5;

public class Access_modifier {

    private double radius = 1.0;
    private String color = "red";

    public Access_modifier() {
    }

    public Access_modifier(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
