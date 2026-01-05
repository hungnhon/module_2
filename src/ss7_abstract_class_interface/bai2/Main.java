package ss7_abstract_class_interface.bai2;

public class Main {
    public static void main(String[] args) {

        Object[] shapes = {
                new Circle(3),
                new Rectangle(2, 5),
                new Square(4)
        };

        for (Object shape : shapes) {
            inDienTich(shape);

            if (shape instanceof Colorable) {
                ((Colorable) shape).howToColor();
            }

            System.out.println("-------------------------");
        }
    }

    public static void inDienTich(Object shape) {
        if (shape instanceof Circle) {
            System.out.println("Diện tích hình tròn: "
                    + ((Circle) shape).getArea());
        } else if (shape instanceof Rectangle) {
            System.out.println("Diện tích hình chữ nhật: "
                    + ((Rectangle) shape).getArea());
        } else if (shape instanceof Square) {
            System.out.println("Diện tích hình vuông: "
                    + ((Square) shape).getArea());
        }
    }
}
