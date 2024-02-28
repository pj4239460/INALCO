import java.util.Scanner;
//Assurez-vous d'avoir importé java.util.Scanner pour lire l'entrée de l'utilisateur.

public class Main {
    private static School mySchool = new School();
    private static Scanner scanner = new Scanner(System.in);
    //N'oubliez pas de fermer le scanner (scanner.close()) à la fin du programme pour éviter les fuites de ressources. 
    //Dans cet exemple, le scanner n'est pas fermé car il est utilisé tout au long de l'exécution du programme.


    public static void main(String[] args) {

        boolean continueRunning = true;

        while (continueRunning) {
            System.out.println("Choose an option:");
            System.out.println("1. Add a student");
            System.out.println("2. Add a teacher");
            System.out.println("3. Show students");
            System.out.println("4. Show teachers");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();//Nettoyer le buffer

            switch (choice) {
                case 1:
                    addStudentFromInput();
                    break;
                case 2:
                    addTeacherFromInput();
                    break;
                case 3:
                    mySchool.printStudents();
                    break;
                case 4:
                    mySchool.printTeachers();
                    break;
                case 5:
                    continueRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");

            }
        }
    }

    private static void addStudentFromInput() {
        System.out.println("Enter the student's name:");
        String name = scanner.nextLine();

        System.out.println("Enter the student's age:");
        int age = scanner.nextInt();
        scanner.nextLine();//Nettoyer le buffer

        Student student = new Student(name, age);
        mySchool.addStudent(student);
        System.out.println("Student added: " + student);

    }

    private static void addTeacherFromInput() {
        System.out.println("Enter the teacher's name:");
        String name = scanner.nextLine();

        System.out.println("Enter the subject taught:");
        String subject = scanner.nextLine();


        Teacher teacher = new Teacher(name, subject);
        mySchool.addTeacher(teacher);
        System.out.println("Teacher added: " + teacher);
    }
}