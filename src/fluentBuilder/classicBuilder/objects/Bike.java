package fluentBuilder.classicBuilder.objects;

public class Bike {
    private Model model;
    private Wheels wheels;
    private Gears gears;

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public void setWheels(Wheels wheels) {
        this.wheels = wheels;
    }

    public Gears getGears() {
        return gears;
    }

    public void setGears(Gears gears) {
        this.gears = gears;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "model=" + model +
                ", wheels=" + wheels +
                ", gears=" + gears +
                '}';
    }
}
