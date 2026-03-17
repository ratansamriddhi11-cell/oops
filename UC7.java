import java.util.HashMap;
import java.util.Map;

public class UC7 {
    // Inner class to store character patterns
    static class CharacterPattern {
        private final String[] pattern;

        public CharacterPattern(String[] pattern) {
            this.pattern = pattern;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    // Centralized map of character → pattern
    static class CharacterPatternMap {
        private static final Map<Character, CharacterPattern> patterns = new HashMap<>();

        static {
            patterns.put('O', new CharacterPattern(new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
            }));
            patterns.put('P', new CharacterPattern(new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
            }));
            patterns.put('S', new CharacterPattern(new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
            }));
        }

        public static CharacterPattern get(char c) {
            return patterns.get(c);
        }
    }

    public static void main(String[] args) {
        String word = "OOPS";

        // Print row by row
        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();
            for (char ch : word.toCharArray()) {
                CharacterPattern cp = CharacterPatternMap.get(ch);
                if (cp != null) {
                    line.append(cp.getPattern()[row]).append("   ");
                }
            }
            System.out.println(line);
        }
    }
}