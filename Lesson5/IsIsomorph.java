package Lesson5;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/*
Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными
и false, если нет. Строки изоморфны, если одну букву в первом слове можно заменить на
некоторую букву во втором слове, при этом
1. повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением
порядка следования. (Например, add - egg изоморфны)
2. буква может не меняться, а остаться такой же. (Например, note - code)
Пример 1:
Input: s = "foo", t = "bar"
Output: false
Пример 2:
Input: s = "paper", t = "title"
Output: true
 */

public class IsIsomorph {
    public static void main(String[] args) {
        String word1 = "bar";
        String word2 = "foo";
        System.out.println(isIsomorphic(word1, word2));
    }

    public static boolean isIsomorphic(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        if (word1.equals(word2)) {
            return true;
        }
        Map<Character, Character> charMap = new HashMap<>();

        for (int i = 0; i < word1.length(); i++) {
            char c1 = word1.charAt(i);
            char c2 = word2.charAt(i);
            if (charMap.containsKey(c1) && charMap.get(c1) != c2) {
                return false;
            } else if (charMap.containsValue(c2)) {
                Collection<Character> collection = charMap.keySet();
                Object desiredObject = c2;
                for (Character key : collection) {
                    Object obj = charMap.get(key);
                    if (desiredObject.equals(obj)) {
                        if (key != c1) {
                            return false;
                        }
                    }
                }
            } else {
                charMap.put(c1, c2);
            }
        }
        return true;
    }
}
