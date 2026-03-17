public class UC6 {
    // Static helper methods for each character
    public static String[] getO() {
        return new String[]{
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };
    }

    public static String[] getP() {
        return new String[]{
            "****** ",
            "*     *",
            "*     *",
            "****** ",
            "*      ",
            "*      ",
            "*      "
        };
    }

    public static String[] getS() {
        return new String[]{
            " ***** ",
            "*     *",
            "*      ",
            " ***** ",
            "      *",
            "*     *",
            " ***** "
        };
    }

    public static void main(String[] args) {
        // Build banner using static methods
        String[][] banner = { getO(), getO(), getP(), getS() };

        // Print row by row
        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();
            for (String[] letter : banner) {
                line.append(letter[row]).append("   "); // spacing between letters
            }
            System.out.println(line);
        }
    }
}