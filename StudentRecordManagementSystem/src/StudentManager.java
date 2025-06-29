import java.util.LinkedList;
import  java.util.Scanner;

public class StudentManager {
    private LinkedList<Student> studentList = new LinkedList<>();

    //Adding new Student
    public void addStudent(Scanner sc){
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        System.out.print("Enter Student Name: ");
        String name = sc.next();
        System.out.print("Enter Student Branch: ");
        String branch = sc.next();
        System.out.print("Enter Student Marks: ");
        double marks = sc.nextDouble();

        studentList.add(new Student(id,name,branch,marks));

        System.out.println("Student added successfully!");
    }

    //Viewing student record
    public void viewStudent(){
        if(studentList.isEmpty()){
            System.out.println("NO RECORD FOUND!");
            return;
        }
        for (Student s : studentList){
            System.out.println(s);
        }
    }

    //Deleting student record
    public void deleteStudent(Scanner sc){
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();

        for(Student s : studentList){
            if(s.getId() == id){
                studentList.remove(s);
                System.out.println("Deleted Successfully!");
                return;
            }
            System.out.println("Invalid ID!");
        }
    }

    //Updating student record
    public void updateStudent(Scanner sc){
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        for(Student s : studentList){
            if(s.getId() != id){
                System.out.println("Invalid ID!");
                return;
            }
            System.out.print("Enter new name: ");
            String name = sc.next();
            s.setName(name);
            System.out.print("Enter new branch: ");
            String branch = sc.next();
            s.setBranch(branch);
            System.out.print("Enter new marks: ");
            double marks = sc.nextDouble();
            s.setMarks(marks);

            System.out.println("Updated Successfully!");
        }

    }

}
