package nullObject;

public class Employee implements EmployeeWorks {

    private String name;

    public Employee(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public boolean isWorking() {
        return true;
    }

    @Override
    public String getPossition() {
        return  "My name is " + name + " and I am worker.";
    }

    @Override
    public String toString() {
        return this.name;
    }
}
