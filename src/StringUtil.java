import Action.ActionFactory;

public class StringUtil {
    public static Object executeAction(String actionName, String input) {
        var action = ActionFactory.getAction(actionName);
        action.setInput(input);
        action.execute();
        return action.getOutput();
    }

    public static String capitalize(String input) {
        return (String) executeAction("capitalize", input);
    }

    public static String reverse(String input) {
        return (String) executeAction("reverse", input);
    }

    public static Boolean isPalindrome(String input) {
        return (Boolean) executeAction("palindrome", input);
    }

    public static String removeWhitespace(String input) {
        return (String) executeAction("whitespace", input);
    }

    public static Integer uniqueCount(String input) {
        return (Integer) executeAction("unique_count", input);
    }
}
