package Action;

import java.util.Arrays;

public class UniqueCount extends Action<Integer> {
    @Override
    public void execute() {
        if (input.isEmpty()) output = 0;
        else output = (int) Arrays.stream(input.split("")).distinct().count();
    }
}
