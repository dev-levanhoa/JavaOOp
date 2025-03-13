import java.util.ArrayList;
import java.util.List;
class Course {
    private String name;
    private List<String> students;
    private int numberOfStudents;

    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.numberOfStudents = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addStudent(String studentName) {
        students.add(studentName);
        numberOfStudents++;
    }

    public List<String> getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }
}
public class Bai18 {
    public static void main(String[] args) {
        // Tạo hai đối tượng Course
        Course course1 = new Course("Lập trình Java");
        Course course2 = new Course("Cấu trúc dữ liệu và giải thuật");

        // Thêm sinh viên vào các khóa học
        course1.addStudent("Nguyễn Văn A");
        course1.addStudent("Trần Thị B");
        course2.addStudent("Lê Văn C");
        course2.addStudent("Phạm Thị D");
        course2.addStudent("Hoàng Anh E");

        // Hiển thị thông tin khóa học 1
        System.out.println("Khóa học: " + course1.getName());
        System.out.println("Số lượng sinh viên: " + course1.getNumberOfStudents());
        System.out.println("Danh sách sinh viên: " + course1.getStudents());

        // Hiển thị thông tin khóa học 2
        System.out.println("\nKhóa học: " + course2.getName());
        System.out.println("Số lượng sinh viên: " + course2.getNumberOfStudents());
        System.out.println("Danh sách sinh viên: " + course2.getStudents());
    }
}