import java.util.List;

public class Main {
    public static void main(String[] args) {
        student student1 = new student(1, "Dayanad", "BCA", 90);
        student student2 = new student(4, "Akshay", "bca", 30);
        student student3 = new student(1, "Veeresh", "B.sc", 40);
        student student4 = new student(4, "shivaraj", "bca", 20);
        student student5 = new student(4, "Sourab", "bca", 60);

        course course1 = new course( "Dev_ops");
        course1.addStudent(student1);
        course1.addStudent(student3);

        course course2 = new course("C#");
        course2.addStudent(student2);
        course2.addStudent(student4);SSS
        course2.addStudent(student5);

        System.out.println("student Name\tstudentDept\t Sem\tCourses");
        for (student student : new student[]{student1, student2, student3, student4, student5}) {
            System.out.print(student.getStudentName() + "\t\t\t" + student.getstudentDept() + "\t\t\t "+student.getstudentSem()+"\t\t");
            for (course course : new course[]{course1, course2}) {
                if (course.getStudents().contains(student)) {
                    System.out.print(course.getCourseName());
                }
            }
            System.out.println();
        }
        System.out.println("\nStudents with marks less than 40");
        System.out.println("\nStudent Name\tMarks\tCourses");
        for (course course : new course[]{course1, course2}) {
            List<student> students = course.getStudents();
            for (student student : students) {
                if (student.getMarks() < 40) {
                    System.out.print(student.getStudentName() + "\t\t\t" + student.getMarks() + "\t\t");
                    System.out.print(course.getCourseName() + ", ");
                    System.out.println();
                }
            }
        }
    }
}
