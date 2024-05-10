package Lesson3;
/*
📌 Заполнить список названиями планет Солнечной
системы в произвольном порядке с повторениями.
📌 Вывести название каждой планеты и количество его
повторений в списке.
Задание состоит из двух блоков
Задание №2.2 (если выполнено первое задание)
📌 Пройти по списку из предыдущего задания и удалить
повторяющиеся элементы. 
*/

import java.util.ArrayList;
// import java.util.Collections;
import java.util.List;

public class NamePlanetsList {
    public static void main(String[] args) {
        List<String> planets = getPlanets();
        System.out.println(planets);
        // getCountPlanets(planets);
        deleteRepeatance(planets);
        System.out.println(planets);
    }

    // private static void getCountPlanets(List<String> planets) {
    //     List<String> sortedLtPlanets = new ArrayList<>(planets);
    //     Collections.sort(sortedLtPlanets);
    //     System.out.println(sortedLtPlanets);
    //     int count = 1;
    //     for (int i = 1; i < sortedLtPlanets.size(); i++) {
    //         if (sortedLtPlanets.get(i).equals(sortedLtPlanets.get(i - 1))) {
    //             count++;
    //         } else {
    //             System.out.println(sortedLtPlanets.get(i - 1) + " -> " + count);
    //             count = 1;
    //         }
    //     }
    //     System.out.println(sortedLtPlanets.getLast() + " -> " + count);
    // }

    private static List<String> getPlanets() {
        List<String> planets = new ArrayList<>();
        planets.add("Меркурий");
        planets.add("Венера");
        planets.add("Земля");
        planets.add("Марс");
        planets.add("Меркурий");
        planets.add("Юпитер");
        planets.add("Сатурн");
        planets.add("Уран");
        planets.add("Земля");
        planets.add("Юпитер");
        planets.add("Нептун");
        planets.add("Венера");
        planets.add("Меркурий");
        return planets;
    }

    public static void deleteRepeatance(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if(list.get(i).equals(list.get(j))){
                    list.remove(j);
                    j--;
                }
            }
        }
    }

    public static void deleteRepeatance2(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = list.size()-1; j > i; j--) {
                if(list.get(i).equals(list.get(j))){
                    list.remove(j);
                }
            }
        }
    }
}
