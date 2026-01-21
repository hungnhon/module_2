package ss10.bai_1;
import java.util.ArrayList;
public class StudentManager {
   private ArrayList<Student> students = new ArrayList<>();
  public void  addStudent(Student s){
students.add(s);
      System.out.println("đã thêm" + s);
    }
    public void dipslay(){
if(students.size()==0){
    System.out.println("danh sách trống");
    return;
}

    System.out.println("danh sách sinh viên là");
    for(Student s:students){
        System.out.println(s);

}
    }
    public void updateById(int id,String newname,int newage){
      for(Student s : students){
          if(s.getId()==id){
              s.setName(newname);
              s.setAge(newage);
              System.out.println("đã cập nhât sinh viên theo id" + id);
              return;
          }
          System.out.println("không tìm thấy sinh viên theo id" + id);
      }
    }
    public void removeById(int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.remove(i);
                System.out.println("đã xóa sinh viên id" + id);
                return;
            }
        }
        System.out.println("không tim thấy sinh viên có id" + id);
    }
    public int size(){
      int count = students.size();
        System.out.println("số lượng sinh viên còn lại là " + count);
        return count ;
    }
public boolean isEmpty(){
      if(students.size()==0){
          System.out.println("danh sách hiện đang rổng");
          return true;
      }
    System.out.println("danh sách hiện tại không trống");
      return false ;
}

}
