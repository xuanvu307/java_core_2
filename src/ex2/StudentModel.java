package ex2;

import java.util.Scanner;

public class StudentModel {
    public Student inputStudent(Scanner sc){
        Student student = new Student();
        System.out.println("enter full name ");
        String fullName = sc.nextLine();
        System.out.println("score math");
        double scoreMath = Double.parseDouble(sc.nextLine());
        System.out.println("score physic");
        double scorePhysic = Double.parseDouble(sc.nextLine());
        System.out.println("score chemistry");
        double scoreChemistry = Double.parseDouble(sc.nextLine());
        double avgScore = (scoreMath+scorePhysic+scoreChemistry)/3;

        student.setIdStudent();
        student.setFullName(fullName);
        student.setScoreMath(scoreMath);
        student.setScorePhysic(scorePhysic);
        student.setScoreChemistry(scoreChemistry);
        student.setAvgScore(avgScore);
        return student;
    }

    public String classify(double avgScore){
        if (avgScore >= 8){
            return "A";
        } else if (avgScore < 8 && avgScore >= 6.5){
            return "B";
        } else {
            return "C";
        }
    }

}
