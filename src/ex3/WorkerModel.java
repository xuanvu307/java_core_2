package ex3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class WorkerModel {
    public Worker inputWorker(Scanner sc){
        Worker worker = new Worker();
        System.out.println("enter id: ");
        worker.setIdWorker(sc.nextLine());
        System.out.println("enter name: ");
        worker.setName(sc.nextLine());
        System.out.println("enter age: ");
        worker.setAge(sc.nextInt());
        System.out.println("enter salary: ");
        worker.setSalary(sc.nextDouble());
        System.out.println("enter work location: ");
        sc.nextLine();
        worker.setWorkPlace(sc.nextLine());
        return worker;
    }

    public void upSalary(ArrayList<Worker> workers, Scanner sc){
        System.out.println("enter id worker: ");
        int check = 0;
        String checkId = sc.nextLine();
        for (Worker worker: workers){
            if (checkId.equals(worker.getIdWorker())){
                System.out.println("enter number plus salary: ");
                double plusSalary = Double.parseDouble(sc.nextLine());
                double newSalary = worker.getSalary()+plusSalary;
                worker.setSalary(newSalary);
                worker.setStatus("UP");
                worker.setDate(LocalDate.now());
                check ++;
            }
        }
        if (check == 0){
            System.out.println("wrong id");
        }
    }

    public void downSalary(ArrayList<Worker> workers, Scanner sc){
        System.out.println("enter id worker: ");
        int check = 0;
        String checkId = sc.nextLine();
        for (Worker worker: workers){
            if (checkId.equals(worker.getIdWorker())){
                System.out.println("enter number minus salary: ");
                double minusSalary = Double.parseDouble(sc.nextLine());
                double newSalary = worker.getSalary()-minusSalary;
                worker.setSalary(newSalary);
                worker.setStatus("DOWN");
                worker.setDate(LocalDate.now());
                check++;
            }
        }
        if (check == 0){
            System.out.println("wrong id");
        }
    }
}
