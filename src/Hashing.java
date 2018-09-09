import java.util.*;

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

    static int nearestRelatedEntries(List<String> words) {
        Map<String, Integer> wordToIndex = new HashMap<>();
        int minDistance = Integer.MAX_VALUE;
        for (int i = 0; i < words.size(); i++) {
            if (!wordToIndex.containsKey(words.get(i))) {
                wordToIndex.put(words.get(i), i);
            } else {
                minDistance = Math.min(i - wordToIndex.get(words.get(i)), minDistance);
                wordToIndex.put(words.get(i), i);
            }
        }
        return minDistance;
    }

    static int longestSubArrayWithDistinctEntries(int[] array) {
        Map<Integer, Integer> mostRecentOccurrence = new HashMap<>();
        int longestDupeFreeSubArrayStartIndex = 0, result = 0;
        for (int i = 0; i < array.length; i++) {
            Integer dupeIndex = mostRecentOccurrence.put(array[i], i);
            if (dupeIndex != null) {
                if (dupeIndex >= longestDupeFreeSubArrayStartIndex) {
                    result = Math.max(result, i - longestDupeFreeSubArrayStartIndex);
                    longestDupeFreeSubArrayStartIndex = dupeIndex + 1;
                }
            }
        }
        result = Math.max(result, array.length - longestDupeFreeSubArrayStartIndex);
        return result;
    }

    static int longestContainedRange(List<Integer> numbers) {
        Set<Integer> unprocessedEntries = new HashSet<>(numbers);
        int maxIntervalSize = 0;
        while (!unprocessedEntries.isEmpty()) {
            int number = unprocessedEntries.iterator().next();
            unprocessedEntries.remove(number);

            int lower = number - 1;
            while (unprocessedEntries.contains(lower)) {
                unprocessedEntries.remove(lower);
                lower--;
            }

            int upper = number + 1;
            while (unprocessedEntries.contains(upper)) {
                unprocessedEntries.remove(upper);
                upper++;
            }
            maxIntervalSize = Math.max(maxIntervalSize, upper - lower - 1);
        }
        return maxIntervalSize;
    }

    static class LRUCache {
        private Map<Integer, Integer> isbnToPrice;

        public LRUCache(int cacheSize) {
            isbnToPrice = new LinkedHashMap<Integer, Integer>(cacheSize, 1.0f, true) {
                @Override
                protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                    return this.size() > cacheSize;
                }
            };
        }

        public Integer lookUp(Integer key) {
            return isbnToPrice.get(key);
        }

        public void insert(Integer key, Integer value) {
            if (!isbnToPrice.containsKey(key)) {
                isbnToPrice.put(key, value);
            }
        }

        public Integer erase(Integer key) {
            return isbnToPrice.remove(key);
        }

    }
}
