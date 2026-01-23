package ss15_Exception;

public class IllegalTriangleException extends Exception {

    public IllegalTriangleException(double c1, double c2, double c3) {
        super("Tam giác KHÔNG hợp lệ với các cạnh: "
                + c1 + ", " + c2 + ", " + c3);
    }
}
