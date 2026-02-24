package use_case;
public class use_case6 {

    static String[] patternO() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    static String[] patternP() {
        return new String[]{
                "****** ",
                "*     *",
                "****** ",
                "*      ",
                "*      "
        };
    }

    static String[] patternS() {
        return new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        };
    }


    static String[] renderWord(String[][] letters) {
        String[] banner = new String[5];

        for (int row = 0; row < 5; row++) {
            String line = "";
            for (int col = 0; col < letters.length; col++) {
                line += letters[col][row] + "  ";
            }
            banner[row] = line;
        }
        return banner;
    }

    public static void main(String[] args) {

        String[][] letters = {
                patternO(),
                patternO(),
                patternP(),
                patternS()
        };

        String[] banner = renderWord(letters);

        for (String line : banner) {
            System.out.println(line);
        }
    }
}
