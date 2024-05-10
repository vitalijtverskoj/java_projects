package Lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.Iterator;

/*
📌 Создать список типа ArrayList<String>.
📌 Поместить в него как строки, так и целые числа.
📌 Пройти по списку, найти и удалить целые числа.
 */
public class CreateArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("abc", "1", "def", "2", "ghi", "3", "jkl", "4"));
        System.out.println(list);
        removeIntsIter(list);
        System.out.println(list);
    }

    // private static void removeInts(List<String> list) {
    //     for (int i = 0; i < list.size(); i++) {
    //         if (isNum(list.get(i))) {
    //             list.remove(i);
    //             i--;
    //         }
    //     }
    // }

    private static void removeIntsIter(List<String> list) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String el = iterator.next();
            if (isNum(el)) {
                iterator.remove();
            }
        }

    }

    private static boolean isNum(String string) {
        try {
            Integer.parseInt(string);
            return true;

        } catch (Exception e) {
            return false;
        }
    }
}
