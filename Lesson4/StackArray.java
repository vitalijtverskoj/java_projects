package Lesson4;

/* 
Реализовать стэк с помощью массива.
Нужно реализовать методы:
size(), empty(), push(), peek(), pop(). 
*/

public class StackArray {

    private static int capacity;
    private static int[] array;
    private static int topIdx;

    public static void main(String[] args) {
        capacity = 5;
        array = new int[capacity];
        topIdx = -1;
        System.out.println(size());
        System.out.println(empty());
        push(5);
        push(6);
        push(21);
        System.out.println(size());
        System.out.println(empty());
        System.out.println(peek());
        System.out.println(pop());
        System.out.println(size());
    }

    public static int size() {
        return topIdx + 1;
    }

    public static Boolean empty(){
        return topIdx == -1;
    }

    public static void push(int num){
        array[++topIdx] = num;
    }

    public static int peek(){
        return array[topIdx];
    }
    public static int pop(){
        return array[topIdx--];
    }
}
