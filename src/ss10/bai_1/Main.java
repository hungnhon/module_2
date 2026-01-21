package ss10.bai_1;

public class Main {
    public static void main(String[] args) {
        StudentManager manager =new StudentManager();
        Student s1 = new Student(30,1,"hùng");
        Student s2 = new Student (22,2,"nhung");
        Student s3 = new Student(15,3,"tuýet");

        manager.addStudent(s1);
        manager.addStudent(s2);
        manager.addStudent(s3);
        manager.dipslay();

        manager.updateById(2,"bình",23);
        manager.dipslay();

        manager.removeById(1);
        manager.dipslay();

    }
}
