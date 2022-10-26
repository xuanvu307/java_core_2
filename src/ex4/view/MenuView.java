package ex4.view;

public class MenuView {
    public void homeMenu(){
        System.out.println("************ MENU ************");
        System.out.println("1. Input or output list Employee");
        System.out.println("2. Delete or edit employee");
        System.out.println("3. Search by salary");
        System.out.println("4. Sort by name and salary");
        System.out.println("5. Top 5 salary");
        System.out.println("0. Exit");
    }

    public void inputOrOutput(){
        System.out.println("===== Menu =====");
        System.out.println("1. input");
        System.out.println("2. output");
    }

    public void edit(){
        System.out.println("===== Menu =====");
        System.out.println("1. delete");
        System.out.println("2. edit");
    }
    public void input(){
        System.out.println("===== Menu =====");
        System.out.println("1. input employee");
        System.out.println("2. input manager");
        System.out.println("3. input marketing");
    }
    public void chooseEdit(){
        System.out.println("===== Menu =====");
        System.out.println("1. edit name");
        System.out.println("2. edit salary");
    }

    public  void sort(){
        System.out.println("===== Menu =====");
        System.out.println("1. sort by name");
        System.out.println("2. sort by earning");
    }

}
