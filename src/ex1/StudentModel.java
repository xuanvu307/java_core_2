package ex1;

import java.util.Scanner;

public class StudentModel {
    public Student inputStudent(Scanner sc){
        Student student = new Student();
        System.out.println("enter name");
        String name = sc.nextLine();
        System.out.println("address");
        String address = sc.nextLine();
        student.setIdStudent();
        student.setName(name);
        student.setAddress(address);
        return student;
    }
}
