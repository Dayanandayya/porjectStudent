import java.util.ArrayList;
import java.util.List;

public class student {
    public int studentSem;
    public String studentName;
    public String studentDept;
    public int marks;
    public List<course> courses;

    public student(int studentSem, String studentName, String studentDept, int marks) {
        this.studentSem = studentSem;
        this.studentName = studentName;
        this.studentDept = studentDept;
        this.marks = marks;
        this.courses = new ArrayList<>();
    }

    public int getstudentSem() {
        return studentSem;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getstudentDept() {
        return studentDept;
    }

    public int getMarks() {
        return marks;
    }

    public void addCourse(course course) {
        this.courses.add(course);
    }

    public List<course> getCourses() {
        return courses;
    }
}
