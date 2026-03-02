//UC8
public class OOPSBannerApp {

    // Static inner class to store character patterns
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter for the pattern
        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {
        // Create pattern objects for O, P, S
        CharacterPattern O = new CharacterPattern('O', new String[]{
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        });

        CharacterPattern P = new CharacterPattern('P', new String[]{
            "****** ",
            "*     *",
            "*     *",
            "****** ",
            "*      ",
            "*      ",
            "*      "
        });

        CharacterPattern S = new CharacterPattern('S', new String[]{
            " ***** ",
            "*      ",
            "*      ",
            " ***** ",
            "      *",
            "      *",
            " ***** "
        });

        // Build the OOPS banner using the patterns
        String[] oPattern = O.getPattern();
        String[] pPattern = P.getPattern();
        String[] sPattern = S.getPattern();

        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(oPattern[i] + "  " + oPattern[i] + "  " + pPattern[i] + "  " + sPattern[i]);
        }
    }
}