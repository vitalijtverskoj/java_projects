package Lesson5;
/*
Написать программу, определяющую правильность расстановки скобок в выражении.
Пример 1: a+(d*3) - истина
Пример 2: [a+(1*3) - ложь
Пример 3: [6+(3*3)] - истина
Пример 4: {a}[+]{(d*3)} - истина
Пример 5: <{a}+{(d*3)}> - истина
Пример 6: {a+]}{(d*3)} - ложь
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class CorrectPlacementOfBrackets {
    public static void main(String[] args) {
        String[] arrayStr = { "a+(d*3)", "[a+(1*3)", "[6+(3*3)]", "{a}[+]{(d*3)}", "<{a}+{(d*3)}>", "{a+]}{(d*3)}" };
        for (String string : arrayStr) {
            boolean isCorrectBrackets = checkBrackets(string);
            System.out.println(string + " --> " + isCorrectBrackets);
        }
    }

    public static Map<Character, Character> getBracketsMap() {
        Map<Character, Character> charMap = new HashMap<>();
        charMap.put(')', '(');
        charMap.put(']', '[');
        charMap.put('}', '{');
        charMap.put('>', '<');
        return charMap;
    }

    public static boolean checkBrackets(String str) {
        Map<Character, Character> charMap = getBracketsMap();
        Stack<Character> stack = new Stack<>();
        for(char c: str.toCharArray()) {
            if(charMap.containsValue(c)) {
                stack.push(c);
            }else if(charMap.containsKey(c)){
                if(stack.isEmpty() || stack.pop() != charMap.get(c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
