package CommandPattern;

public class CalculatorForm {
    private AbstractCommand command;

    public void setCommand(AbstractCommand command) {
        this.command = command;
    }

    public int compute(int a, int b) {
        if (command != null) {
            return command.execute(a, b);
        }
        throw new IllegalStateException("命令未设置！");
    }
}