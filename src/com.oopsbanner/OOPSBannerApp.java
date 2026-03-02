//UC
import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    public static void main(String[] args) {
        // Create a map to store character patterns
        Map<Character, String[]> charPatterns = new HashMap<>();

        // Add patterns for O, P, S
        charPatterns.put('O', new String[]{
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        });

        charPatterns.put('P', new String[]{
            "****** ",
            "*     *",
            "*     *",
            "****** ",
            "*      ",
            "*      ",
            "*      "
        });

        charPatterns.put('S', new String[]{
            " ***** ",
            "*      ",
            "*      ",
            " ***** ",
            "      *",
            "      *",
            " ***** "
        });

        // The word to render
        String word = "OOPS";

        // Render banner
        for (int i = 0; i < 7; i++) { // 7 lines per letter
            StringBuilder line = new StringBuilder();
            for (char c : word.toCharArray()) {
                line.append(charPatterns.get(c)[i]).append("  "); // Append pattern line
            }
            System.out.println(line);
        }
    }
}