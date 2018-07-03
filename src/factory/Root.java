package factory;

public class Root implements Action {
    @Override
    public double calculate(double a, double b) {
        double result = a;
        double tmp = Math.pow(result, (b - 1));
        double e = 0.00000001;

        while (Math.abs(a - tmp * result) >= e) {
            result = (1 / b) * ((b - 1) * result + (a / tmp));
            tmp = Math.pow(result, b - 1);
        }
        if (a < 0 && b % 2 != 0)
            return 0 - result;
        else
            return result;
    }
}
