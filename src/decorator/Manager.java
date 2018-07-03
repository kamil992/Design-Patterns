package decorator;

public class Manager extends AbstractEmployeeDecorator {

    public Manager(Statusable employee) {
        super(employee.getEmployee());
        markAsManager();
    }

    @Override
    public void printStatus() {
        employee.printStatus();
    }

    private void markAsManager(){
        employee.setStatus("Manager");
        employee.setPractise(8);
        employee.setMonthlySalary(4500);
        employee.setBonus(500);
        employee.setPeopleManagement(true);
    }
}
