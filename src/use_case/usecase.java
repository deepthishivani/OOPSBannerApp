package use_case;

class CharacterPattern {

    String[] pattern;

    CharacterPattern(String[] pattern) {
        this.pattern = pattern;
    }

    String getLine(int i) {
        return pattern[i];
    }

}

public class usecase {

    public static void main(String[] args) {

        CharacterPattern O = new CharacterPattern(new String[]{
                "*******",
                "*     *",
                "*     *",
                "*     *",
                "*******"
        });

        CharacterPattern P = new CharacterPattern(new String[]{
                "*****",
                "*   *",
                "*****",
                "*",
                "*"
        });

        CharacterPattern S = new CharacterPattern(new String[]{
                "******",
                "*     *",
                "*****",
                "*",
                "******"
        });

        for (int i = 0; i < 5; i++) {
            System.out.println(
                    O.getLine(i) + "   " +
                    O.getLine(i) + "   " +
                    P.getLine(i) + "   " +
                    S.getLine(i)
            );
        }
    }
}
