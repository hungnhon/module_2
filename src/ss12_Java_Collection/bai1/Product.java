package ss12_Java_Collection.bai1;

public class Product {
    private int id;
    private String name;
    private double prince;


    public Product(int id, double prince, String name) {
        this.id = id;
        this.prince = prince;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrince() {
        return prince;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrince(double prince) {
        this.prince = prince;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", prince=" + prince +
                '}';
    }
}
