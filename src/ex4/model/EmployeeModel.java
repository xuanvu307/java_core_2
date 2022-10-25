package ex4.model;

import java.util.Scanner;

public class EmployeeModel {
    public Employee inputEmployee(Scanner sc){
        Employee employee = new Employee();
        System.out.println("enter name: ");
        String name = sc.nextLine();
        System.out.println("enter salary: ");
        double salary = Double.parseDouble(sc.nextLine());
        employee.setIdUser();
        employee.setName(name);
        employee.setSalary(salary);
        return employee;
    }

    public void earning(Employee employee){
        if (employee.getSalary() <11000000){
            employee.setSalary(employee.getSalary());
        } else {
            employee.setSalary((employee.getSalary()-11000000)* 0.9 + 11000000);
        }
    }
}
