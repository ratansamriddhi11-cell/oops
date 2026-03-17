import java.util.HashMap;
import java.util.Map;

public class UC8 {
    // Centralized HashMap for character → pattern
    private static final Map<Character, String[]> patterns = new HashMap<>();

    static {
        patterns.put('O', new String[]{
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        });
        patterns.put('P', new String[]{
            "****** ",
            "*     *",
            "*     *",
            "****** ",
            "*      ",
            "*      ",
            "*      "
        });
        patterns.put('S', new String[]{
            " ***** ",
            "*     *",
            "*      ",
            " ***** ",
            "      *",
            "*     *",
            " ***** "
        });
    }

    // Function to render any word using the map
    public static void renderBanner(String word) {
        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();
            for (char ch : word.toCharArray()) {
                String[] pattern = patterns.get(ch);
                if (pattern != null) {
                    line.append(pattern[row]).append("   ");
                }
            }
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        String word = "OOPS"; // hardcoded for now
        renderBanner(word);
    }
}