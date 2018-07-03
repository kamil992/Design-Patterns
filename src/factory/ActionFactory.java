package factory;

public class ActionFactory {

    public Action getAction(String action){
        if(action == null)
            return null;

        if(action.equalsIgnoreCase("Power")) {
            return new Power();
        }

        if(action.equalsIgnoreCase("Root")) {
            return new Root();
        }

        return null;
    }
}
