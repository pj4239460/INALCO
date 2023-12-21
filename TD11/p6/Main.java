import java.util.Scanner;
//Assurez-vous d'avoir importé java.util.Scanner pour lire l'entrée de l'utilisateur.
import java.io.File;
import java.io.FileNotFoundException;


public class Main {
    private static School mySchool = new School();
    private static Scanner scanner = new Scanner(System.in);
    //N'oubliez pas de fermer le scanner (scanner.close()) à la fin du programme pour éviter les fuites de ressources. 
    //Dans cet exemple, le scanner n'est pas fermé car il est utilisé tout au long de l'exécution du programme.
    private static Riddle riddle = new Riddle(scanner);

    public static void main(String[] args) {


        loadStudentsFromFile("Student.txt");
        loadTeachersFromFile("Teacher.txt");

        // mySchool.addStudent(new Student("Alice", 12));
        // mySchool.addStudent(new Student("Bob", 13));

        // mySchool.addTeacher(new Teacher("Mr. Smith", "Mathematics"));
        // mySchool.addTeacher(new Teacher("Mrs. Johnson", "English"));


        boolean continueRunning = true;

        while (continueRunning) {
            System.out.println("Choose an option:");
            System.out.println("1. Add a student");
            System.out.println("2. Add a teacher");
            System.out.println("3. Show students");
            System.out.println("4. Show teachers");
            System.out.println("5. Exit");
            System.out.println("6. Guessing game");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Nettoyer le buffer

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
                case 6:
                    riddle.presentRiddle();
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
        //Gérez les exceptions potentielles, par exemple, lorsque l'utilisateur entre un type de données incorrect.
        scanner.nextLine(); // Nettoyer le buffer

        Student student = new Student(name, age);
        mySchool.addStudent(student, true);
        System.out.println("Student added: " + student);
    }

    private static void addTeacherFromInput() {
        System.out.println("Enter the teacher's name:");
        String name = scanner.nextLine();

        System.out.println("Enter the subject taught:");
        String subject = scanner.nextLine();

        Teacher teacher = new Teacher(name, subject);
        mySchool.addTeacher(teacher, true);
        System.out.println("Teacher added: " + teacher);
    }

    private static void loadStudentsFromFile(String filename) {
        try (Scanner fileScanner = new Scanner(new File(filename))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(", ");
                if (parts.length == 2) {
                    String name = parts[0];
                    int age = Integer.parseInt(parts[1]);
                    mySchool.addStudent(new Student(name,age), false);
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Student file not found: " + filename);
        } catch (NumberFormatException e) {
            System.out.println("Invalid format in student file.");
        }
    }

    private static void loadTeachersFromFile(String filename) {
        try (Scanner fileScanner = new Scanner(new File(filename))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(", ");
                if (parts.length == 2) {
                    String name = parts[0];
                    String subject = parts[1];
                    mySchool.addTeacher(new Teacher(name, subject), false);
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Teacher file not found: " + filename);
        }
    }

}