public class UC5 {
    public static void main(String[] args) {
        // Build each line with String.join
        String[] bannerLines = {
            String.join("   ", "*****", "*****", "******", "*****"),
            String.join("   ", "*     *", "*     *", "*     *", "*     *"),
            String.join("   ", "*     *", "*     *", "*     *", "*"),
            String.join("   ", "*     *", "*     *", "******", "*****"),
            String.join("   ", "*     *", "*     *", "*", "      *"),
            String.join("   ", "*     *", "*     *", "*", "  *     *"),
            String.join("   ", " *****", " *****", "*", " *****")
        };

        // Loop through the array and print each line
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}