package ex4.model;

public class UserMarketing extends Employee{
    private int numberSales;
    private double numberPercent;

    public UserMarketing(Employee employee, double numberPercent) {
        super(employee.getIdUser(), employee.getName(), employee.getSalary());
        this.numberPercent = numberPercent;
    }

    public int getNumberSales() {
        return numberSales;
    }

    public void setNumberSales(int numberSales) {
        this.numberSales = numberSales;
    }

    public double getNumberPercent() {
        return numberPercent;
    }

    public void setNumberPercent(double numberPercent) {
        this.numberPercent = numberPercent;
    }

    @Override
    public String toString() {
        return "UserMarketing{" +
                "numberSales=" + numberSales +
                ", numberPercent=" + numberPercent +
                "} " + super.toString();
    }
}
