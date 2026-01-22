package ss12_Java_Collection.bai1;

public class Main {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        manager.add(new Product(1,15000000,"iphone"));
        manager.add(new Product(2,500000,"samsung"));
        manager.add(new Product(3,2000000,"nokia"));
        manager.dipslay();


        System.out.println("sữa theo id =2");
        manager.updateById(2,"lG",20000000);
        manager.dipslay();

        System.out.println("xóa theo id =1");
        manager.removeById(1);
        manager.dipslay();

    }
}
