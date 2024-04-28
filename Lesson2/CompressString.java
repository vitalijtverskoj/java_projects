package Lesson2;

/*
* 📌 Напишите метод, который сжимает строку.
* 📌 Пример: вход aaaabbbcdd.
* результат a4b3c1d2.
 */
public class CompressString {
    public static void main(String[] args) {
        String alf = "aaaabbbcdd";

        System.out.println(comressString(alf));
    }

    public static String comressString(String abc) {
        int count = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < abc.length(); i++) {
            if (abc.charAt(i) == abc.charAt(i-1)){
                count ++;
            } else {
                sb.append(abc.charAt(i-1)).append(count);
                count = 1;
            }
        }
        sb.append(abc.charAt(abc.length()-1)).append(count);
        return sb.toString();
    }
}
