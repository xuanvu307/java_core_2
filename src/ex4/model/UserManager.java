package ex4.model;

public class UserManager extends Employee{
    private double responsibleSalary;
    private double earning;

    public UserManager(Employee employee, double responsibleSalary) {
        super(employee.getIdUser(), employee.getName(), employee.getSalary());
        this.responsibleSalary = responsibleSalary;
    }

    public double getResponsibleSalary() {
        return responsibleSalary;
    }

    public void setResponsibleSalary(double responsibleSalary) {
        this.responsibleSalary = responsibleSalary;
    }

    public double getEarning() {
        return earning;
    }

    public void setEarning(double earning) {
        this.earning = earning;
    }

    @Override
    public String toString() {
        return "UserManager{" +
                "responsibleSalary=" + responsibleSalary +
                "} " + super.toString();
    }
}
