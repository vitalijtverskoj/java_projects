package Lesson1;
/*
 * Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
максимальное количество подряд идущих 1.
 */
public class MaxOnesArray {
    public static void main(String[] args) {
        int[] array = { 1, 1, 0, 1, 1, 1, 0, 1 };
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                count++;
            } else {
                if (count > maxCount) {
                    maxCount = count;
                }
                count = 0;
            }
        }

        if (count > maxCount) {
            maxCount = count;
        }
        System.out.println(maxCount);
    }

}
