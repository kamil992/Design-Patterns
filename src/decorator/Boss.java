package decorator;

public class Boss extends AbstractEmployeeDecorator{


    public Boss(Statusable employee) {
        super(employee.getEmployee());
        markAsBoss();
    }

    @Override
    public void printStatus() {
        employee.printStatus();
    }

    public void markAsBoss(){
        employee.setStatus("Boss");
        employee.setPractise(20);
        employee.setMonthlySalary(20000);
        employee.setBonus(5000);
        employee.setPeopleManagement(true);
    }
}
