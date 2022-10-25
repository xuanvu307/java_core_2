package ex4.model;

public class Employee {
    private static int id = 1;
    private int idUser;
    private String name;
    private double salary;


    public Employee(int idUser, String name, double salary) {
        this.idUser = idUser;
        this.name = name;
        this.salary = salary;
    }

    public Employee() {

    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser() {
        this.idUser = id++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "idUser=" + idUser +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
