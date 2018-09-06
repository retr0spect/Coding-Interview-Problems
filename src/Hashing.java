import java.util.HashMap;
import java.util.Map;

/**
 * Created by Aditya on 9/5/2018.
 */
class Hashing {

    static boolean canFormPalindrome(String string) {
        Map<Character, Integer> charOccurrences = new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
            charOccurrences.merge(string.charAt(i), 1, Integer::sum);
        }
        int odds = 0;
        for (Map.Entry<Character, Integer> p : charOccurrences.entrySet()) {
            if (p.getValue() % 2 != 0 && ++odds > 1) {
                return false;
            }
        }
        return true;
    }

    static boolean anonymousLetter(String letter, String magazine) {
        Map<Character, Integer> charFreq = new HashMap<>();
        for (int i = 0; i < letter.length(); i++) {
            charFreq.merge(letter.charAt(i), 1, Integer::sum);
        }
        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            if (charFreq.containsKey(c)) {
                Integer val = charFreq.get(c);
                if (val == 1) {
                    charFreq.remove(c);
                } else {
                    charFreq.put(c, val - 1);
                }
            }
        }
        return charFreq.isEmpty();
    }
}
