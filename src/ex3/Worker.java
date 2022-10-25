package ex3;

import java.time.LocalDate;

public class Worker {
    private String idWorker;
    private String name;
    private int age;
    private double salary;
    private String workPlace;
    private String status = "NO UPDATE";
    private LocalDate date = LocalDate.of(2022,01,01);

    public String getIdWorker() {
        return idWorker;
    }

    public void setIdWorker(String idWorker) {
        this.idWorker = idWorker;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return String.format(" %3s %10s %8d %10.1f %12s",idWorker,name,age,salary,status) +"\t"+date;
    }
}
