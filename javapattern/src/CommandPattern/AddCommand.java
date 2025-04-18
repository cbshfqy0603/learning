package CommandPattern;

public class AddCommand extends AbstractCommand {
    public AddCommand(Adder adder) {
        super(adder);
    }

    @Override
    public int execute(int a, int b) {
        return adder.add(a, b);
    }
}