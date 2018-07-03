package strategy;

public class MultiplyNumbers implements Strategy {
    @Override
    public void doSomething(int a, int b) {
        int result = a * b;
        System.out.println(a + " * " + b + " = " + result);
    }
}
