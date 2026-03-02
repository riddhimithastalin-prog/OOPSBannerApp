// UC4 implementation using array and loop
public class OOPSBannerApp {
    public static void main(String[] args) {
        // Store all banner lines in a String array
        String[] bannerLines = {
            " *****    *****   ******   ***** ",
            "*     *  *     *  *     *  *     *",
            "*     *  *     *  *     *  *     *",
            "*     *  *     *  *     *  *     *",
            "*     *  *     *  ******    ****  ",
            "*     *  *     *  *              *",
            "*     *  *     *  *              *",
            " *****    *****   *          *****"
        };

        // Loop through the array and print each line
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}