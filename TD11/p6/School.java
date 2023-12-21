import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;
import java.io.IOException;
public class School {
    private List<Student> students = new ArrayList<>();
    private List<Teacher> teachers = new ArrayList<>();

    public void addStudent(Student student, boolean writeToFile) {
        students.add(student);
        if (writeToFile) {
            writeStudentToFile(student, "Student.txt");
        }
        
    }

    public void addTeacher(Teacher teacher, boolean writeToFile) {
        teachers.add(teacher);
        if (writeToFile) {
            writeTeacherToFile(teacher, "Teacher.txt");
        }
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

    private void writeStudentToFile(Student student, String filename) {
        String studentData = student.getName() + ", " + student.getAge();

        try (FileWriter writer = new FileWriter(filename, true)) {// true pour ajouter à la fin du fichier
            writer.write(studentData + System.lineSeparator());

        } catch (IOException e) {
            System.out.println("Erreur lors de l'écriture dans le fichier: " + e.getMessage());
        }
    }

    private void writeTeacherToFile(Teacher teacher, String filename) {
        String teacherData = teacher.getName() + ", " + teacher.getSubject();

        try (FileWriter writer = new FileWriter(filename, true)) {// true pour ajouter à la fin du fichier
            writer.write(teacherData + System.lineSeparator());

        } catch (IOException e) {
            System.out.println("Erreur lors de l'écriture dans le fichier: " + e.getMessage());
        }
    }
}