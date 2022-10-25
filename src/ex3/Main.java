package ex3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WorkerModel workerModel = new WorkerModel();
        View view = new View();
        ArrayList<Worker> workers = new ArrayList<>();


        int chooseNumber = 0;
        do{
            view.homeView();
            chooseNumber = Integer.parseInt(sc.nextLine());
            switch (chooseNumber){
                case 1:
                    Worker worker = workerModel.inputWorker(sc);
                    workers.add(worker);
                    break;
                case 2:
                    workerModel.upSalary(workers,sc);
                    break;
                case 3:
                    workerModel.downSalary(workers, sc);
                    break;
                case 4:
                    System.out.println("Code        Name      Age     Salary       Status     Date");
                    for (Worker aWorker: workers){
                        System.out.println(aWorker);
                    }
                    break;
                case 5:
                    System.out.println("Exit");
                    chooseNumber = 0;
            }
        } while (chooseNumber != 0);
    }
}
