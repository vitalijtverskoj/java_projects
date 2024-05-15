package Lesson4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/* 
1) Написать метод, который принимает массив элементов, помещает их в стэк
и выводит на консоль содержимое стэка.
2) Написать метод, который принимает массив элементов, помещает их в
очередь и выводит на консоль содержимое очереди.
 */
public class CreateShowStack {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        showStack(array);
        System.out.println();
        showQueue(array);
    }
    public static void showStack(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int elem : arr) {
            stack.push(elem);
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop()+ " ");
        }
    }

    public static void showQueue(int[] arr) {
        Queue<Integer> queue = new LinkedList<>();
        for (int elem : arr) {
            queue.add(elem);
        }
        while (!queue.isEmpty()) {
            System.out.print(queue.remove()+ " ");
        }
    }
}
