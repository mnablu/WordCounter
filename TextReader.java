import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*
 Created by Marc Nablu on 9/03/15.
 */
public class TextReader {
    public static String load(String filename) {
        try {
            Scanner scanner = new Scanner(new File(filename));
            StringBuilder builder = new StringBuilder();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                builder.append(line);
                builder.append("\n");

            }
            return builder.toString().trim();
        } catch (IOException e) {
            return "";

        }
    }
}