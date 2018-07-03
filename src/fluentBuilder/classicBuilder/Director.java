package fluentBuilder.classicBuilder;

import fluentBuilder.classicBuilder.objects.Bike;

public class Director {
    private BikeBuilder bikeBuilder;

    public Director(BikeBuilder bikeBuilder){
        this.bikeBuilder = bikeBuilder;
    }

    public void makeBike(){
        bikeBuilder.buildModel();
        bikeBuilder.buildWheels();
        bikeBuilder.buildGears();
    }

    public Bike getBike(){
        return bikeBuilder.getBike();
    }

}
