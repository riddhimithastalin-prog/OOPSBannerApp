public class OOPSBannerApp {
    public static void main(String[] args) {
        // UC5: Combine array declaration and initialization with String.join()
        String[] bannerLines = {
            String.join("", " *****    *****   ******   ***** "),
            String.join("", "*     *  *     *  *     *  *     *"),
            String.join("", "*     *  *     *  *     *  *     *"),
            String.join("", "*     *  *     *  *     *  *     *"),
            String.join("", "*     *  *     *  ******    ****  "),
            String.join("", "*     *  *     *  *              *"),
            String.join("", "*     *  *     *  *              *"),
            String.join("", " *****    *****   *          *****")
        };

        // Loop through the array and print each line
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}