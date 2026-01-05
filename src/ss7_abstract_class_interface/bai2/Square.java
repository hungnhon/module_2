package ss7_abstract_class_interface.bai2;

public class Square implements Colorable {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    @Override
    public void howToColor() {
        System.out.println("Tô màu tất cả bốn cạnh.");
    }
}