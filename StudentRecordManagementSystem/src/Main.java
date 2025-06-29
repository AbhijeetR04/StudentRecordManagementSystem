import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();
        int choice;

        do{
            System.out.println("========== Student Record Management System ==========");
            System.out.println("1. Add Student.");
            System.out.println("2. View Student.");
            System.out.println("3. Update Student.");
            System.out.println("4. Delete Student.");
            System.out.println("5. Exit.");
            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();

            switch (choice){
                case 1 -> manager.addStudent(sc);
                case 2 -> manager.viewStudent();
                case 3 -> manager.updateStudent(sc);
                case 4 -> manager.deleteStudent(sc);
                case 5 -> System.out.println("Exiting!");
                default -> System.out.println("Invalid Choice!");
            }
        }while(choice != 5);
    }
}