package CommandPattern;

public class Client {
    public static void main(String[] args) {
        Adder adder = new Adder();

        AbstractCommand addCommand = new AddCommand(adder);

        CalculatorForm calculator = new CalculatorForm();
        calculator.setCommand(addCommand);

        int result = calculator.compute(5, 3);
        System.out.println("5 + 3 = " + result);

        result = calculator.compute(10, 20);
        System.out.println("10 + 20 = " + result);
    }
}