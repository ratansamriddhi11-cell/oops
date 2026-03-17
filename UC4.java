public class UC4 {
    public static void main(String[] args) {
        // Store each line of the banner in an array
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