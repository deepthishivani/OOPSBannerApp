package use_case;
public class use_case7 {

    static class CharacterPattern {
        private final char ch;
        private final String[] pattern;

        CharacterPattern(char ch, String[] pattern) {
            this.ch = ch;
            this.pattern = pattern;
        }

        char getCh() {
            return ch;
        }

        String[] getPattern() {
            return pattern;
        }
    }

    static CharacterPattern[] buildLibrary() {
        return new CharacterPattern[]{
                new CharacterPattern('O', new String[]{
                        " ***** ",
                        "*     *",
                        "*     *",
                        "*     *",
                        " ***** "
                }),
                new CharacterPattern('P', new String[]{
                        "****** ",
                        "*     *",
                        "****** ",
                        "*      ",
                        "*      "
                }),
                new CharacterPattern('S', new String[]{
                        " ***** ",
                        "*      ",
                        " ***** ",
                        "      *",
                        " ***** "
                })
        };
    }

    static String[] findPattern(CharacterPattern[] library, char c) {
        for (CharacterPattern cp : library) {
            if (cp.getCh() == c) {
                return cp.getPattern();
            }
        }
        return null; 
    }

    static void renderAndPrint(String word, CharacterPattern[] library) {
        StringBuilder[] lines = new StringBuilder[5];
        for (int i = 0; i < 5; i++) lines[i] = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            String[] pat = findPattern(library, c);

            if (pat == null) continue;

            for (int row = 0; row < 5; row++) {
                lines[row].append(pat[row]).append("  ");
            }
        }

        for (int row = 0; row < 5; row++) {
            System.out.println(lines[row]);
        }
    }

    public static void main(String[] args) {
        CharacterPattern[] library = buildLibrary();
        renderAndPrint("OOPS", library);
    }
}
