package Action;

public class Capitalize extends Action<String> {
    @Override
    public void execute() {
        if (input.isEmpty()) output = "";
        else if (input.length() == 1) output = input.toUpperCase();
        else output = Character.toTitleCase(input.charAt(0)) + input.substring(1);
    }
}
