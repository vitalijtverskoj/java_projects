package Lesson2;

/*
* 📌Напишите метод, который принимает на вход строку (String) и
* определяет является ли строка палиндромом (возвращает
* boolean значение).
*/
public class IsPalendromStr {
    public static void main(String[] args) {
        System.out.println(isPalendromStr("hello"));
        System.out.println(isPalendromStr("level"));
    }

    public static boolean isPalendromStr(String input) {
        if (input == null || input.length() == 0) {
            return false;
        }
        int left = 0;
        int right = input.length() - 1;
        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;

        }
        return true;
    }

}
