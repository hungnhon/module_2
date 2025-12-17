package ss4_LopVaDoiTuong;
import java.util.Scanner;

public class XayDungLopQuadraticEquation {


    static class QuadraticEquation {


        private double a;
        private double b;
        private double c;

        public QuadraticEquation(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        // Getter
        public double getA() {
            return a;
        }

        public double getB() {
            return b;
        }

        public double getC() {
            return c;
        }


        public double getDiscriminant() {
            return b * b - 4 * a * c;
        }

        public double getRoot1() {
            double delta = getDiscriminant();
            if (delta >= 0) {
                return (-b + Math.sqrt(delta)) / (2 * a);
            }
            return 0;
        }


        public double getRoot2() {
            double delta = getDiscriminant();
            if (delta >= 0) {
                return (-b - Math.sqrt(delta)) / (2 * a);
            }
            return 0;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập a: ");
        double a = sc.nextDouble();

        System.out.print("Nhập b: ");
        double b = sc.nextDouble();

        System.out.print("Nhập c: ");
        double c = sc.nextDouble();


        QuadraticEquation equation = new QuadraticEquation(a, b, c);

        double delta = equation.getDiscriminant();

        if (delta > 0) {
            System.out.println("Phương trình có 2 nghiệm:");
            System.out.println("x1 = " + equation.getRoot1());
            System.out.println("x2 = " + equation.getRoot2());
        }
        else if (delta == 0) {
            System.out.println("Phương trình có 1 nghiệm:");
            System.out.println("x = " + equation.getRoot1());
        }
        else {
            System.out.println("The equation has no roots");
        }
    }
}
