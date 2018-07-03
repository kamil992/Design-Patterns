package factory;

public class Power implements Action {

    @Override
    public double calculate(double a, double b) {
        return Math.pow(a, b);
    }
}
