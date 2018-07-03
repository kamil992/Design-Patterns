package decorator;

public abstract class AbstractEmployeeDecorator implements Statusable  {
    protected Employee employee;

    public AbstractEmployeeDecorator(Employee employee){
        this.employee = employee;
    }

    @Override
    public Employee getEmployee() {
        return employee;
    }
}
