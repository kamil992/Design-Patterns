package decorator;

public class Employee implements Statusable {

    private String status;
    private int practise;
    private double monthlySalary;
    private double bonus;
    private boolean peopleManagement;

    public Employee(String status, int practise, double monthlySalary, double bonus, boolean peopleManagement){
        this.status = status;
        this.practise = practise;
        this.monthlySalary = monthlySalary;
        this.bonus = bonus;
        this.peopleManagement = peopleManagement;
    }

    public static Employee getStandardEmployee(){
        return new Employee("Employee", 1, 2000,0,false);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getPractise() {
        return practise;
    }

    public void setPractise(int practise) {
        this.practise = practise;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public boolean isPeopleManagement() {
        return peopleManagement;
    }

    public void setPeopleManagement(boolean peopleManagement) {
        this.peopleManagement = peopleManagement;
    }

    @Override
    public void printStatus() {
        System.out.println("Status: " + this.status);
        System.out.println("Practise years: " + this.practise);
        System.out.println("Monthly salary: " + this.monthlySalary);
        System.out.println("Bonus: " + this.bonus);
        System.out.println("People management: " + this.peopleManagement);
    }

    @Override
    public Employee getEmployee() {
        return this;
    }
}
