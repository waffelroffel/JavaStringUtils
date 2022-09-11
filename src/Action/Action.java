package Action;

public abstract class Action<T> implements IAction<T> {
    protected String input = "";
    protected T output = null;

    @Override
    public void setInput(String input) {
        if (input == null) throw new IllegalArgumentException("input is null");
        this.input = input;
    }

    @Override
    public T getOutput() {
        if (output == null) throw new IllegalStateException("execute not called, output=null");
        return output;
    }
}
