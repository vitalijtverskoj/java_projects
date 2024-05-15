package Lesson4;

import java.util.ArrayList;
import java.util.LinkedList;

/* 
📌 повторить теорию о LinkedList, Queue, Dequeue, PriorityQueue, Stack;
📌 получить практические навыки в использовании связных списков и Stack;
📌 научить составлять программу с использованием коллекций на примере связных
списков. 
*/

public class CompareLists {

    public static void main(String[] args) {
        int size = 200_000;

        System.out.println("Добавление элемента в конец списка: ");
        long start = System.currentTimeMillis();
        createArrayListAddLast(size);
        System.out.println(System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        createLinkedListAddLast(size);
        System.out.println(System.currentTimeMillis() - start);

        System.out.println("Добавление элемента в начало списка: ");
        start = System.currentTimeMillis();
        createArrayListAddFirst(size);
        System.out.println(System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        createLinkedListAddFirst(size);
        System.out.println(System.currentTimeMillis() - start);

        System.out.println("Добавление элемента в середину списка: ");
        start = System.currentTimeMillis();
        createArrayListAddMiddle(size);
        System.out.println(System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        createLinkedListAddMiddle(size);
        System.out.println(System.currentTimeMillis() - start);

    }

    public static ArrayList<Integer> createArrayListAddLast(int size) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arrayList.addLast(i);
        }
        return arrayList;
    }

    public static LinkedList<Integer> createLinkedListAddLast(int size) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            linkedList.addLast(i);
        }
        return linkedList;
    }

    public static ArrayList<Integer> createArrayListAddFirst(int size) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arrayList.addFirst(i);
        }
        return arrayList;
    }

    public static LinkedList<Integer> createLinkedListAddFirst(int size) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            linkedList.addFirst(i);
        }
        return linkedList;
    }

    public static ArrayList<Integer> createArrayListAddMiddle(int size) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arrayList.add(arrayList.size() / 2, i);
        }
        return arrayList;
    }

    public static LinkedList<Integer> createLinkedListAddMiddle(int size) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            linkedList.add(linkedList.size() / 2, i);
        }
        return linkedList;
    }
}
