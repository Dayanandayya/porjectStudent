import java.util.ArrayList;
import java.util.List;
public class course {
    
    private String courseName;
    private List<student> students;

    public course( String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public void addStudent(student student) {
        this.students.add(student);
    }

    public List<student> getStudents() {
        return students;
    }

    public String getCourseName() {
        return courseName;
    }
}