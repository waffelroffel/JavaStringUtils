package Action;

public class RemoveWhitespace extends Action<String> {
    @Override
    public void execute() {
        output = input.replaceAll("\\s", "");
    }
}
