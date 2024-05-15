package Lesson5;

import java.util.HashMap;
import java.util.Map;

/*
Написать метод, который переведет число из римского формата записи в арабский.
Например, MMXXIV = 2024
'I', 1
'V', 5
'X', 10
'L', 50
'C', 100
'D', 500
'M', 1000
 */

public class NumConverter {
    public static void main(String[] args) {
        String romanNum = "MMXXIV";
        System.out.println(romanToArabicNums(romanNum));

    }

    public static Map<Character, Integer> getRomanArabicDigitMap() {
        Map<Character, Integer> digitsMap = new HashMap<>();
        digitsMap.put('I', 1);
        digitsMap.put('V', 5);
        digitsMap.put('X', 10);
        digitsMap.put('L', 50);
        digitsMap.put('C', 100);
        digitsMap.put('D', 500);
        digitsMap.put('M', 1000);
        return digitsMap;
    }

    public static int romanToArabicNums(String romanNum) {
        Map<Character, Integer> digitsMap = getRomanArabicDigitMap();
        int arabicNum = 0;
        int prevNum = 0;
        for (int i = romanNum.length() - 1; i >= 0; i--) {
            int num = digitsMap.get(romanNum.charAt(i));
            if (num < prevNum) {
                arabicNum -= num;
            } else {
                arabicNum += num;
            }
            prevNum = num;
        }
        return arabicNum;
    }
}
