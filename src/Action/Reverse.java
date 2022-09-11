package Action;

public class Reverse extends Action<String> {
    @Override
    public void execute() {
        output = new StringBuilder(input).reverse().toString();
    }
}
