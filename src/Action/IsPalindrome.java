package Action;

public class IsPalindrome extends Action<Boolean> {
    @Override
    public void execute() {
        var lowerCase = input.toLowerCase();
        var reversed = new StringBuilder(lowerCase).reverse().toString();
        output = lowerCase.equals(reversed);
    }
}