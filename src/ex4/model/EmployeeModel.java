package ex4.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
            employee.setEarning(employee.getSalary());
        } else {
            employee.setEarning((employee.getSalary()-11000000)* 0.9 + 11000000);
        }
    }
    public void searchBySalary(ArrayList<Employee> employees, Scanner sc){
        System.out.println(" enter salary:");
        int sumCheck = 0;
        for (Employee employee: employees){
            if (employee.getSalary() == Integer.parseInt(sc.nextLine())){
                System.out.println(employee);
                sumCheck ++;
            }
        }
        if (sumCheck == 0){
            System.out.println("key error");
        }
    }

    public void sortByName(ArrayList<Employee> employees){
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }
    public void sortByEarning(ArrayList<Employee> employees){
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (o1.getEarning() < o2.getEarning()) ?1:-1;
            }
        });
    }
}
