package Lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateCatalog {
    public static void main(String[] args) {
        List<ArrayList<String>> catalog = new ArrayList<>();
        ArrayList<String> genre1 = new ArrayList<>(Arrays.asList("genre1","book1", "book2","book3"));
        ArrayList<String> genre2 = new ArrayList<>(Arrays.asList("genre2","book4", "book5","book6"));
        ArrayList<String> genre3 = new ArrayList<>(Arrays.asList("genre3","book7", "book8","book9"));
        catalog.addAll(Arrays.asList(genre1,genre2,genre3));
        for (ArrayList<String> genre : catalog) {
            System.out.println(genre);
        }
    }
}
