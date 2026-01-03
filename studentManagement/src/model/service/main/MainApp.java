package model.service.main;

import model.service.StudentService;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        StudentService service = new StudentService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n---- STUDENT MANAGEMENT ----");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    service.addStudent();
                    break;
                case 2:
                    service.viewStudents();
                    break;
                case 3:
                    service.searchStudent();
                    break;
                case 4:
                    service.updateStudent();
                    break;
                case 5:
                    service.deleteStudent();
                    break;
                case 6:
                    System.out.println("Thank you!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
       
    }
}
