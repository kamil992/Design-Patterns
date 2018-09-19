package template;

public abstract class Calculator {

    public abstract double[] getData();
    public abstract void calculateData();


    public void calculate() {

        this.getData();

        this.calculateData();

    }
}
