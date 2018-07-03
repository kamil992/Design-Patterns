package strategy;

public class Main {
    public static void main(String[] args) {

        Context context = new Context(new AddNumbers());
        context.execute(7,8);
    }
}
