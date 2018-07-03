package nullObject;

public class NullEmployee implements EmployeeWorks {


    NullEmployee(){ }

    @Override
    public boolean isWorking() {
        return false;
    }

    @Override
    public String getPossition() {
        return "There is no Enmployee";
    }

    @Override
    public String toString() {
        return this.name;
    }
}
