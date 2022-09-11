package Action;

public interface IAction<T> {
    void execute();

    void setInput(String input);

    T getOutput();
}