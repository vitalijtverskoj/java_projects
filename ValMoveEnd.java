import java.util.Arrays;

/**
 * Дан массив nums = [3,2,2,3] и число val = 3.
 * Если в массиве есть числа, равные заданному, нужно перенести
 * эти элементы в конец массива.
 * Таким образом, первые несколько (или все) элементов массива
 * должны быть отличны от заданного, а остальные - равны ему.
 */
public class ValMoveEnd {

    public static void main(String[] args) {
        int[] array = { 3, 3, 2, 3, 2, 3, 1, 10, 5, 3, 0 };
        int val = 1;
        int indexMove = array.length - 1;
        for (int i = 0; i < indexMove; i++) {
                while (array[indexMove] == val && i < indexMove) {
                    indexMove--;
                }
                if (array[i] == val ) {
                    array[i] = array[indexMove];
                    array[indexMove] = val;
                    
                }
        }
        System.out.println(Arrays.toString(array));
        // for (int elem : array) {
        //     System.out.print(elem + " ");
        // }
    }
}