package ex4.control;

import ex4.model.*;
import ex4.view.MenuView;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();
        EmployeeModel employeeModel = new EmployeeModel();
        UserManagerModel userManagerModel = new UserManagerModel();
        UserMarketingModel userMarketingModel = new UserMarketingModel();
        MenuView menuView = new MenuView();

        int chooseNumber = 0;
        do {
            menuView.homeMenu();
            chooseNumber = Integer.parseInt(sc.nextLine());
            switch (chooseNumber){
                case 1:
                    menuView.inputOrOutput();
                    chooseNumber = Integer.parseInt(sc.nextLine());
                    if (chooseNumber == 1 ){
                        menuView.input();
                        chooseNumber = Integer.parseInt(sc.nextLine());
                        switch (chooseNumber){
                            case 1:
                                Employee employee = employeeModel.inputEmployee(sc);
                                employeeModel.earning(employee);
                                employees.add(employee);
                                break;
                            case 2:
                                UserManager manager = userManagerModel.inputUserManager(sc);
                                userManagerModel.earning(manager);
                                employees.add(manager);
                                break;
                            case 3:
                                UserMarketing marketing = userMarketingModel.inputUserMarketing(sc);
                                userMarketingModel.earning(marketing);
                                employees.add(marketing);
                                break;

                        }
                    } else {
                        System.out.println(employees);
                    }
                    break;
                case 2:
                    int numberCheck = 0;
                    System.out.println(" enter id: ");
                    int idCheck = Integer.parseInt(sc.nextLine());
                    for (Employee employee: employees){
                        if (idCheck == employee.getIdUser()){
                            menuView.edit();
                            int check = Integer.parseInt(sc.nextLine());
                            switch (check){
                                case 1:
                                    employees.remove(employee);
                                    break;
                                case 2:
                                    menuView.chooseEdit();
                                    check = Integer.parseInt(sc.nextLine());
                                    if (check == 1){
                                        System.out.println("new name");
                                        employee.setName(sc.nextLine());
                                    } else {
                                        System.out.println("new salary");
                                        double newSalary = Double.parseDouble(sc.nextLine());
                                        employee.setSalary(newSalary);
                                        employeeModel.earning(employee);
//                                        employee.setEarning();
                                    }
                            }
                            numberCheck ++;
                        }
                    }
                    if (numberCheck == 0){
                        System.out.println("wrong id: ");
                    }
                    break;
                case 3:
                    employeeModel.searchBySalary(employees, sc);
                    break;
                case 4:
                    menuView.sort();
                    numberCheck = Integer.parseInt(sc.nextLine());
                    switch (numberCheck){
                        case 1:
                            employeeModel.sortByName(employees);
                            break;
                        case 2:
                            employeeModel.sortByEarning(employees);
                            break;
                    }
                    break;
                case 5:
                    employeeModel.sortByEarning(employees);
                    for (int i = 0; i <5 ; i++){
                        employees.toString();
                    }
                    break;
                case 0:
                    System.out.println("exit");
            }
        } while (chooseNumber !=0);
    }
}
