package ex4.model;

import java.util.Scanner;

public class UserMarketingModel {
    EmployeeModel employeeModel = new EmployeeModel();
    public UserMarketing inputUserMarketing(Scanner sc){
        Employee employee = employeeModel.inputEmployee(sc);
        System.out.println("enter number sales: ");
        int numberSales = Integer.parseInt(sc.nextLine());
        System.out.println("enter number percent: ");
        double percentNumber = Double.parseDouble(sc.nextLine());
        UserMarketing userMarketing = new UserMarketing(employee,numberSales,percentNumber);
        return  userMarketing;
    }

    public void earning(UserMarketing userMarketing){
        double totalSalary = userMarketing.getSalary()+userMarketing.getNumberSales()+userMarketing.getNumberPercent();
        if (totalSalary < 11000000){
            userMarketing.setEarning(totalSalary);
        } else {
            userMarketing.setEarning((totalSalary-11000000)* 0.9 + 11000000);
        }
    }
}
