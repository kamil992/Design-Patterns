package fluentBuilder.classicBuilder;

import fluentBuilder.classicBuilder.objects.Bike;

public interface BikeBuilder {

    public void buildModel();
    public void buildWheels();
    public void buildGears();

    public Bike getBike();
}
