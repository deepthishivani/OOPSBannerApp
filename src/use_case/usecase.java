package use_case;

import java.util.HashMap;
import java.util.Map;

public class usecase {

    public static void main(String[] args) {

        Map<Character, String[]> patterns = new HashMap<>();

        patterns.put('O', new String[]{
                "*******",
                "*     *",
                "*     *",
                "*     *",
                "*******"
        });

        patterns.put('P', new String[]{
                "*****",
                "*   *",
                "*****",
                "*",
                "*"
        });

        patterns.put('S', new String[]{
                "******",
                "*     *",
                "*****",
                "*",
                "******"
        });

        String word = "OOPS";

        for (int i = 0; i < 5; i++) {

            for (char c : word.toCharArray()) {
                System.out.print(patterns.get(c)[i] + "   ");
            }

            System.out.println();
        }
    }
}
               
