package use_case;

public class usecase {

    static String[] banner = {
        "*******   *******   *****   ******",
        "*     *   *     *   *   *   *     *",
        "*     *   *     *   *   *   *****",
        "*     *   *     *   *   *   *",
        "*******   *******   *****   ******"
    };

    public static void main(String[] args) {

        printBanner();

    }

    static void printBanner() {

        for (String line : banner) {
            System.out.println(line);
        }

    }
}
