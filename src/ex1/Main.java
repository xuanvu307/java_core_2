package ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        StudentModel studentModel = new StudentModel();


        String check = "y";
        while (check.equalsIgnoreCase("y")){
            Student student = studentModel.inputStudent(sc);
            students.add(student);
            System.out.println("do you want to continues y/n ");
            check = sc.nextLine();
        }
        System.out.println("list student :\n" +students);
    }
}
