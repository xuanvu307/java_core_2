package ex4.model;

import java.util.Scanner;

public class UserManagerModel {
    EmployeeModel employeeModel = new EmployeeModel();
    public UserManager inputUserManager(Scanner sc){
        Employee employee = employeeModel.inputEmployee(sc);
        System.out.println("enter responsible salary : ");
        double responsibleSalary = Double.parseDouble(sc.nextLine());
        UserManager userManager = new UserManager(employee,responsibleSalary);
        return userManager;
    }
    public void earning(UserManager userManager){
        double totalSalary = userManager.getSalary()+ userManager.getResponsibleSalary();
        if (totalSalary < 11000000){
            userManager.setEarning(totalSalary);
        } else {
            userManager.setEarning((totalSalary - 11000000) * 0.9 + 11000000);
        }
    }
}
