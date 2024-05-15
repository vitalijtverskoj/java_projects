package Lesson4;

import java.util.LinkedList;
import java.util.Scanner;

/* 
Реализовать консольное приложение, которое:
1. Принимает от пользователя строку вида
text~num
2. Нужно рассплитить строку по ~, сохранить text в связный список на
позицию num.
3. Если введено print~num, выводит строку из позиции num в связном
списке и удаляет её из списка.
 */

public class PrintTextOnNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> ll = new LinkedList<>();
        while (true) {
            System.out.println("Введите текст вида: text~num, для сохранения в список: ");
            System.out.println("print~num for printing and removing the element");
            System.out.println("print q to exit");
            String input = scanner.nextLine();
            if (input.equals("q")) {
                break;
            }
            String[] splittedInput = input.split("~");
            String text = splittedInput[0];
            int num = Integer.parseInt(splittedInput[1]);
            if (text.equals("print")) {
                if (num >= 0 && num < ll.size()) {
                    System.out.println(ll.get(num));
                    ll.remove(num);
                } else {
                    System.out.println("The position is not correct");
                }
                System.out.println(ll);
            } else {
                if (num >= 0 && num <= ll.size()) {
                    ll.add(num, text);
                } else {
                    System.out.println("The position is not correct");
                }
                System.out.println(ll);
            }
        }
        scanner.close();
    }
}
