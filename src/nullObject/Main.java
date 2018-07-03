package nullObject;

public class Main {
    public static void main(String[] args) {
/**
 * NullPointerException free code
 */
        String[] names = {"Bob", "John", "George"};

        System.out.println(getEmployee("Bob", names).getPossition());
        System.out.println(getEmployee("Somebody", names).getPossition());

    }

    public static EmployeeWorks getEmployee(String name, String[] names){
        for(int i = 0; i < names.length; i++){
            if(names[i].equalsIgnoreCase(name)){
                return new Employee(name);
            }
        }
        return new NullEmployee();
    }
}
