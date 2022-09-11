import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException {
        var file = new File("actiontexts.txt");
        var br = new BufferedReader(new FileReader(file));

        String line;
        while ((line = br.readLine()) != null) {
            var tokens = line.split(":");
            if (tokens.length != 2) {
                System.out.println("Invalid format: " + line);
                return;
            }

            var action = tokens[0].toLowerCase();
            var input = tokens[1];
            var output = StringUtil.executeAction(action, input);
            var log = "Text: [" + input + "] ran action [" + action + "] with result: [" + output + "]";
            System.out.println(log);
        }
    }
}
