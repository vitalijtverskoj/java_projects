package Lesson6;

import java.util.HashSet;
/*
1. Напишите метод, который заполнит массив из 1000 элементов случайными
числами от 0 до 500
2. Создайте метод, в который передайте заполненный выше массив и с
помощью Set вычислите процент уникальных значений в данном массиве и
верните его в виде числа с плавающей запятой.
Для вычисления процента используйте формулу:
процент уникальных чисел = количество уникальных чисел * 100 / общее
количество чисел в массиве.
 */
import java.util.Random;
import java.util.Set;

public class FillingRandomNum {
    public static void main(String[] args) {
        int[] array = getRandomArray(1000, 0, 500);
        System.out.println(calcPersUniqEl(array));
    }

    public static int[] getRandomArray(int size, int minLim, int maxLim) {
        int[] array = new int[size];
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(minLim, maxLim);
        }
        return array;
    }

    public static double calcPersUniqEl(int[] array) {
        Set<Integer> uniqEl = new HashSet<>();
        for (int el : array) {
            uniqEl.add(el);
        }
        double res = uniqEl.size() * 100.0/ array.length;
        return res;
    }
}
