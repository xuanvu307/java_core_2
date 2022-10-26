package ex4.model;

public class UserMarketing extends Employee{
    private int numberSales;
    private double numberPercent;
    private double earning;


    public UserMarketing(Employee employee, int numberSales, double numberPercent) {
        super(employee.getIdUser(), employee.getName(), employee.getSalary());
        this.numberSales = numberSales;
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

    public double getEarning() {
        return earning;
    }

    public void setEarning(double earning) {
        this.earning = earning;
    }

    @Override
    public String toString() {
        return super.toString()+",UserMarketing : " +
                "numberSales = " + numberSales +
                ", numberPercent = " + numberPercent +
                ", earning = " + earning;
    }
}
