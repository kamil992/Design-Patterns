package fluentBuilder.classicBuilder;

import fluentBuilder.classicBuilder.objects.Bike;

public class Client {
    public static void main(String[] args) {
        BikeBuilder bikeBuilder = new CityBike();
        Director director = new Director(bikeBuilder);

        director.makeBike();

        Bike cityBike = director.getBike();
        System.out.println(cityBike);
    }
}
