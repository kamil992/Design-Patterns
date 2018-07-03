package fluentBuilder.classicBuilder;

import fluentBuilder.classicBuilder.objects.Bike;
import fluentBuilder.classicBuilder.objects.Gears;
import fluentBuilder.classicBuilder.objects.Model;
import fluentBuilder.classicBuilder.objects.Wheels;

public class CityBike implements BikeBuilder {

    private Bike bike;

    public CityBike(){
        this.bike = new Bike();
    }


    @Override
    public void buildModel() {
        Model model = new Model();
        model.setModelName("City");

        bike.setModel(model);
    }

    @Override
    public void buildWheels() {
        Wheels wheels = new Wheels();
        wheels.setSize(28);

        bike.setWheels(wheels);
    }

    @Override
    public void buildGears() {
        Gears gears = new Gears();
        gears.setNumsOfGear(3);

        bike.setGears(gears);
    }

    @Override
    public Bike getBike() {
        return bike;
    }
}
