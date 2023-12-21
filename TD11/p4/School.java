import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Student> students = new ArrayList<>();
    private List<Teacher> teachers = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void printStudents() {
        System.out.println("Students:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void printTeachers() {
        System.out.println("Teachers:");
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }
}