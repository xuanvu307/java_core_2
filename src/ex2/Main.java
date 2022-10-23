package ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        StudentModel studentModel = new StudentModel();
        Scanner sc = new Scanner(System.in);

        int chooseNumber = 0;
        do {
            System.out.println("1. add student");
            System.out.println("2. print list student");
            System.out.println("3. percent classify list student");
            System.out.println("0. Exit");
            chooseNumber = Integer.parseInt(sc.nextLine());
            switch (chooseNumber){
                case 1:
                    Student student = studentModel.inputStudent(sc);
                    students.add(student);
                    break;
                case 2:
                    for (Student aStudent: students){
                        System.out.println(aStudent +",classify = \""+studentModel.classify(aStudent.getAvgScore())+"\"");
                    }
                    break;
                case 3:
                    int sumClassifyA = 0;
                    int sumClassifyB = 0;
                    int sumClassifyC = 0;
                    for (Student aStudent: students){
                        if (aStudent.getAvgScore() >= 8){
                            sumClassifyA++;
                        } else if (aStudent.getAvgScore() < 8 && aStudent.getAvgScore() >= 6.5){
                            sumClassifyB ++;
                        } else {
                            sumClassifyC++;
                        }
                    }
                    System.out.println(" percent A = " +(sumClassifyA*100/students.size()) + "%");
                    System.out.println(" percent B = " +(sumClassifyB*100/students.size()) + "%");
                    System.out.println(" percent C = " +(sumClassifyC*100/students.size()) + "%");
                    break;
                case 0 :
                    System.out.println("Exit");
            }
        } while (chooseNumber != 0);
    }
}
