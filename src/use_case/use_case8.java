package use_case;

import java.util.HashMap;
import java.util.Map;

public class use_case8 {

    static Map<Character, String[]> buildPatternMap() {
        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        map.put('P', new String[]{
                "****** ",
                "*     *",
                "****** ",
                "*      ",
                "*      "
        });

        map.put('S', new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        });

        return map;
    }

    static void renderViaFunction(String word, Map<Character, String[]> patterns) {
        StringBuilder[] lines = new StringBuilder[5];
        for (int i = 0; i < 5; i++) lines[i] = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            String[] pat = patterns.get(c);
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
        Map<Character, String[]> patterns = buildPatternMap();
        renderViaFunction("OOPS", patterns);
    }
}