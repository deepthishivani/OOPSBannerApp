package use_case;

public class usecase {

    public static void main(String[] args) {

        String[] O = patternO();
        String[] P = patternP();
        String[] S = patternS();

        for (int i = 0; i < O.length; i++) {
            System.out.println(O[i] + "   " + O[i] + "   " + P[i] + "   " + S[i]);
        }
    }

    static String[] patternO() {
        return new String[]{
                "*******",
                "*     *",
                "*     *",
                "*     *",
                "*******"
        };
    }

    static String[] patternP() {
        return new String[]{
                "*****",
                "*   *",
                "*****",
                "*",
                "*"
        };
    }

    static String[] patternS() {
        return new String[]{
                "******",
                "*     *",
                "*****",
                "*",
                "******"
        };
    }
}
