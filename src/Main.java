import java.util.HashMap;
import java.util.Map;

public class Main {
    public final static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
    static int max = 0;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        String newText = text.toLowerCase();

        for (int i = 0; i < newText.length(); i++) {
            char x = newText.charAt(i);
            boolean letter = Character.isLetter(x);
            if (!letter) {
                continue;
            }
            if (map.get(x) == null) {
                map.put(x, 1);
            } else {
                int p = map.get(x);
                p++;
                map.put(x, p);
            }
        }

        System.out.println("Наиболлее употребляемый символ - " + maxValue(map) + ", а наименее употребляемый - " + minValue(map));
    }

    private static char maxValue(Map<Character, Integer> map) {
        char maxEntry = ' ';
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                maxEntry = entry.getKey();
            }
        }
        return maxEntry;
    }

    private static char minValue(Map<Character, Integer> map) {
        char minEntry = ' ';
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() < min) {
                min = entry.getValue();
                minEntry = entry.getKey();
            }
        }
        return minEntry;
    }
}

