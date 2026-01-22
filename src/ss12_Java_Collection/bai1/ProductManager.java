package ss12_Java_Collection.bai1;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class ProductManager {
//private List<Product>produts=new ArrayList<>();
private List<Product>products=new LinkedList<>();
public void add(Product p){
    products.add(p);
    System.out.println("đã thêm " + p);
}
public void dipslay(){
    if(products.isEmpty()){
        System.out.println("danh sách trống");
        return;
    }
    for(Product p:products){
        System.out.println(" hiển thị danh sách cần tìm" + p);
    }
}
public void updateById(int id,String newname,double newprince){
    for(Product p : products) {
        if (p.getId() == id) {
            p.setName(newname);
            p.setPrince(newprince);
            System.out.println("đã sữa xong theo id" + id);
            return;
        }
    }
        System.out.println("không tìm thấy id" + id);

}
public void removeById(int id){
    for(int i=0;i<products.size();i++) {
        if (products.get(i).getId() == id) {
            products.remove(i);
            System.out.println("đã xóa phần tử id" + id);
            return;
        }
    }
        System.out.println("không tim tấy phần tử id" + id);

}

}
