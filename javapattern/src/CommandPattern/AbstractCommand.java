package CommandPattern;

public abstract class AbstractCommand {
    protected Adder adder;

    public AbstractCommand(Adder adder) {
        this.adder = adder;
    }

    public abstract int execute(int a, int b);
}