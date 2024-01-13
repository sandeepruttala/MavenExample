package main;

import java.util.Scanner;
import controller.StudentController;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentController controller = new StudentController();
        int choice;
        while(true)
        {
            System.out.println("1. Add student records");
            System.out.println("2. Display student records");
            System.out.println("3. Update student records.");
            System.out.println("4. Delete student records");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("----------------------------------");
                    controller.createStudent();
                    System.out.println("----------------------------------");
                    break;
                case 2:
                    System.out.println("----------------------------------");
                    controller.readStudent();
                    System.out.println("----------------------------------");
                    break;
                case 3:
                    System.out.println("----------------------------------");
                    controller.updateStudent();
                    System.out.println("----------------------------------");
                    break;
                case 4:
                    System.out.println("----------------------------------");
                    controller.deleteStudent();
                    System.out.println("----------------------------------");
                    break;
                case 5:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }

        }

    }

}
