package Action;

public class ActionFactory {
    public static IAction getAction(String action) {
        switch (action) {
            case "palindrome":
                return new IsPalindrome();
            case "reverse":
                return new Reverse();
            case "unique_count":
                return new UniqueCount();
            case "whitespace":
                return new RemoveWhitespace();
            case "capitalize":
                return new Capitalize();
            default:
                throw new IllegalArgumentException("non-existent action: " + action);
        }
    }
}