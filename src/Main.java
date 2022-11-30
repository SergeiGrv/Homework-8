import java.util.HashMap;
import java.util.Map;

public class Main {
    public final static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

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

        System.out.println(map);

        int max = 0;
        int min = Integer.MAX_VALUE;
    }
}

