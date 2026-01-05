package ss7_abstract_class_interface.bai1;

public class Main {
    public static void main(String[] args) {

        Resizeable[] shapes = {
                new Circle(3),
                new Rectangle(2, 5),
                new Square(4)
        };

        double percent = 50;

        for (Resizeable s : shapes) {
            s.resize(percent);
        }
    }
}